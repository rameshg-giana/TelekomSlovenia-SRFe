
package com.tesla.registercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tesla.registerdto.RegisterDto;
import com.tesla.registerservice.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "/registerform", method = RequestMethod.GET)
	public String callRegisterForm(Model model) {
		model.addAttribute("registerdto", new RegisterDto());
		return "registerform";

	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public String callRegisterProcess(@ModelAttribute("registerdto") RegisterDto registerDto) {
		registerService.registerServiceProvider(registerDto);
		return "";

	}

}
