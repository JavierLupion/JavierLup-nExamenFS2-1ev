package com.tienda.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.tienda.dto.LibroDTO;
import com.tienda.persistance.entities.AutorEntity;
import com.tienda.persistance.entities.LibroEntity;

@Mapper(componentModel = "spring")
public interface LibroMapper {
	
	@Mapping(source = "autor", target = "autorId", qualifiedByName = "mapAutorId")
    LibroDTO toDto(LibroEntity libro);
    LibroEntity toEntity(LibroDTO libroDTO);
    
    @Named("mapAutorId")
    default Long mapAutorId(AutorEntity autor) {
        if (autor == null) {
            return null;
        }
        return autor.getId();
    }
}