package com.koznem.sftpetclinic.services;

import com.koznem.sftpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
