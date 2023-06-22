package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc.service.TestService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	TestService service;
	
	@PostMapping("calculate")
	public ModelAndView save(@RequestParam double budget)
	{
		return service.calculate(budget);
	}
}