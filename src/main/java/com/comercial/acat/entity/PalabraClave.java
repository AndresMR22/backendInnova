package com.comercial.acat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "proyecto")
@EqualsAndHashCode(exclude = "proyecto")
@RequiredArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PalabraClave {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int idpalabraClave;
private String palabraclave;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "proyecto",nullable = true, unique = true, updatable = true)
 @JsonBackReference
    private @NonNull Proyecto proyecto;
	
	

public PalabraClave() {
	
}



public PalabraClave(Proyecto proyecto, String palabraclave) {
	super();
	this.proyecto = proyecto;
	this.palabraclave = palabraclave;
}



public int getIdpalabraClave() {
	return idpalabraClave;
}

public void setIdpalabraClave(int idpalabraClave) {
	this.idpalabraClave = idpalabraClave;
}



public Proyecto getProyecto() {
	return proyecto;
}



public void setProyecto(Proyecto proyecto) {
	this.proyecto = proyecto;
}



public String getPalabraClave() {
	return palabraclave;
}

public void setPalabraClave(String palabraClave) {
	this.palabraclave = palabraClave;
}



}
