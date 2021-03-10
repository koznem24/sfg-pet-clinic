package com.koznem.sfgpetclinic.services.map;

import com.koznem.sfgpetclinic.model.Owner;
import com.koznem.sfgpetclinic.model.Pet;
import com.koznem.sfgpetclinic.services.OwnerService;
import com.koznem.sfgpetclinic.services.PetService;
import com.koznem.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        if(object != null){
            if(object.getPets() != null)
                object.getPets().forEach(pet->{
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });

            return super.save(object);
        }else{
            return null;
        }

    }

    @Override
    public void delete(Owner t) {
        super.delete(t);
    }

    @Override
    public void deleleById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
