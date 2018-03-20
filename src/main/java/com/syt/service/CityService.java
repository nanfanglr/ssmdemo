package com.syt.service;

import java.util.List;

import com.syt.entity.City;

public interface CityService {
	/**
	 * 获取城市数据
	 * @return
	 */
    List<City> getList();
}
