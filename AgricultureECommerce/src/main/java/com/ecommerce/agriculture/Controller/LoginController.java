package com.ecommerce.agriculture.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Soumyadip Chowdhury
 * @github soumyadip007
 *
 */
@Controller
public class LoginController {


	@RequestMapping("/arglogin")
	public String showHome()
	{
		
		return "login";
	}

	
/*
	@RequestMapping("/authenticateTheUser")
	public String shwHome()
	{
		
		return "user/success";
	}
	*/


}
