package com.comercial.acat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comercial.acat.entity.ObjetivoEspecifico;
import com.comercial.acat.entity.PalabraClave;
import com.comercial.acat.entity.ResourceNotFoundException;
import com.comercial.acat.repository.ObjetivoEspecificoRepository;
import com.comercial.acat.repository.PalabraClaveRepository;

@Service
@Transactional
public class PalabraClaveService {

	@Autowired
	PalabraClaveRepository pcRepository;
	
	public List<PalabraClave>findAll(){
		return   pcRepository.findAll();//devuelve todos los proyectos
	}
		
	public Optional<PalabraClave>getById(int idpc){
		return pcRepository.findById(idpc); //devuelve un obj esp filtrado por id
	}
	
	
	public PalabraClave addPalabraClave(PalabraClave palabraRequest) {		
		return pcRepository.save(palabraRequest);
	}
	
	public PalabraClave updatePalabraClave(Integer palabraId, PalabraClave palabraRequest) {
		return pcRepository.findById(palabraId).map(palabra -> {
			palabra.setPalabraClave(palabraRequest.getPalabraClave());
			palabra.setProyecto(palabraRequest.getProyecto());
			return pcRepository.save(palabra);
		}).orElseThrow(()-> new ResourceNotFoundException("Mission","id", palabraId));
		
	}
	
	
	public void delete(int idpc) {
		pcRepository.deleteById(idpc);  //elimina un obj esp por su Id
	}
	
	public boolean existsById(int idpc) {
		return pcRepository.existsById(idpc); //devuelve true si existe un obj esp buscado por id
	}
	
	
}
