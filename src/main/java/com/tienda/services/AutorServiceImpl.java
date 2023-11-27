package com.tienda.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tienda.dto.AutorDTO;
import com.tienda.mappers.AutorMapper;
import com.tienda.persistance.entities.AutorEntity;
import com.tienda.repositories.AutorRepository;


@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	public AutorRepository autorRepository;
	@Autowired
	public AutorMapper autorMapper;
	

	@Override
	public AutorDTO createAutor(AutorDTO autorDTO) {

		return autorMapper.toDto(autorRepository.save(autorMapper.toEntity(autorDTO)));
	}


	@Override
	public AutorDTO getAutor(Long id) {
		
		AutorEntity autor = autorRepository.findById(id).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
		
		return autorMapper.toDto(autor);
	}


	@Override
	public List<AutorDTO> getAllAutor() {
		List<AutorEntity> autoresEntity = autorRepository.findAll();
		List<AutorDTO> autoresDTO = new ArrayList<>();
		for (AutorEntity autor: autoresEntity) {
			autoresDTO.add(autorMapper.toDto(autor));
		}
		return autoresDTO;
	}


}