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
public class Experiencias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Lob
	@Column(name = "logo", length = 800)
	private String logo;
	
	@Lob
	@Column(name = "link-instit", length = 800)
	private String link_instit;
	
	private String instit;
	
	private String fecha_inicio;
	
	private String fecha_fin;
	
	@Lob
	@Column(name = "puesto", length = 800)
	private String puesto;
	
	@Lob
	@Column(name = "descripcion", length = 800)
	private String descripcion;

	public Experiencias() {
	}

	public Experiencias(String logo, String link_instit, String instit, String fecha_inicio, String fecha_fin, String puesto, String descripcion) {
		this.logo = logo;
		this.link_instit = link_instit;
		this.instit = instit;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.puesto = puesto;
		this.descripcion = descripcion;
	}
	
	
}
