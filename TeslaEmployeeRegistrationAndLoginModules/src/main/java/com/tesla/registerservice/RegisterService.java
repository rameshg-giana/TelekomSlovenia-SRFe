package com.tesla.registerservice;

import org.springframework.stereotype.Service;

import com.tesla.registerdto.RegisterDto;
@Service
public interface RegisterService {
	 String registerServiceProvider(RegisterDto registerDto);
	 

}
