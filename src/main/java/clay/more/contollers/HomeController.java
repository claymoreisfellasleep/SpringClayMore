package clay.more.contollers;

import clay.more.db.DBManager;
import clay.more.models.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model){
        List<Item> items = DBManager.getItems();
        model.addAttribute("zattar", items);
        return "home";
    }
}
