package com.marakobz.lab4.service;

import com.marakobz.lab4.controller.dto.JwtResponse;
import com.marakobz.lab4.controller.dto.UserCredentialsDTO;

public interface UserService {

    JwtResponse login(UserCredentialsDTO userCredentialsDTO);
    void register(UserCredentialsDTO userCredentialsDTO);
    JwtResponse refresh(String refreshToken);
    void logout(String refreshToken);

}
