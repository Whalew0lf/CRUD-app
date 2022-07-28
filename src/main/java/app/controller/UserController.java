package app.controller;

import app.model.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public String getUsers(ModelMap modelMap){
        System.out.println("АААААА");
        //List<User> users = userService.getAllUsers();

        //model.addAttribute("users", users);
        return "user";
    }
}
