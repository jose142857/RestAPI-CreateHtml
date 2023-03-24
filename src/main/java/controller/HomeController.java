package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    private List<User> listUser = new ArrayList<>();

    @GetMapping("")
    public User index() {

        User user = new User();
        user.setName("thi");
        user.setAge(18);

        return user;
    }

    @GetMapping("/hello")
    public List<User> index2() {
        User user = new User();
        user.setName("thang");
        user.setAge(18);

        User user2 = new User();
        user.setName("hoa");
        user.setAge(20);

        listUser.add(user);
        listUser.add(user2);

        return listUser;
    }


}
