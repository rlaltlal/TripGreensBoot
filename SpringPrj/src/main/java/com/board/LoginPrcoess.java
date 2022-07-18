package com.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.board.domain.UserVo;
import com.board.mapper.LoginMapper;

@Service
public class LoginPrcoess implements UserDetailsService{

	@Autowired 
	private LoginMapper loginMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Map<String,Object> map=new HashMap<>(); 
		map.put("email", username);
		loginMapper.getUserVo(username);
		UserVo userVo=(UserVo) map.get("result");
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(userVo.getAuthority()));
		return new User(userVo.getEmail(),userVo.getPasswd(),authorities);
	}
	
}
