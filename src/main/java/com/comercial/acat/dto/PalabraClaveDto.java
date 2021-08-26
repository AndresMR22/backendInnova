package com.comercial.acat.dto;

import javax.validation.constraints.NotBlank;

import com.comercial.acat.entity.Proyecto;

public class PalabraClaveDto {

	@NotBlank
	private int idpalabraClave;
	
	@NotBlank
	private Proyecto idproyecto;
	
	@NotBlank
	private String palabraClave;

	
	public PalabraClaveDto() {
		super();
	
	}


	public PalabraClaveDto(@NotBlank Proyecto idproyecto, @NotBlank String palabraClave) {
		super();
		this.idproyecto = idproyecto;
		this.palabraClave = palabraClave;
	}


	public int getIdpalabraClave() {
		return idpalabraClave;
	}


	public void setIdpalabraClave(int idpalabraClave) {
		this.idpalabraClave = idpalabraClave;
	}


	public Proyecto getIdproyecto() {
		return idproyecto;
	}


	public void setIdproyecto(Proyecto idproyecto) {
		this.idproyecto = idproyecto;
	}


	public String getPalabraClave() {
		return palabraClave;
	}


	public void setPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	
	
}
