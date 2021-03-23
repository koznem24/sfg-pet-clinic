package com.koznem.sfgpetclinic.services.map;

import com.koznem.sfgpetclinic.model.Pet;
import com.koznem.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {

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
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }


}
