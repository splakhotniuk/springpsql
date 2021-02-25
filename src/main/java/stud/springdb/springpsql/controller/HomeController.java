package stud.springdb.springpsql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        System.out.println("Control in HomeController!!!!!!!!!!!!!!!!!!!!!!!");
        return "home";
    }
}
