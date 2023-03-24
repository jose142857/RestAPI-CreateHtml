package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import model.User;

@Controller
@RequestMapping("/")
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "index";
    }


    @GetMapping("/user")
    public String hello2(Model model){

        User user = new User();
        user.setName("thi");
        user.setAge(18);

        model.addAttribute("user", user);

        return "index";
    }

    @GetMapping("/users")
    public String listUser(){
        return "index";
    }
}
