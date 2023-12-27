package kr.co.pomotime.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.pomotime.user.dto.UserDto;
import kr.co.pomotime.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/regTest")
	public UserDto userRegTest(
			@RequestParam("email") String email
			,@RequestParam("nickname") String nickname
			,@RequestParam("password") String password
			) {
		UserDto user = userService.userSaveTest(email, nickname, password);
		return user;
	}
}
