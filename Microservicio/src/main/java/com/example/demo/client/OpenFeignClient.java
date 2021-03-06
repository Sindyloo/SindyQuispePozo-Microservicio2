package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.modelo.Cliente;

@FeignClient(name="idat-MicroservicioCliente1", url = "localhost:8081")
public interface OpenFeignClient {
	@GetMapping("/cliente/v1/listar")
	public List<Cliente> listarCliente();

}
