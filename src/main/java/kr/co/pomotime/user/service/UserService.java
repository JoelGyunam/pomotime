package kr.co.pomotime.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.pomotime.user.domain.User;
import kr.co.pomotime.user.dto.UserDto;
import kr.co.pomotime.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserDto userSaveTest(String email, String nickname, String password) {
		
		User user = userRepository.save(User.builder()
				.email(email)
				.nickname(nickname)
				.password(password)
				.build()
				);
		
		return user.toUserDto();
	}
}