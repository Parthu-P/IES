package com.parthu.service;

import java.util.List;

import com.parthu.entity.IESEntity;

public interface IESService {
 
	public IESEntity iesRecord(IESEntity iesrecord);
	public IESEntity iesGetRecord(Integer id);
	public List<IESEntity> iesGetRecordBasedOnName(String value);
}
