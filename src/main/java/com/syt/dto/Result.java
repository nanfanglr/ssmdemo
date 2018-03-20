package com.syt.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 封装json对象，所有返回结果都使用它
 */
@ApiModel(description= "返回响应数据")
public class Result<T> {
	
//	@ApiModelProperty(value = "是否成功标志")
//	private boolean success;
	
	@ApiModelProperty(value = "返回码，正常返回为 1")
	private int code;
	
	@ApiModelProperty(value = "成功时返回的数据")
	private T data;
	
	@ApiModelProperty(value = "错误信息")
	private String error;// 

	public Result() {
	}

	// 成功时的构造器
	public Result(int code, T data) {
		this.code = code;
		this.data = data;
	}

	// 错误时的构造器
	public Result(int code, String error) {
		this.code = code;
		this.error = error;
	}

//	public boolean isSuccess() {
//		return success;
//	}
//
//	public void setSuccess(boolean success) {
//		this.success = success;
//	}

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

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	

}
