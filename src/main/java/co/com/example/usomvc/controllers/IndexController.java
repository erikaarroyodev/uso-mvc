package co.com.example.usomvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("titulo", "Titulo de pagina");
        model.addAttribute("saludo", "Hola Mundo!");
        return "index";
    }

    @ModelAttribute("serie")
    public String getSerie() {
        return "Game of Thrones";
    }
}
