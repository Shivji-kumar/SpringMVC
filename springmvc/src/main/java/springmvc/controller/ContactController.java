package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	//@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn Java With Coding");
		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("Adding Common Data To Model");
	}
	
	@RequestMapping("/contacts")
	public String showForm(Model m) {
		System.out.println("Creating Form");
		return "contacts";
	}

	@RequestMapping(path="/processform", method= RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		//System.out.println(user);
		this.userService.createUser(user);
		model.addAttribute("msg", "User created with id");
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		return "success";
	}
	
}

//method for receving data by HttpServletrequest
//	public String handleForm(HttpServletRequest request) {
//		String email=request.getParameter("email");
//		System.out.println("User Email is : "+email);
//		
//		s
//		return "";
//		

	//@RequestParam(name="email", required=true) String userEmail, 
	//@RequestParam(name="userName",required=true) String userName,
	//@RequestParam("password") String userPassword, Model model) {
	//
	//User user=new User();
	//user.setEmail(userEmail);
	//user.setUserName(userName);
	//user.setPassword(userPassword);
	//
	//System.out.println(user);

	//process
	
	//System.out.println("User Email " +userEmail);
	//System.out.println("User Name " +userName);
	//System.out.println("User Password " +userPassword);
	//
	//model.addAttribute("name", userName);
	//model.addAttribute("email", userEmail);
	//model.addAttribute("password", userPassword);
	//model.addAttribute("user",user);
