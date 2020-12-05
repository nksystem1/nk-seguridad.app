package com.nkseguridad.app;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encriptar {

	public static void main(String[] arg) {
		BCryptPasswordEncoder bd= new BCryptPasswordEncoder();
		System.out.println(bd.encode("admin"));
	}
	
}
