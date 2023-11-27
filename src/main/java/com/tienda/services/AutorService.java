package com.tienda.services;

import java.util.List;
import com.tienda.dto.AutorDTO;

public interface AutorService {
	
	AutorDTO createAutor(AutorDTO autorDTO);
	
	AutorDTO getAutor(Long id);

	List<AutorDTO> getAllAutor();


	

	

}