package com.koznem.sfgpetclinic.services.map;

import com.koznem.sfgpetclinic.model.Owner;
import com.koznem.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
        return super.save(object.getId(),object);
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
