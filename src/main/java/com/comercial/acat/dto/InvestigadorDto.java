package com.comercial.acat.dto;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Type;
import org.springframework.web.multipart.MultipartFile;

public class InvestigadorDto{
	
	@NotBlank
	private String nombreinvestigador;
	@NotBlank
	private String emailinvestigador;
	@NotBlank
	private String cargoinvestigador;
	
	//@Type (type = "uuid-char")
	@Lob
	@Column(name="fotoinvestigador")
	private String fotoinvestigador;
	//private UUID fotoinvestigador;

	public InvestigadorDto(@NotBlank String nombreinvestigador, @NotBlank String emailinvestigador,
			@NotBlank String cargoinvestigador, String fotoinvestigador) {
		super();
		this.nombreinvestigador = nombreinvestigador;
		this.emailinvestigador = emailinvestigador;
		this.cargoinvestigador = cargoinvestigador;
		this.fotoinvestigador = fotoinvestigador;
	}

	public String getNombreinvestigador() {
		return nombreinvestigador;
	}

	public void setNombreinvestigador(String nombreinvestigador) {
		this.nombreinvestigador = nombreinvestigador;
	}

	public String getEmailinvestigador() {
		return emailinvestigador;
	}

	public void setEmailinvestigador(String emailinvestigador) {
		this.emailinvestigador = emailinvestigador;
	}

	public String getCargoinvestigador() {
		return cargoinvestigador;
	}

	public void setCargoinvestigador(String cargoinvestigador) {
		this.cargoinvestigador = cargoinvestigador;
	}

	public String getFotoinvestigador() {
		return fotoinvestigador;
	}

	public void setFotoinvestigador(String fotoinvestigador) {
		this.fotoinvestigador = fotoinvestigador;
	}
	
	
	/*
	public InvestigadorDto() {
		
	}*/

	
}
	
