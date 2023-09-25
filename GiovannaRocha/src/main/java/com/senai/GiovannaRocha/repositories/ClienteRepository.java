package com.senai.GiovannaRocha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.GiovannaRocha.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
