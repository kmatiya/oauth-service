package com.kondwani.oauthservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	public String firstPage(HttpServletRequest request, HttpServletResponse response) {
		return "Hello World";
	}

}