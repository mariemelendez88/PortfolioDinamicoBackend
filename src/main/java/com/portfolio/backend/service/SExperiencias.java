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
	
	public List<Experiencias> listarItems(){
		return rexperiencias.findAll();
	}
	
	public Experiencias cargarItem(Long id){
		return rexperiencias.findById(id).orElse(null);
	}
	
	public void crearItem(Experiencias experiencia){
		rexperiencias.save(experiencia);
	}
	
	public void borrarItem(Long id){
		rexperiencias.deleteById(id);
	}
	
	public void modificarItem(Experiencias experiencia){
		rexperiencias.save(experiencia);
	}
}
