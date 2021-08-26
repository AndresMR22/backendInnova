package com.comercial.acat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.util.StringUtils;
import java.util.Base64;
import java.io.IOException;

import com.comercial.acat.dto.InvestigadorDto;
import com.comercial.acat.entity.Investigador;
import com.comercial.acat.entity.Producto;
import com.comercial.acat.entity.ResourceNotFoundException;
import com.comercial.acat.exceptions.RecordNotFoundException;
import com.comercial.acat.repository.InvestigadorRepository;
import java.util.List;
import java.util.Optional;
//
@Service
@Transactional
public class InvestigadorService {

	@Autowired
	InvestigadorRepository investigadorRepository;
	
	
	public Investigador  saveInvestigador(Investigador investigadorRequest)
	{
       return investigadorRepository.save(investigadorRequest);
	}

	   
	    
	    public List<Investigador> findAll(){
			return investigadorRepository.findAll();  //devuelve todos los proyectos
		}
		
		public Investigador getById(int idproducto){
			return investigadorRepository.findById(idproducto).orElseThrow(()-> new ResourceNotFoundException("Proyecto","ID",idproducto));
			//devuelve un proyecto filtrado por id
		}
	    
	  
	    public void delete(int id) {
	   
	        investigadorRepository.deleteById(id);
	    }
	    
	    public boolean existsById(int idproducto) {
			return investigadorRepository.existsById(idproducto); //devuelve true si existe un productor buscado por id
		}

	 
}
