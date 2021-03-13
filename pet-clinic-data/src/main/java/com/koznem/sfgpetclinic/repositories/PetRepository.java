package com.koznem.sfgpetclinic.repositories;

import com.koznem.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
