package com.syt.service;

import java.util.List;

import com.syt.entity.Category;

public interface CategoryService {
	/**
	 * 获取栏目数据
	 * @return
	 */
    List<Category> getList();
}
