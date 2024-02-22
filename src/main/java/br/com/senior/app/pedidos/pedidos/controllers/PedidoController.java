package br.com.senior.app.pedidos.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.app.pedidos.pedidos.dtos.PedidosByListDTO;
import br.com.senior.app.pedidos.pedidos.dtos.PedidosDTO;
import br.com.senior.app.pedidos.pedidos.services.PedidosService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController 
{
	@Autowired
	private PedidosService pedidosService;
	
	@GetMapping
	public List<PedidosDTO> findAll()
	{
		List<PedidosDTO> result = pedidosService.findAll();
		return result;
	}	
	
	@GetMapping("/{pedidos}")
	public List<PedidosByListDTO> findByList(@PathVariable Long pedidos)
	{
		List<PedidosByListDTO> result = pedidosService.findByList(pedidos);
		return result;
	}
	
	@PostMapping("/cadastro")
	public ResponseEntity<String> cadastro(@RequestBody PedidosDTO body)
	{
		pedidosService.cadastroPedido(body.getPedido(),body.getItem(), body.getQuantidade());
		return ResponseEntity.status(HttpStatus.OK).body("Pedido cadastrado com sucesso.");   
	}
}
