package com.koznem.sfgpetclinic.services.map;

import com.koznem.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;
    final String ownerTelephone = "89789798";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().telephone(ownerTelephone).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1,ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(1L);
        assertEquals(1L,owner.getId());
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleleById() {
    }

    @Test
    void findByLastName() {
    }
}