package za.ac.cput.reminisce.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class CustomerHomeController {

    @GetMapping("/")
    public String displayHome(){
        return "home";
    }
}
