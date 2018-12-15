package com.restfulproyecto.restfulspringboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public String getUser() {
		return "Usuario obtenido";
	}
	
	@PostMapping
	public String createUser() {
		return "Usuario creado";
	}
	
	@PutMapping
	public String updateUser() {
		return "Usuario actualizado";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Usuario eliminado";
	}		
	
}
