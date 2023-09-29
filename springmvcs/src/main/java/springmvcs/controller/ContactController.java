package springmvcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcs.model.User;
import springmvcs.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Wecome to ShivTech");
		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("Adding data to Common Model");
	}

	@RequestMapping("/contact")
	public String shoForm(Model m) {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}

		int createUser= this.userService.createUser(user);
		model.addAttribute("msg"," User Created with Id : "+createUser);

		return "success";
	}

}
