package com.tienda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.dto.LibroDTO;
import com.tienda.mappers.LibroMapper;
import com.tienda.persistance.entities.LibroEntity;
import com.tienda.repositories.AutorRepository;
import com.tienda.repositories.LibroRepository;


@Service
public class LibroServiceImpl  implements LibroService{
	
	@Autowired
	LibroRepository libroRepository;
	@Autowired
	LibroMapper libroMapper;
	@Autowired
	AutorRepository autorRepository;


	@Override
	public LibroDTO createLibro(LibroDTO libroDTO) {
		
		LibroEntity libro = libroMapper.toEntity(libroDTO);
	    
		if (libroDTO.getAutorId() != null) {
	        autorRepository.findById(libroDTO.getAutorId()).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
	    }
		
	    libro = libroRepository.save(libro);
	    return libroMapper.toDto(libro);
	}


}































