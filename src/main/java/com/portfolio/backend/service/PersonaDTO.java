package com.portfolio.backend.service;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {
	
	Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String titulo;
	
	private String frase;
	
	private String acercade;
	
	private String imgBanner;
	
	private String imgPfp;
	
	private String descripcionPfp;
	
	private String cvpdf;
	
	private String textofooter;

	public PersonaDTO() {
	}

	public PersonaDTO(Long id, String nombre, String apellido, String titulo, String frase, String acercade, String imgBanner, String imgPfp, String descripcionPfp, String cvpdf, String textofooter) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulo = titulo;
		this.frase = frase;
		this.acercade = acercade;
		this.imgBanner = imgBanner;
		this.imgPfp = imgPfp;
		this.descripcionPfp = descripcionPfp;
		this.cvpdf = cvpdf;
		this.textofooter = textofooter;
	}
	
	
}
