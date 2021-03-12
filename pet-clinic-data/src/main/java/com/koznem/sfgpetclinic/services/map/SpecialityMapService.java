package com.koznem.sfgpetclinic.services.map;

import com.koznem.sfgpetclinic.model.Specialty;
import com.koznem.sfgpetclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialitiesService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);
    }

    @Override
    public void deleleById(Long aLong) {
        super.deleteById(aLong);
    }
}
