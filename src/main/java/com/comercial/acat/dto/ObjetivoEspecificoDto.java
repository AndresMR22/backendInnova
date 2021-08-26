package com.comercial.acat.dto;

import javax.validation.constraints.NotBlank;

import com.comercial.acat.entity.Proyecto;

public class ObjetivoEspecificoDto {

	@NotBlank
	private int idObjetivoEspecifico;
	@NotBlank
	private Proyecto idproyecto;
	@NotBlank
	private String nombreObjetivoEspecifico;
	
	
	public ObjetivoEspecificoDto() {
		super();
	}


	public ObjetivoEspecificoDto(@NotBlank Proyecto idproyecto, @NotBlank String nombreObjetivoEspecifico) {
		super();
		this.idproyecto = idproyecto;
		this.nombreObjetivoEspecifico = nombreObjetivoEspecifico;
	}


	public int getIdObjetivoEspecifico() {
		return idObjetivoEspecifico;
	}


	public void setIdObjetivoEspecifico(int idObjetivoEspecifico) {
		this.idObjetivoEspecifico = idObjetivoEspecifico;
	}


	public Proyecto getIdproyecto() {
		return idproyecto;
	}


	public void setIdproyecto(Proyecto idproyecto) {
		this.idproyecto = idproyecto;
	}


	public String getNombreObjetivoEspecifico() {
		return nombreObjetivoEspecifico;
	}


	public void setNombreObjetivoEspecifico(String nombreObjetivoEspecifico) {
		this.nombreObjetivoEspecifico = nombreObjetivoEspecifico;
	}
	
	
	
	
}
