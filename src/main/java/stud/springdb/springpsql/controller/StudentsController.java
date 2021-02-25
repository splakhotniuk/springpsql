package stud.springdb.springpsql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentsController {
    @GetMapping("/students")
    public String getStudentsPage() {
        System.out.println("Control in students Controller!!!!!!!!!!!!!!!!!!!!!!!");
        return "students_page";
    }

    @GetMapping("/studentstab")
    @ResponseBody
    public String getStudentsTab() {
        System.out.println("Control in studenttstab Controller"); 
        return "Students tab will be here";
    }
}