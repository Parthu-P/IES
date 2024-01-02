package com.parthu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parthu.entity.IESEntity;
import com.parthu.repository.IESRepo;

@Service
public class IESServiceImpl implements IESService {

	@Autowired
	private IESRepo repo;

	@Override
	public IESEntity iesRecord(IESEntity iesrecord) {

		IESEntity entity = new IESEntity();
		BeanUtils.copyProperties(iesrecord, entity);
		repo.save(entity);
		return entity;
	}

	@Override
	public IESEntity iesGetRecord(Integer id) {
		Optional<IESEntity> findById = repo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		} else {
			return null;
		}
	}

	@Override
	public List<IESEntity> iesGetRecordBasedOnName(String value) {
		List<IESEntity> findByName = repo.findByName(value+"%");
		return findByName;
	}

}
