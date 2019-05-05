package com.example.demo6.dd;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class Control {
    private final Repos Intermapper;

    @Autowired
    public Control(Repos Intermapper) {
        this.Intermapper = Intermapper;
    }

    @ModelAttribute("name")
    public String name() {
        Inter result = Intermapper.findFirst();
        if (result != null)
            return result.getName();
        return "Adil";
    }

    @RequestMapping
    public String greeting() {
        return "index";
    }
}