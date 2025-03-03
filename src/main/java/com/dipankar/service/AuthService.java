package com.dipankar.service;

import com.dipankar.exception.SellerException;
import com.dipankar.exception.UserException;
import com.dipankar.request.LoginRequest;
import com.dipankar.request.SignupRequest;
import com.dipankar.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
