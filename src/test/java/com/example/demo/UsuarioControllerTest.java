package com.example.demo;


import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.example.demo.controller.MascotaController;
import com.example.demo.controller.UsuarioController;
import com.example.demo.model.Mascota;
import com.example.demo.model.Usuario;
import com.example.demo.service.MascotaService;
import com.example.demo.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;
public class UsuarioControllerTest {
    private MockMvc mockMvc;

    @Mock
    private UsuarioService usuarioService;

    @InjectMocks
    private UsuarioController usuarioController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(usuarioController).build();
    }

    @Test
    public void testObtenerUsuarioPorId() throws Exception {
        Long usuarioId = 1L;
        Usuario usuarioSimulado = new Usuario();
        usuarioSimulado.setId(usuarioId);
        usuarioSimulado.setNombre("Juan");
        usuarioSimulado.setCorreoElectronico("juan@example.com");

        when(usuarioService.obtenerUsuarioPorId(usuarioId)).thenReturn(usuarioSimulado);

        mockMvc.perform(get("/usuarios/{id}", usuarioId))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) jsonPath("$.id", is(usuarioId.intValue())))
                .andExpect((ResultMatcher) jsonPath("$.nombre", is("Juan")))
                .andExpect((ResultMatcher) jsonPath("$.correoElectronico", is("juan@example.com")));
    }

}