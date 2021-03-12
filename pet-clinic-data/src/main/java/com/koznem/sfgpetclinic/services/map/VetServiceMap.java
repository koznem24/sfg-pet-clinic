package com.koznem.sfgpetclinic.services.map;

import com.koznem.sfgpetclinic.model.Specialty;
import com.koznem.sfgpetclinic.model.Vet;
import com.koznem.sfgpetclinic.services.SpecialtyService;
import com.koznem.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }

    @Override
    public void deleleById(Long aLong) {
        super.deleteById(aLong);
    }
}
