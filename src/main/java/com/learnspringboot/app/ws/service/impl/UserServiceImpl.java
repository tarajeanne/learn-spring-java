package com.learnspringboot.app.ws.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.learnspringboot.app.ws.shared.dto.UserDto;
import com.learnspringboot.app.ws.service.UserService;
import com.learnspringboot.app.ws.UserRepository;
import com.learnspringboot.app.ws.io.entity.UserEntity;


@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public UserDto createUser(UserDto user) {
    UserEntity userEntity = new UserEntity();
    BeanUtils.copyProperties(user, userEntity);

    userEntity.setEncryptedPassword("test");
    userEntity.setUserId("testuserId");

    UserEntity storedUserDetails = userRepository.save(userEntity);

    UserDto returnValue = new UserDto();

    BeanUtils.copyProperties(storedUserDetails, returnValue);

    return returnValue;
  }
}