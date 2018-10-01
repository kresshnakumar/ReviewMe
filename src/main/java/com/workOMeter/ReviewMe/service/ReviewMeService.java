package com.workOMeter.ReviewMe.service;

import com.workOMeter.ReviewMe.Requests.LoginRequest;
import com.workOMeter.ReviewMe.Responses.LoginResponse;

public interface ReviewMeService {

	LoginResponse authenticateUserLogin(LoginRequest request);

}
