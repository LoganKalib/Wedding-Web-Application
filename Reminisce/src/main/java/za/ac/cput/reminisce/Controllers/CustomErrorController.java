package za.ac.cput.reminisce.Controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Custom logic can be added here if needed
        return "error-404";
    }

    //public String getErrorPath() {
    //    return "/error";
    //}
}
