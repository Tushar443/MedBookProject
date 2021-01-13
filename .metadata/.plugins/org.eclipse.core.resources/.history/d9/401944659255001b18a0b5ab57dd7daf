package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Record;
import com.cdac.repo.RecordRepo;

@Service
public class RecordService implements IRecordService {

	@Autowired
	private RecordRepo recordRepo;
	
	@Override
	public Record addRecord(Record record) {
		return recordRepo.save(record);
	}

}
