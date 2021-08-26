package com.comercial.acat.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comercial.acat.dto.Mensaje;
import com.comercial.acat.dto.ObjetivoEspecificoDto;
import com.comercial.acat.dto.PalabraClaveDto;
import com.comercial.acat.entity.ObjetivoEspecifico;
import com.comercial.acat.entity.PalabraClave;
import com.comercial.acat.service.ObjetivoEspecificoService;
import com.comercial.acat.service.PalabraClaveService;

@RestController
@RequestMapping("/palabraclave")
@CrossOrigin(origins = "*")
public class PalabraClaveController {


	@Autowired
	PalabraClaveService pcService;//Para invocar los metodos
	
	@GetMapping ("/listar")
	public ResponseEntity<List<PalabraClave>> list(){
		List<PalabraClave> list = pcService.findAll();
		return new ResponseEntity<List<PalabraClave>>(list, HttpStatus.OK);
	}
	
	@GetMapping ("/detail/{idobjesp}")
	public ResponseEntity<PalabraClave> getById (@PathVariable("idpc") int idpc){
		if (!pcService.existsById(idpc))
			return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
		PalabraClave objPal = pcService.getById(idpc).get();
		return new ResponseEntity<PalabraClave>(objPal, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<PalabraClave> create (@RequestBody PalabraClave palabraCRequest){
		
		return new ResponseEntity<>(pcService.addPalabraClave(palabraCRequest), HttpStatus.CREATED);
		//return new ResponseEntity(new Mensaje("Objetivo especifico agregado con exito"), new HttpHeaders(),HttpStatus.OK);
	}
	
	
	
	@PutMapping("/update")
	public ResponseEntity<PalabraClave> updatePalabraClave(@Valid @RequestBody PalabraClave palabraRequest) {
		return new ResponseEntity<>(pcService.addPalabraClave(palabraRequest), HttpStatus.OK);
	}	
	
	
	@DeleteMapping("/delete/{idpalabra}")
	public ResponseEntity<?> delete (@PathVariable ("idpalabra") int idpc){
		if (!pcService.existsById(idpc))
			return new ResponseEntity(new Mensaje("No existe"),HttpStatus.NOT_FOUND);
		pcService.delete(idpc);
		return new ResponseEntity(new Mensaje("Se elimino correctamente"),HttpStatus.OK);
	}

	

}
