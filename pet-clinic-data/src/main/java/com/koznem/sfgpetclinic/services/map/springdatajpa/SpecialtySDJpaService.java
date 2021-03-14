package com.koznem.sfgpetclinic.services.map.springdatajpa;

import com.koznem.sfgpetclinic.model.Specialty;
import com.koznem.sfgpetclinic.repositories.SpecialtyRepository;
import com.koznem.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;


    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }


    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty specialty) {
        specialtyRepository.delete(specialty);
    }

    @Override
    public void deleleById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
