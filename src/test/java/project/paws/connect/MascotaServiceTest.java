package project.paws.connect;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import project.paws.connect.model.Mascota;
import project.paws.connect.service.MascotaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MascotaServiceTest {

    @InjectMocks
    private MascotaService mascotaService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAgregarMascota() {
        Mascota mascota = new Mascota();
        mascota.setNombre("Max");
        mascota.setTipo("Perro");

        Mascota mascotaGuardada = mascotaService.agregarMascota(mascota);

        assertNotNull(mascotaGuardada);
        assertEquals("Max", mascotaGuardada.getNombre());
        assertEquals("Perro", mascotaGuardada.getTipo());
    }


}