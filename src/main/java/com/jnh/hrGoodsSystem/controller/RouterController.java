package com.jnh.hrGoodsSystem.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/router")
public class RouterController {

	@RequestMapping("/login")
	public void login(HttpServletResponse response) throws IOException{
		response.sendRedirect("http://localhost:8000/#/login");
	}
	
}
