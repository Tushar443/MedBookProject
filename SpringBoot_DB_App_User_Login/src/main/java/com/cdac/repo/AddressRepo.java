package com.cdac.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.dto.Address;
@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {

}
