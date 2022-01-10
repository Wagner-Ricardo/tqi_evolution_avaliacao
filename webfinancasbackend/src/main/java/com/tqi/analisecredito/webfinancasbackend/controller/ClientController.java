package com.tqi.analisecredito.webfinancasbackend.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//permitindo o consumo  das informações pelo frontEnt Angular
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.tqi.analisecredito.webfinancasbackend.exception.ResourceNotFoundExecption;
import com.tqi.analisecredito.webfinancasbackend.model.ClienteFisicaBD;
import com.tqi.analisecredito.webfinancasbackend.repository.ClientRepository;

// imports refere-se as anotações para executar um CRUD

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




//permitindo que  aplicação front possa utilizar as informações do banco

@RestController @CrossOrigin(origins= "http://localhost:8087")
@RequestMapping("/api/V1")//end point
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/clientesFisica")
	public List<ClienteFisicaBD>getAllClienteFisicaBD(){
		return clientRepository.findAll();
	}
	
	@GetMapping("/clientesFisica/{idCliente}")
	public ResponseEntity<ClienteFisicaBD>getClienteFisicoById(@PathVariable(value ="id") long idCliente)
		throws  ResourceNotFoundExecption{
		ClienteFisicaBD clienteFisicaBD = clientRepository.findById(idCliente)
				.orElseThrow(()-> new ResourceNotFoundExecption("Cliente not found::" + idCliente));
		return ResponseEntity.ok().body(clienteFisicaBD);
	
	}
	@PostMapping("/clientesFisica")
	public ClienteFisicaBD createClient (@Valid @RequestBody ClienteFisicaBD clienteFisicaBD) {
		return clientRepository.save(clienteFisicaBD);
	}
	
	@PutMapping("/clientesFisica/{idCliente}")
	public ResponseEntity<ClienteFisicaBD>updateCliente(@PathVariable(value = "idCliente") Long idCliente,@Valid @RequestBody ClienteFisicaBD clienteDetails)
			throws ResourceNotFoundExecption{
		
		ClienteFisicaBD clienteFisicaBD = clientRepository.findById(idCliente)
				.orElseThrow(()-> new ResourceNotFoundExecption("Cliente not Found for this id"+idCliente));
		clienteFisicaBD.setNome( clienteDetails.getNome());
		clienteFisicaBD.setData( clienteDetails.getData());
		clienteFisicaBD.setCpf(clienteDetails.getCpf());
		clienteFisicaBD.setEmail(clienteDetails.getEmail());
		clienteFisicaBD.setHora(clienteFisicaBD.getHora());
		clienteFisicaBD.setId(clienteDetails.getId());
		clienteFisicaBD.setRg(clienteFisicaBD.getRg());
		
		
		final ClienteFisicaBD updateCliente= clientRepository.save(clienteFisicaBD);
		return ResponseEntity.ok(updateCliente);
		
	}
	
	@DeleteMapping("/clientesFisica/{idCliente}")
	public Map<String, Boolean> deleteCliente(@PathVariable(value = "idCliente")Long idCliente)throws ResourceNotFoundExecption{
		ClienteFisicaBD  clienteFisicaBD = clientRepository.findById(idCliente).orElseThrow(()->new ResourceNotFoundExecption("Cliente not Found for this id"+ idCliente));
		clientRepository.delete(clienteFisicaBD);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;

	}
	
}
