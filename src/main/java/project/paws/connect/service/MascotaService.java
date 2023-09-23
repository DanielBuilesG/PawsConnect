package project.paws.connect.service;

import project.paws.connect.model.Mascota;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService {
    private List<Mascota> mascotas = new ArrayList<>();
    private Long idContador = 1L;

    public List<Mascota> obtenerTodasLasMascotas() {
        return mascotas;
    }

    public Mascota agregarMascota(Mascota mascota) {
        mascota.setId(idContador);
        mascotas.add(mascota);
        idContador++;
        return mascota;
    }

    public Mascota obtenerMascotaPorId(Long id) {
        return mascotas.stream().filter(m -> m.getId().equals(id)).findFirst().orElse(null);
    }
}