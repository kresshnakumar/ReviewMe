package com.workOMeter.ReviewMe.serviceImpl;

import org.springframework.stereotype.Service;

import com.workOMeter.ReviewMe.Requests.LoginRequest;
import com.workOMeter.ReviewMe.Responses.LoginResponse;
import com.workOMeter.ReviewMe.service.ReviewMeService;

@Service
public class ReviewMeServiceImpl implements ReviewMeService{

	@Override
	public LoginResponse authenticateUserLogin(LoginRequest request) {
		LoginResponse response = null;
		if(request.getUserId().equals(request.getPassword())) {
			response = new LoginResponse();
			response.setName(request.getUserId());
			response.setStatus("SUCCESS");
			response.setDesignation("SE");
			response.setDateOfJoining("2018-01-01");
			response.setCreatedDate("2018-02-01");
			return response;
		}
		return null;
	}

}
