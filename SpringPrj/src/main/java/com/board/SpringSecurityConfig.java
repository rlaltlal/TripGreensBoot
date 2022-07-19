package com.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

import com.board.domain.UserVo;
import com.board.mapper.LoginMapper;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig{
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/","/login","/loginProcess").permitAll() // "/","/login"은 인증이 필요없음
				.antMatchers("/boardList2/**").hasRole("USER")
				//.anyRequest().authenticated() // 그외 URL은 인증필요
				.and()
			.formLogin() // 인증이 필요한 페이지 접근시 리다이렉팅 되는 URL
				.loginPage("/login")
				.loginProcessingUrl("/loginProcess")
				.permitAll()
				.and()
			.logout().permitAll();
		http.headers().frameOptions().sameOrigin();
		return http.build();
		
	}
}
