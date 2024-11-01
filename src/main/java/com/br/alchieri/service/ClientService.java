package com.br.alchieri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.alchieri.model.Client;
import com.br.alchieri.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client salvar(Client client) {
        return clientRepository.save(client);
    }
}
