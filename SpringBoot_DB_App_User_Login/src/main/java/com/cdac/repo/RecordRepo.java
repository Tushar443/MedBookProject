package com.cdac.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cdac.dto.Record;
@Repository
public interface RecordRepo extends CrudRepository<Record, Long>{

	

}
