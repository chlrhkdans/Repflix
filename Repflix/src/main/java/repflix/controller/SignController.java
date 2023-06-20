package repflix.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import repflix.entity.UserEntity;
import repflix.repository.UserRepository;

@Controller
public class SignController {
	
	@Autowired
	private UserRepository userRepository;

	//회원가입 완료처리
	@PostMapping("/sign/signup")
	public String signup(UserEntity user) {
		userRepository.save(user);
		return "redirect:/sign/signin";
	}
	
	
}
