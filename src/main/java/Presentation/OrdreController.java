package Presentation;

import Application.PizzaService;
import Domain.PizzaType;
import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class OrdreController {
    private final PizzaService service;

    public OrdreController(PizzaService service) {
        this.service = service;
    }

    @GetMapping
    public String index(Model model) {
        List<PizzaType> pizzaTypes = service.getPizzaTypes();
        return "ordre";
    }
    @GetMapping ("/create")
    public String create(Model model) {
        return "create";
    }
    @PostMapping ("/create")
    public String create(@ModelAttribute PizzaType pizzaType) {
     return "index";
    }
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable int id, org.springframework.ui.Model model) {
        model.addAttribute("PizzaType", service.getPizzaType(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String updateDictator(@ModelAttribute PizzaType pizzaType) {
        service.updatePizzaType(pizzaType);
        return "redirect:/PizzaTypes";
    }
    @GetMapping("/delete/{id}")
    public String deletePizzaType(@PathVariable int id) {
        service.deletePizzaType(id);
        return "redirect:/PizzaTypes";
    }
}