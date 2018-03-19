package com.syt.dto;

import java.util.List;

import com.syt.entity.City;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 封装json对象，所有返回结果都使用它
 */
@ApiModel(description= "返回响应数据")
public class Result<T> {
	
	@ApiModelProperty(value = "是否成功标志")
	private boolean success;
	
	@ApiModelProperty(value = "成功时返回的数据")
	private T data;
	
	@ApiModelProperty(value = "错误信息")
	private String error;// 

	public Result() {
	}

	// 成功时的构造器
	public Result(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	// 错误时的构造器
	public Result(boolean success, String error) {
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
