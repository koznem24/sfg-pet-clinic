package com.koznem.sfgpetclinic.services.map;

import com.koznem.sfgpetclinic.model.Pet;
import com.koznem.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);
    }

    @Override
    public void deleleById(Long aLong) {
        super.deleteById(aLong);
    }


}
