package com.walmart.oms.dc.dcinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.walmart.oms.dc.dcinfo.dao.DcInfoDAO;
import com.walmart.oms.dc.dcinfo.model.DcInfo;

@Component
public class DcInfoService {
	
	@Autowired
	DcInfoDAO dd;

	public int getReq(int store,int item) {
		// TODO Auto-generated method stub
		return dd.getNbr(store,item);
	}

}
