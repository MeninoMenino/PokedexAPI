package com.menino.pokedexapi.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menino.pokedexapi.domain.dto.PutUserDto;
import com.menino.pokedexapi.domain.model.User;
import com.menino.pokedexapi.domain.repository.UserRepository;
import com.menino.pokedexapi.domain.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	//Repositório de Usuário
	@Autowired
	UserRepository userRepository;
	
	//Serviços
	@Autowired
	UserService userService;
	
	
	@GetMapping
	public List<User> listUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> searchUser(@PathVariable Integer id){
		return userService.search(id); 
	}
	
	@PostMapping
	public ResponseEntity<User> postUser(@RequestBody @Valid User user){
		return userService.post(user);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> putUser(@PathVariable Integer id,
			@RequestBody @Valid PutUserDto putUserDto){
		return userService.put(id, putUserDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable Integer id){
		return userService.delete(id);
	}
}
