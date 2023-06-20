package repflix.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import repflix.entity.UserEntity;
import repflix.repository.UserRepository;

@Controller
public class SignController {
	
	private UserRepository userRepository;

	//회원가입 완료처리
	@PostMapping("/sign/signup")
	public String signup(UserEntity userEntity) {
		
		userRepository.save(userEntity);
		return "redirect:/sign/signin";
	}
	
	
}
