package com.syt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syt.dao.CategoryDao;
import com.syt.entity.Category;
import com.syt.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{
	
    @Autowired
    private CategoryDao categoryDao;
    
    
	@Override
	public List<Category> getList() {
		return categoryDao.queryCategory();
	}
	
}
