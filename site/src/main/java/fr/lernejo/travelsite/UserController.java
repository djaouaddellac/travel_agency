package fr.lernejo.travelsite;
import fr.lernejo.travelsite.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {
    private final ArrayList<User> user;
    public UserController(ArrayList<User> user) {
        this.user = user;
    }

    @PostMapping(value = "/api/inscription")
    public User add(@RequestBody User user) {
        return user;
    }

    @GetMapping("/api/travels")
    public Iterable<User> getUser(@RequestParam String userName) {
        ArrayList<User> User = new ArrayList<User>();
        return user;
    }
}
