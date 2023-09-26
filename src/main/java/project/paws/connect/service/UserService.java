package project.paws.connect.service;

import project.paws.connect.model.User;
import project.paws.connect.model.Pet;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<Long, User> users = new HashMap<>();
    private Long idCounter = 1L;

    public User addUser(User user) {
        user.setId(idCounter);
        users.put(idCounter, user);
        idCounter++;
        return user;
    }

    public User getUserById(Long id) {
        return users.get(id);
    }

    public void associatePetToUser(Long userId, Pet pet) {
        User user = users.get(userId);
        if (user != null) {
            pet.setUserId(userId);
            user.getPets().put(pet.getId(), pet);
        }
    }
}
