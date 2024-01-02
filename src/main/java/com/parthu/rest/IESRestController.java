package com.parthu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.parthu.entity.IESEntity;
import com.parthu.service.IESServiceImpl;

@RestController
public class IESRestController {

	@Autowired
	private IESServiceImpl service;
	
	@PostMapping("/ies")
	@ResponseStatus(HttpStatus.CREATED)
	public IESEntity iesRecord(@RequestBody IESEntity ies) {
		IESEntity iesRecord = service.iesRecord(ies);
		return iesRecord;
	}
	
	@GetMapping("/iesget{id}")
	@ResponseStatus(HttpStatus.OK)
	public IESEntity iesGetRecord(@PathVariable("id") Integer id) {
		IESEntity iesGetRecord = service.iesGetRecord(id);
		return iesGetRecord;
		
	}
	
	@GetMapping("/iesgetname{value}")
	@ResponseStatus(HttpStatus.OK)
	public List<IESEntity> iesGetRecordBasedOnName(@PathVariable("value") String value) {
		List<IESEntity> iesGetRecordBasedOnName = service.iesGetRecordBasedOnName(value);
		return iesGetRecordBasedOnName;
		
	}
}
