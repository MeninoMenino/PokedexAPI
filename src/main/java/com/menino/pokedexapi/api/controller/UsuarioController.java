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

import com.menino.pokedexapi.domain.dto.AlterarUsuarioDto;
import com.menino.pokedexapi.domain.model.Usuario;
import com.menino.pokedexapi.domain.repository.UsuarioRepository;
import com.menino.pokedexapi.domain.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	//Repositório de Usuário
	@Autowired
	UsuarioRepository usuarioRepository;
	
	//Serviços
	@Autowired
	UsuarioService usuarioService;
	
	
	@GetMapping
	public List<Usuario> listar(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> buscar(@PathVariable Integer id){
		return usuarioService.buscar(id); 
	}
	
	@PostMapping
	public ResponseEntity<Usuario> inserirUsuario(@RequestBody @Valid Usuario usuario){
		return usuarioService.inserir(usuario);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> alterarUsuario(@PathVariable Integer id,
			@RequestBody @Valid AlterarUsuarioDto alterarUsuarioDto){
		return usuarioService.alterar(id, alterarUsuarioDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> deletarUsuario(@PathVariable Integer id){
		return usuarioService.deletar(id);
	}
}
