package com.example.demo.uss.domain;



import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Component @Lazy @Getter
public class UserDTO implements UserDetails{
	private static final long serialVersionUID = 1L;
	private long userNum;
	private String userid;
	private String password;
	private String username;
	private String email;
	private String gender;
	private String birthday;
	private String phoneNumber;
	private String preferGenre;
	
	private Collection<? extends GrantedAuthority> authorities;
	
	public UserDTO(long userNum, String userid, String password, String username,
			String email,
			Collection<? extends GrantedAuthority> authorities) {
		this.userNum = userNum;
		this.userid = userid;
		this.password = password;
		this.username = username;
		this.email = email;
		this.authorities = authorities;
	}
	
	public static UserDTO create(User user) {
		List<GrantedAuthority> authorities = 
				user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
				.collect(Collectors.toList());
		return new UserDTO(user.getUserNum(), user.getUserid(), user.getUsername(),
				user.getEmail(), user.getPassword(), authorities);
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return false;
	}
	
}
