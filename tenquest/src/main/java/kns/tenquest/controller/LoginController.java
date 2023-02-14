package kns.tenquest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String joinUserForm(){
        return "login";
    }

    @PostMapping("/login/in")
    public String joinUserPro(String user, String pw){
        System.out.println(user);
        System.out.println(pw);

        return "";
    }
}
