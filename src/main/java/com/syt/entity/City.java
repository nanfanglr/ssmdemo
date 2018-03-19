package com.syt.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 */
@ApiModel(description= "返回城市的响应数据")
public class City {
	
	@ApiModelProperty(value = "城市id")
	private int id;
	@ApiModelProperty(value = "城市名称")
	private String name;
	@ApiModelProperty(value = "城市英文")
	private String sortKey;
	@ApiModelProperty(value = "城市热度")
	private int hot;

	public City() {
	}

	public City(int id, String name, String sortKey, int hot) {
		super();
		this.id = id;
		this.name = name;
		this.sortKey = sortKey;
		this.hot = hot;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSortKey() {
		return sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	public int getHot() {
		return hot;
	}

	public void setHot(int hot) {
		this.hot = hot;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", sortKey=" + sortKey
				+ ", hot=" + hot + "]";
	}

}
