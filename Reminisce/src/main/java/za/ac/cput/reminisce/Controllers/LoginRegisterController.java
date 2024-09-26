package za.ac.cput.reminisce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import za.ac.cput.reminisce.Factory.CustomerFactory;
import za.ac.cput.reminisce.Factory.WeddingFactory;
import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Models.RequestModels.WeddingModel;
import za.ac.cput.reminisce.Models.RequestModels.loginModel;
import za.ac.cput.reminisce.Models.RequestModels.registerModel;
import za.ac.cput.reminisce.Models.Wedding;
import za.ac.cput.reminisce.Services.CustomerService;
import org.springframework.validation.BindingResult;
import za.ac.cput.reminisce.Services.WeddingService;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
@SessionAttributes("customer")
public class LoginRegisterController {

    private final CustomerService customerService;
    private final WeddingService weddingService;

    @Autowired
    public LoginRegisterController(CustomerService customerService, WeddingService weddingService) {
        this.customerService = customerService;
        this.weddingService = weddingService;
    }

    @GetMapping("/login")
    public String displayLogin(Model model) {
        model.addAttribute("loginModel", new loginModel());
        model.addAttribute("registerModel", new registerModel());
        return "login";
    }

    @PostMapping("/processRegistration")
    public String processRegistration(registerModel customer, Model model) {
        Customer c1 = CustomerFactory.buildCustomer(customer.getEmail(), customer.getPassword(), customer.getName(), customer.getSurname());
        Customer c2 = customerService.create(c1);
        System.out.println(c2);
        return this.displayLogin(model);
    }

    @PostMapping("/processLogin")
    public String processLogin(loginModel loginModel, RedirectAttributes redirectAttributes) {
        Customer c1 = CustomerFactory.buildCustomer(loginModel.getEmail(), loginModel.getPassword());
        Customer c2;

        if (c1 != null) {
            c2 = customerService.validateLogin(c1.getEmail(), c1.getPassword());
            if (c2 != null) {
                redirectAttributes.addFlashAttribute("customer", c2);
                return "redirect:/home";
            }
        }
        redirectAttributes.addFlashAttribute("loginModel", new loginModel());
        redirectAttributes.addFlashAttribute("registerModel", new registerModel());
        return "redirect:/login";
    }

    @GetMapping("/contact")
    public String displayContact() {
        return "contact";
    }

    @GetMapping("/about")
    public String displayAbout() {
        return "about";
    }

    @GetMapping("/home")
    public String displayHome(Model model) {
        Customer customer = (Customer) model.getAttribute("customer");
        System.out.println(customer);
        return "home";
    }

    @GetMapping("/manageEvent")
    public String displayManageEvent(Model model) {
        Customer c1 = (Customer) model.getAttribute("customer");
        if (c1 == null) {
            return "redirect:/login";
        }
        System.out.println(c1);
        model.addAttribute("customer", c1);
        model.addAttribute("event", new WeddingModel());
        return "manage-events";
    }

    @PostMapping("/createEvent")
    public String createEvent(@ModelAttribute("event") WeddingModel event, Model model, RedirectAttributes redirectAttributes) {
        System.out.println("Event object before saving: " + event);

        Customer c1 = (Customer) model.getAttribute("customer");
        WeddingModel weddingAssigned = event.setOrgId(c1);
        System.out.println("Wedding after assignment: " + weddingAssigned);
        Wedding obj = WeddingFactory.buildWedding(weddingAssigned.getOrgId(), weddingAssigned.getBrideName(), weddingAssigned.getBrideSurname(), weddingAssigned.getGroomName(), weddingAssigned.getGroomSurname(), weddingAssigned.getVenueName(), weddingAssigned.getVenueAddress(), weddingAssigned.getDate(), weddingAssigned.getStartTime(), weddingAssigned.getNoOfTables(), weddingAssigned.getPrimaryColor());
        if(obj == null){
            return "redirect:/manageEvent";
        }

        weddingService.create(obj);
        redirectAttributes.addFlashAttribute("customer", c1);
        redirectAttributes.addFlashAttribute("event", new WeddingModel());

        return "redirect:/manageEvent";
    }

    @GetMapping("/editEvent")
    @ResponseBody
    public Map<String, Boolean> getCurrentEvent(Model model){
        Customer c1 = (Customer) model.getAttribute("customer");
        Wedding obj = weddingService.findByOrgId(c1);

        Map<String, Boolean> response = new HashMap<>();
        response.put("eventExists", obj != null);

        return response;
    }
}