package br.com.deal.CadastroClientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.deal.CadastroClientes.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
