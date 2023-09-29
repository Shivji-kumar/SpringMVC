package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This one Handler");
		RedirectView redirectView =new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This Second Handler");
		return "contacts";
	}

}