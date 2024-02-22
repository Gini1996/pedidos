package br.com.senior.app.pedidos.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.senior.app.pedidos.pedidos.dtos.PedidosByListDTO;
import br.com.senior.app.pedidos.pedidos.dtos.PedidosDTO;
import br.com.senior.app.pedidos.pedidos.entities.Pedidos;
import br.com.senior.app.pedidos.pedidos.projections.PedidosProjection;
import br.com.senior.app.pedidos.pedidos.repositories.PedidosRepository;


@Service
public class PedidosService 
{
	@Autowired
	private PedidosRepository pedidosRepository;
	
	@Transactional(readOnly = true)
	public List<PedidosDTO> findAll()
	{
		List<Pedidos> result = pedidosRepository.findAll();
		List<PedidosDTO> dto = result.stream().map(x -> new PedidosDTO(x)).toList();
		
		return dto;
	}
	
	@Transactional(readOnly = true)
	public PedidosDTO findById(Long id)
	{
		Pedidos result = pedidosRepository.findById(id).get();
		return new PedidosDTO(result);	
	}
	
	@Transactional(readOnly = true)
	public List<PedidosByListDTO> findByList(Long pedidos)
	{
		List<PedidosProjection> result = pedidosRepository.searchByList(pedidos);
		return result.stream().map(x -> new PedidosByListDTO(x)).toList();
	}
	
	@Transactional
	public void cadastroPedido(Long pedido, String item, Long quantidade)
	{ 
		Pedidos pedidos = new Pedidos();
		
		pedidos.setPedido(pedido);
		pedidos.setItem(item);
		pedidos.setQuantidade(quantidade);
		
		pedidosRepository.save(pedidos);
	}
}