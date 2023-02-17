package com.spring.auth_youtube.modules.user;

import com.spring.auth_youtube.modules.user.dto.CreateUserRoleDTO;
import com.spring.auth_youtube.modules.user.services.CreateRoleUserService;

import com.spring.auth_youtube.modules.user.entities.User;
import com.spring.auth_youtube.modules.user.services.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  CreateUserService createUserService;

  @Autowired
  CreateRoleUserService createRoleUserService;
  @PostMapping("/create")
  public User create(@RequestBody User user) {
    return createUserService.execute(user);
  }

  @PostMapping("/role")
  public User role(@RequestBody CreateUserRoleDTO createUserRoleDTO) {
    return createRoleUserService.execute(createUserRoleDTO);
  }
}
