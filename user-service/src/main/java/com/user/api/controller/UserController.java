package com.user.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.api.output.UserInfo;
import com.user.api.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "", produces = { "application/json" })
	public ResponseEntity<List<UserInfo>> getUSerInfo() {

		return new ResponseEntity<>(userService.getUserInfo(), HttpStatus.OK);
	}

}
