package br.com.senior.app.pedidos.pedidos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Pedidos")
public class Pedidos 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private Long pedido;
	
	@Column(columnDefinition = "TEXT")
	private String item;
	
	private Long quantidade;
}
