/**
 * 
 */
package com.poli.webapi.config.datasource.pager;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Administrator
 *
 */
public class Pager extends OutWithError {
	public Pager() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer page = 1;
	private Integer size = 20;

	/**
	 * @return the page
	 */
	@JsonIgnore
	public Integer getPage() {
		return page;
	}

	/**
	 * @param page
	 *            the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * @return the size
	 */
	@JsonIgnore
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * @param totalCount
	 * @return
	 */
	public boolean getHasMore(int totalCount) {
		return totalCount > this.getPage() * this.getSize();
	}
}
