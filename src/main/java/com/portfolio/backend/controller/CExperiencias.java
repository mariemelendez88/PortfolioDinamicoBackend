package com.portfolio.backend.controller;

import com.portfolio.backend.entity.Experiencias;
import com.portfolio.backend.service.SExperiencias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotacion del spring o controlador
@CrossOrigin(origins = "http://localhost:4200") //con que se va a cruzar, o sea, angular
public class CExperiencias {
	
	@Autowired
	SExperiencias sexperiencias;
	
	@GetMapping("/experiencias")
	@ResponseBody
	public List<Experiencias> listarItems(){
		return sexperiencias.listarItems();
	}
	
	@PostMapping("/experiencias")
	@ResponseBody
	public String crearItem(@RequestBody Experiencias experiencia){
		sexperiencias.crearItem(experiencia);
		return "La experiencia fue creada correctamente!!";
	}
	
	@DeleteMapping("/experiencias/{id}")
	public String borrarExperiencia(@PathVariable Long id){
		sexperiencias.borrarItem(id);
		return "La experiencia fue eliminada correctamente!!";
	}
	
	@GetMapping("/experiencias/{id}")
	@ResponseBody
	public Experiencias cargarItem(@PathVariable Long id){
		return sexperiencias.cargarItem(id);
	}
	
	@PutMapping("/experiencias")
	public String modificarItem(@RequestBody Experiencias experiencia){
		sexperiencias.modificarItem(experiencia);
		return "La experiencia fue modificada correctamente!!";
	}
}
