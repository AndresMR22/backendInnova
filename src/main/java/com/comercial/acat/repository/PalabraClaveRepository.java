package com.comercial.acat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comercial.acat.entity.PalabraClave;


public interface PalabraClaveRepository extends JpaRepository<PalabraClave, Integer>{

	
}
