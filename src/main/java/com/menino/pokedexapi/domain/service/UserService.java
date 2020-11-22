package com.menino.pokedexapi.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.menino.pokedexapi.domain.dto.PutUserDto;
import com.menino.pokedexapi.domain.model.User;
import com.menino.pokedexapi.domain.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	//Serviços de CRUD
	
	public List<User> list(){
		return userRepository.findAll();
	}
	
	public ResponseEntity<User> search(Integer id){
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(user.get());
		}
	}
	
	public ResponseEntity<User> post(User user){
		return ResponseEntity.ok(userRepository.save(user));
	}
	
	public ResponseEntity<User> put(Integer id, PutUserDto putUserDto){
		Optional<User> existentUser = userRepository.findById(id);
		if(!existentUser.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			User patchedUser = new User(id, putUserDto);
			return ResponseEntity.ok(patchedUser);
		}
	}
	
	public ResponseEntity<User> delete(Integer id){
		if(!userRepository.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			userRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}
	}
}
