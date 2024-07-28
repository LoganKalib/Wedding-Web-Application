package za.ac.cput.reminisce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import za.ac.cput.reminisce.Factory.CustomerFactory;
import za.ac.cput.reminisce.Models.Customer;
import za.ac.cput.reminisce.Models.RequestModels.loginModel;
import za.ac.cput.reminisce.Models.RequestModels.registerModel;
import za.ac.cput.reminisce.Services.CustomerService;

@Controller
@RequestMapping("/login")
public class LoginRegisterController {

    private CustomerService customerService;


    @Autowired
    public LoginRegisterController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/")
    public String displayLogin(Model model){
        model.addAttribute("loginModel",new loginModel());
        model.addAttribute("registerModel", new registerModel());
        return "login";
    }

    @PostMapping("/processRegistration")
    public String processRegistration(registerModel customer, Model model){
        Customer c1 = CustomerFactory.buildCustomer(customer.getEmail(), customer.getPassword(), customer.getName(), customer.getSurname());
        Customer c2 = customerService.create(c1);
        System.out.println(c2);

        return this.displayLogin(model);
    }


    @PostMapping("/processLogin")
    public String processLogin(loginModel loginModel, Model model){
        Customer c1 = CustomerFactory.buildCustomer(loginModel.getEmail(), loginModel.getPassword());

        if(c1 != null){
            if(customerService.validateLogin(c1.getEmail(), c1.getPassword()) !=null){
                return this.displayHome(loginModel);
            }
        }

        model.addAttribute("loginModel",new loginModel());
        model.addAttribute("registerModel", new registerModel());
        return this.displayLogin(model);
    }

    @GetMapping("/contact")
    public String displayContact(){
        return "contact";
    }
    @GetMapping("/about")
    public String displayAbout(){
        return "about";
    }

    @GetMapping("/home")
    public String displayHome(loginModel loginModel){
        System.out.println(loginModel);
        return "home";
    }

    @PostMapping("manageEvent")
    public String displayManageEvent(loginModel loginModel){
        System.out.println(loginModel);
        return "manage-events";
    }
}
