package com.br.alchieri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.alchieri.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
