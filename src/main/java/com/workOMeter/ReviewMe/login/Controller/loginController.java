package com.workOMeter.ReviewMe.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workOMeter.ReviewMe.Requests.LoginRequest;
import com.workOMeter.ReviewMe.Responses.LoginResponse;
import com.workOMeter.ReviewMe.service.ReviewMeService;

@RestController
public class loginController {
	
	@Autowired
	private ReviewMeService reviveMeStevice;


	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponse authenticateUserLogin(@RequestBody LoginRequest request) {
		System.out.println("request: "+request);
		LoginResponse response = reviveMeStevice.authenticateUserLogin(request);
		return response; 
	}
}
