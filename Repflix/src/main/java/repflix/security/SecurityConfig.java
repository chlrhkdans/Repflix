package repflix.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
			.authorizeHttpRequests()
			.requestMatchers("/sign/**").permitAll()
			.anyRequest().permitAll();
		http
			.formLogin()
			.loginPage("/sign/signin");
		http
			.csrf().disable();
		return http.build();
	}
}
