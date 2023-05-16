package clay.more.contollers;

import clay.more.db.DBManager;
import clay.more.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model){
        List<Student> students = DBManager.getStudents();
        model.addAttribute("studentter", students);
        return "home";
    }

    @GetMapping("/addStudent")
    public String addStudentPage(){
        return "add-student";
    }

    @PostMapping("/addStudent")
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }
}
