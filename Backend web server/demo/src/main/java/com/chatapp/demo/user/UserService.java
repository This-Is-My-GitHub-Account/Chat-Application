package com.chatapp.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final UserRepository userRepository;
	private final BCryptPasswordEncoder passwordEncoder;

	@Autowired
	public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public void signup(UserDto userDto) {

		if (userRepository.existsByUsername(userDto.getUsername())) {
			throw new UsernameAlreadyExistsException("Username is already taken");
		}

		String encodedPassword = passwordEncoder.encode(userDto.getPassword());

		User newUser = new User(userDto.getUsername(), encodedPassword);

		userRepository.save(newUser);
	}

	public boolean login(LoginDto loginDto) {

		User user = userRepository.findByUsername(loginDto.getUsername());

		return user != null && passwordEncoder.matches(loginDto.getPassword(), user.getPassword());
	}
}
