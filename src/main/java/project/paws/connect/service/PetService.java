package project.paws.connect.service;

import project.paws.connect.model.Pet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
    private List<Pet> pets = new ArrayList<>();
    private Long idCounter = 1L;

    public List<Pet> getAllPets() {
        return pets;
    }

    public Pet addPet(Pet pet) {
        pet.setId(idCounter);
        pets.add(pet);
        idCounter++;
        return pet;
    }

    public Pet getPetById(Long id) {
        return pets.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}