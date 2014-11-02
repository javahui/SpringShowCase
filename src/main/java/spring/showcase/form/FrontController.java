/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring.showcase.form;

import application.models.User;
import java.util.LinkedList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Bartek
 */
@Controller
@SessionAttributes("users")
public class FrontController {
   
    private static List<User> list = new LinkedList<>();
    static{
        for(int i=0; i<100; i++){
            list.add(i, new User("imie"+i,"N::"+i, "example"+i+"@wp.pl"));
        }
    }
    
    /* 
    @ModelAttribute:: Annotation that binds a method parameter or method return value to a named 
    model attribute, exposed to a web view. Supported for controller classes with
    @RequestMapping methods. 
    */
    @ModelAttribute
    public void AddStaticContent(Model model){
        model.addAttribute("users", list);
    }
    
    @RequestMapping("/")
    public String Index(Model model){
        model.addAttribute("user", new User());
        return "index";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String Index(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            return "index";
        }
        list.add(user);
        return "index";
    }
    
    @RequestMapping("/show/{id}")
    public String Show(Model model, @PathVariable("id") String name){
        model.addAttribute("name", name);
        return "show";
    }
}
