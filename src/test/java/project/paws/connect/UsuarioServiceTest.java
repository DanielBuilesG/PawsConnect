package project.paws.connect;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import project.paws.connect.model.Usuario;
import project.paws.connect.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UsuarioServiceTest {


    @InjectMocks
    private UsuarioService usuarioService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAgregarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setCorreoElectronico("juan@example.com");


        Usuario usuarioGuardado = usuarioService.agregarUsuario(usuario);

        assertNotNull(usuarioGuardado);
        assertEquals("Juan", usuarioGuardado.getNombre());
        assertEquals("juan@example.com", usuarioGuardado.getCorreoElectronico());
    }

    // Agrega más pruebas para los otros métodos de UsuarioService
}
