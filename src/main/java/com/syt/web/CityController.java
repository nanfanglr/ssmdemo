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
import com.syt.entity.City;
import com.syt.service.CityService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/city")
@Api(value = "/city", tags = "城市相关接口")
public class CityController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CityService cityService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ApiOperation(value = "获取城市数据", notes = "获取全部城市相关信息", httpMethod = "GET")
	@ResponseBody
	private Result<List<City>> list() {
		Result<List<City>> rsl = new Result<List<City>>();
		try {
//			String s=null;
//			s.length();
			List<City> list = cityService.getList();
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
