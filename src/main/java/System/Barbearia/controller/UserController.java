package System.Barbearia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import System.Barbearia.model.User;
import System.Barbearia.repository.IUserRepository;



@Controller
public class UserController {

      HomeController home;
      
      @Autowired
      private IUserRepository userRepository;

      @GetMapping("/registerUser")
      public ModelAndView register(User User) {
            ModelAndView mv = new ModelAndView("Register/registerUser");
            mv.addObject(User);
            return mv;
      }

      @PostMapping("/saveUser")
      public ModelAndView save(User user, BindingResult result) {
            if(result.hasErrors()) {
                  return register(user);
            }
            userRepository.saveAndFlush(user);
            return home.home();
      }
      
      
}
