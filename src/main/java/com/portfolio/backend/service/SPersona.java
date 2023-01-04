package com.portfolio.backend.service;

import com.portfolio.backend.entity.Persona;
import com.portfolio.backend.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPersona {
	@Autowired
	RPersona rpersona;
	
	public void crearPersona(Persona persona){
		rpersona.save(persona);
	}
	
	public void borrarPersona(Long id){
		rpersona.deleteById(id);
	}
	
	public List<Persona> listarPersonas(){
		return rpersona.findAll();
	}
	
	public Persona buscarPersonaPorId(Long id){
		return rpersona.findById(id).orElse(null);
	}
	
	public void modificarPersona(Persona persona){
		rpersona.save(persona);
	}
	
	public PersonaDTO login(String email, String password){
		Persona persona = rpersona.findByEmailAndPassword(email, password);
		PersonaDTO personaDTO = new PersonaDTO(persona.getId(),persona.getNombre(),persona.getApellido(),persona.getTitulo(),persona.getFrase(),persona.getAcercade(),persona.getImgBanner(),persona.getImgPfp(),persona.getDescripcionPfp(),persona.getCvpdf(),persona.getTextofooter());
		return personaDTO;
	}
}
