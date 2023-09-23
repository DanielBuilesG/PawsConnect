package com.example.demo.controller;

import com.example.demo.model.Mascota;
import com.example.demo.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public List<Mascota> obtenerTodasLasMascotas() {
        return mascotaService.obtenerTodasLasMascotas();
    }

    @GetMapping("/{id}")
    public Mascota obtenerMascotaPorId(@PathVariable Long id) {
        return mascotaService.obtenerMascotaPorId(id);
    }

    @PostMapping
    public Mascota agregarMascota(@RequestBody Mascota mascota) {
        return mascotaService.agregarMascota(mascota);
    }
}
