package repflix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	//로그인 페이지
	@GetMapping("/sign/signin")
	public String signin() {
		
		return "sign/signin";
	}
	
	//관리자 페이지
	@GetMapping("/admin")
	public String admin() {
		return"admin/admin";
	}
}
