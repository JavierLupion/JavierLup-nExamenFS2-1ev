package com.tienda.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {

	private Long id;
	private String titulo;
	private String isbn;
	private BigDecimal precio;
	private Long autorId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public LibroDTO(Long id, String titulo, String isbn, BigDecimal precio, Long autorId) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.precio = precio;
		this.autorId = autorId;
	}
	public Long getAutorId() {
		return autorId;
	}
	public void setAutorId(Long autorId) {
		this.autorId = autorId;
	}

	public LibroDTO() {
		
	}
	
	
}