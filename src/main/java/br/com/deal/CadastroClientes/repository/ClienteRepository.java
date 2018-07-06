package br.com.deal.CadastroClientes.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.deal.CadastroClientes.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
