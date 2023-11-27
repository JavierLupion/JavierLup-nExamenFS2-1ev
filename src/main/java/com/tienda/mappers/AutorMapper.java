package com.tienda.mappers;

import org.mapstruct.Mapper;
import com.tienda.dto.AutorDTO;
import com.tienda.persistance.entities.AutorEntity;

@Mapper(componentModel = "spring", uses = {LibroMapper.class})
public interface AutorMapper {
	
    AutorDTO toDto(AutorEntity autor);
    AutorEntity toEntity(AutorDTO autorDTO);

	
}