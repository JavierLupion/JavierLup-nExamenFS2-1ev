package com.tienda.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.tienda.dto.LibroDTO;
import com.tienda.services.LibroService;


@RestController
@RequestMapping("/libro")
public class LibroRestController {

	@Autowired
	LibroService libroService;

	@PostMapping()
	public ResponseEntity<?> createLibro(@RequestBody LibroDTO libroDTO) {

		LibroDTO libro = libroService.createLibro(libroDTO);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/" + libro.getId())
				.buildAndExpand(libro.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
		
	}

}






































