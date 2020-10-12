package com.walmart.oms.dc.dcinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.oms.dc.dcinfo.model.DcInfo;
import com.walmart.oms.dc.dcinfo.service.DcInfoService;

@RestController
public class DcInfoController {
	
	@Autowired
	DcInfoService ds;

	
	@GetMapping(path="/getdcnbr/{store}/{item}",produces=MediaType.APPLICATION_JSON_VALUE)
	public int getDcNbr(@PathVariable("store")int store,@PathVariable("item")int item)
	{
		
		
		return ds.getReq(store,item);
	}
	
}
