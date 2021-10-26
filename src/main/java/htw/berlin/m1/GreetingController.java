package htw.berlin.m1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Model model) {
        model.addAttribute("attr", name);
        return "greeting";
    }

    @GetMapping("/queryparam")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            @RequestParam(name="par2", required=false) String par2,
            Model model) {
        model.addAttribute("attr", name+par2);
        return "greeting";
    }
    @GetMapping("/path/param/{name}/{par2}")
    public String greeting2(
            @PathVariable(name="name") String name,
            @PathVariable(name="par2") String par2,
            Model model) {
        model.addAttribute("attr", name+par2);
        return "greeting";
    }

}
