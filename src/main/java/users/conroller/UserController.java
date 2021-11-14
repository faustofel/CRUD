package users.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import users.model.User;
import users.service.UserService;

@Controller
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String getUsersPage(Model model){
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("adduser", new User("NAME", "LASTNAME", (byte) 120));
        return "users";
    }

    @PostMapping("")
    public String saveUser(@ModelAttribute("adduser") User user){
        userService.addUser(user);
        return "redirect:/users";
    }

    @PatchMapping("{id}/edit")
    public String editUser(@PathVariable("id") long id, Model model){
        model.addAttribute("adduser", userService.getUserById(id));
        return "edit";
    }

    @PatchMapping("")
    public String editUser(@ModelAttribute("adduser") User user){
        userService.editUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.removeUserById(id);
        return "redirect:/users";
    }
}
