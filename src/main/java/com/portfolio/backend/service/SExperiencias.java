package com.portfolio.backend.service;

import com.portfolio.backend.entity.Experiencias;
import com.portfolio.backend.repository.RExperiencias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencias {
	@Autowired
	RExperiencias rexperiencias;
	
	public void crearExperiencia(Experiencias experiencia){
		rexperiencias.save(experiencia);
	}
	
	public void borrarExperiencia(Long id){
		rexperiencias.deleteById(id);
	}
	
	public List<Experiencias> listarExperiencias(){
		return rexperiencias.findAll();
	}
	
	public Experiencias buscarExperienciaPorId(Long id){
		return rexperiencias.findById(id).orElse(null);
	}
	
	public void modificarExperiencia(Experiencias experiencia){
		rexperiencias.save(experiencia);
	}
}
