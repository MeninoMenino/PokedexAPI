package com.menino.pokedexapi.api.controller;

import java.util.List;
import java.util.Optional;

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

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Usuario> inserirUsuario(@RequestBody @Valid Usuario usuario){
		return ResponseEntity.ok(usuarioRepository.save(usuario));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Usuario> alterarUsuario(@PathVariable Long id,
			@RequestBody @Valid AlterarUsuarioDto alterarUsuarioDto){
		Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);
		if(!usuarioExistente.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			Usuario usuarioAlterado = new Usuario(id, alterarUsuarioDto);
			return ResponseEntity.ok(usuarioAlterado);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Usuario> deletarUsuario(@PathVariable Long id){
		if(!usuarioRepository.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			usuarioRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}
	}
}
