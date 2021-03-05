package com.koznem.sfgpetclinic.services;

import com.koznem.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
