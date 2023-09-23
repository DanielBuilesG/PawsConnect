package project.paws.connect.service;

import project.paws.connect.model.Mascota;
import project.paws.connect.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {
    private Map<Long, Usuario> usuarios = new HashMap<>();
    private Long idContador = 1L;

    public Usuario agregarUsuario(Usuario usuario) {
        usuario.setId(idContador);
        usuarios.put(idContador, usuario);
        idContador++;
        return usuario;
    }

    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarios.get(id);
    }

    public void asociarMascotaAUsuario(Long usuarioId, Mascota mascota) {
        Usuario usuario = usuarios.get(usuarioId);
        if (usuario != null) {
            mascota.setUsuarioId(usuarioId);
            usuario.getMascotas().put(mascota.getId(), mascota);
        }
    }


}