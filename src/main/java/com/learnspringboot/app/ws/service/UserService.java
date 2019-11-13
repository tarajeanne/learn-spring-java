package com.learnspringboot.app.ws.service;

import com.learnspringboot.app.ws.shared.dto.UserDto;

public interface UserService {
  UserDto createUser(UserDto user);
}