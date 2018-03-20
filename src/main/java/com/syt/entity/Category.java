package com.syt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "返回栏目的响应数据")
public class Category {
	
	@ApiModelProperty(value = "栏目id")
	private int catId;
	@ApiModelProperty(value = "栏目名称")
	private String catName;
	@ApiModelProperty(value = "栏目编码：推荐/热点 /图片/视频 /求购/------rec/hot/pic/vdo/buy/ ")
	private String code;
	@ApiModelProperty(value = "排序号：有排序时可用 ,")
	private int seqNum;
	@ApiModelProperty(value = "栏目类型：我的/默认----MY/DF")
	private String type;
	
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getSeqNum() {
		return seqNum;
	}
	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
