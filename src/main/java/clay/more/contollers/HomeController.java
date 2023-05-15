package clay.more.contollers;

import clay.more.db.DBManager;
import clay.more.models.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model){
        List<Item> items = DBManager.getItems();
        model.addAttribute("zattar", items);
        return "home";
    }

    @GetMapping("/addItem")
    public String addItemPage(){
        return "add-item";
    }

    @PostMapping("/addItem")
    public String addItem(Item item){
        DBManager.addItem(item);
        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String itemDetails(@PathVariable Long id, Model model){
        Item item = DBManager.getItemById(id);
        model.addAttribute("item", item);
        return "details";
    }
}
