package com.oc.projet7app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	@GetMapping
	public String profile(HttpServletRequest request) {
		if (request.getSession().getAttribute("user") != null) {
			return "profile";
		}
		
		return "redirect:/login";
	}
}
