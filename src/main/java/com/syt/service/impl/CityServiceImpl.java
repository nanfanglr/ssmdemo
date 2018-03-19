package com.syt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syt.dao.CityDao;
import com.syt.entity.City;
import com.syt.service.CityService;

@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private CityDao cityDao;
    
    
	@Override
	public List<City> getList() {
		return cityDao.queryCity();
	}
	
}
