package com.comercial.acat.dto;

import javax.validation.constraints.NotBlank;

public class ProyectoDto {

	@NotBlank
	private int idproyecto;
	@NotBlank
	private String titulo;
	@NotBlank
	private String objetivogeneral;
	
	@NotBlank
	private String resumen;
	
	public ProyectoDto() {
		
	}


	public ProyectoDto(@NotBlank String titulo, @NotBlank String objetivogeneral, @NotBlank String resumen) {
		super();
		this.titulo = titulo;
		this.objetivogeneral = objetivogeneral;
		this.resumen = resumen;

	}


	public int getIdproyecto() {
		return idproyecto;
	}


	public void setIdproyecto(int idproyecto) {
		this.idproyecto = idproyecto;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getObjetivogeneral() {
		return objetivogeneral;
	}


	public void setObjetivogeneral(String objetivogeneral) {
		this.objetivogeneral = objetivogeneral;
	}


	public String getResumen() {
		return resumen;
	}


	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	


	
}
