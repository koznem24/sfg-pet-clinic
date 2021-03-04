package com.koznem.sftpetclinic.services;

import com.koznem.sftpetclinic.model.Vet;

import java.util.Set;

public interface VetService {


    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
