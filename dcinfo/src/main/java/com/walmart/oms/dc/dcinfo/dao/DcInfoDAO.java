package com.walmart.oms.dc.dcinfo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.walmart.oms.dc.dcinfo.model.DcInfo;

@Repository
public class DcInfoDAO {
	
	@Autowired
	JdbcTemplate jtemp;

	public int getNbr(int store,int item) {
		String sql="SELECT dcnbr FROM dc_info.dc_number where store=? and item=?";
		int dcnbr=(int)jtemp.queryForObject(sql,new Object[] {store,item},Integer.class );
		return dcnbr;
	}

}
