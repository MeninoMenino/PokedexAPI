package com.menino.pokedexapi.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.menino.pokedexapi.domain.dto.AlterarUsuarioDto;
import com.menino.pokedexapi.domain.model.Usuario;
import com.menino.pokedexapi.domain.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	//Serviços de CRUD
	
	public List<Usuario> listar(){
		return usuarioRepository.findAll();
	}
	
	public ResponseEntity<Usuario> buscar(Integer id){
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if(!usuario.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(usuario.get());
		}
	}
	
	public ResponseEntity<Usuario> inserir(Usuario usuario){
		return ResponseEntity.ok(usuarioRepository.save(usuario));
	}
	
	public ResponseEntity<Usuario> alterar(Integer id, AlterarUsuarioDto alterarUsuarioDto){
		Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);
		if(!usuarioExistente.isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			Usuario usuarioAlterado = new Usuario(id, alterarUsuarioDto);
			return ResponseEntity.ok(usuarioAlterado);
		}
	}
	
	public ResponseEntity<Usuario> deletar(Integer id){
		if(!usuarioRepository.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		} else {
			usuarioRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}
	}
	
	//---------------------
}
