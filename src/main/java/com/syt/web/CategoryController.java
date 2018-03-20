package com.syt.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syt.dto.Result;
import com.syt.entity.Category;
import com.syt.service.CategoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/category")
@Api(value = "/category", tags = "栏目相关接口")
public class CategoryController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ApiOperation(value = "获取栏目数据", notes = "获取全部栏目的信息", httpMethod = "GET")
	@ResponseBody
	private Result<List<Category>> list() {
		Result<List<Category>> rsl = new Result<List<Category>>();
		try {
//			String s=null;
//			s.length();
			List<Category> list = categoryService.getList();
			rsl.setCode(1);
			rsl.setData(list);
		} catch (Exception e) {
			e.printStackTrace();
			rsl.setCode(-1);
			rsl.setError("服务异常，请稍后重试");
		}
		return rsl;
	}

}
