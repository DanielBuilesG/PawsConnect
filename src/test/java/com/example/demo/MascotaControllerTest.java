package com.example.demo;


import com.example.demo.controller.MascotaController;
import com.example.demo.model.Mascota;
import com.example.demo.service.MascotaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class MascotaControllerTest {
    private MockMvc mockMvc;

    @Mock
    private MascotaService mascotaService;

    @InjectMocks
    private MascotaController mascotaController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(mascotaController).build();
    }

    @Test
    public void testObtenerTodasLasMascotas() throws Exception {
        List<Mascota> mascotasSimuladas = new ArrayList<>();

        mascotasSimuladas.add(new Mascota("Max", "Perro"));
        when(mascotaService.obtenerTodasLasMascotas()).thenReturn(mascotasSimuladas);

        mockMvc.perform(get("/mascotas"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(mascotasSimuladas.size())))
                .andExpect((ResultMatcher) jsonPath("$[0].nombre", is("Max")))
                .andExpect((ResultMatcher) jsonPath("$[0].tipo", is("Perro")));
    }

    @Test
    public void testObtenerMascotaPorId() throws Exception {
        Long mascotaId = 1L;

        Mascota mascotaSimulada = new Mascota();
        mascotaSimulada.setId(mascotaId);
        mascotaSimulada.setNombre("Buddy");
        mascotaSimulada.setTipo("Perro");

        when(mascotaService.obtenerMascotaPorId(mascotaId)).thenReturn(mascotaSimulada);


        mockMvc.perform(get("/mascotas/{id}", mascotaId))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.id", is(mascotaSimulada.getId().intValue())))
                .andExpect((ResultMatcher) jsonPath("$.nombre", is(mascotaSimulada.getNombre())))
                .andExpect((ResultMatcher) jsonPath("$.tipo", is(mascotaSimulada.getTipo())));
    }
    
}