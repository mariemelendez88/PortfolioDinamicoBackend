package com.portfolio.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String titulo;
	
	@Lob
	@Column(name = "frase", length = 800)
	private String frase;
	
	@Lob
	@Column(name = "acercade", length = 800)
	private String acercade;
	
	@Lob
	@Column(name = "imgBanner", length = 800)
	private String imgBanner;
	
	@Lob
	@Column(name = "imgPfp", length = 800)
	private String imgPfp;
	
	@Lob
	@Column(name = "descripcionPfp", length = 800)
	private String descripcionPfp;
	
	@Lob
	@Column(name = "cvpdf", length = 800)
	private String cvpdf;
	
	@Lob
	@Column(name = "textofooter", length = 800)
	private String textofooter;
	
	@Lob
	private String email;
	
	private String password;

	public Persona() {
	}

	public Persona(Long id, String nombre, String apellido, String titulo, String frase, String acercade, String imgBanner, String imgPfp, String descripcionPfp, String cvpdf, String textofooter, String email, String password) {
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
		this.email = email;
		this.password = password;
	}

}
