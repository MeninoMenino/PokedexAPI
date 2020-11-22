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
@RequestMapping("/usuarios")
public class UsuarioController {

	//Repositório de Usuário
	@Autowired
	UserRepository usuarioRepository;
	
	//Serviços
	@Autowired
	UserService usuarioService;
	
	
	@GetMapping
	public List<User> listar(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> buscar(@PathVariable Integer id){
		return usuarioService.search(id); 
	}
	
	@PostMapping
	public ResponseEntity<User> inserirUsuario(@RequestBody @Valid User usuario){
		return usuarioService.post(usuario);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> alterarUsuario(@PathVariable Integer id,
			@RequestBody @Valid PutUserDto alterarUsuarioDto){
		return usuarioService.put(id, alterarUsuarioDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<User> deletarUsuario(@PathVariable Integer id){
		return usuarioService.delete(id);
	}
}
