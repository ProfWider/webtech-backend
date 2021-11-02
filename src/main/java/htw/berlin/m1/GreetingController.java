package htw.berlin.m1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class GreetingController {

    @Autowired
    private Environment env;

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("attr", "World");
        return "greeting";
    }

//    @GetMapping("/queryparam")
//    public String queryparam(
//            @RequestParam(name="envar", required=false) String envar,
//            Model model) {
//        String enval = Optional.ofNullable(env.getProperty(envar)).orElse("Environment variable not found");
//        model.addAttribute("attr", enval);
//        return "greeting";
//    }

    @GetMapping("/path/param/{name}/{par2}")
    public String pathparam(
            @PathVariable(name="name") String name,
            @PathVariable(name="par2") String par2,
            Model model) {
        model.addAttribute("attr", name+par2);
        return "greeting";
    }

}
