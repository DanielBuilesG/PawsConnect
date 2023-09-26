package project.paws.connect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.paws.connect.model.Pet;
import project.paws.connect.service.PetService;

import java.util.List;


// revisar un controlador para buscar mascotas

// API debe incluir versionamiento /v1/mascota

//cambiar idioma del codigo

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping("/{id}")
    public Pet getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }

    @PostMapping
    public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
    }
}