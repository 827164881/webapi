package com.poli.webapi.config.datasource.pager;

import java.util.List;

/**
 * 
 * @author ted
 *
 * @param <T>
 * 主要参数：<br>
 * totalCount
 * 符合查询条件结果总数量<br>
 * result
 * 符合查询条件的结果<br><br>
 * 主要方法<br>
 * getHasMore
 * 是否还有下一页
 * 
 */
public class PagerOut<T> extends Pager {
    public PagerOut(Pager pager) {
        super.setPage(pager.getPage());
        super.setSize(pager.getSize());

    }

    //符合查询条件结果总数量
    private Integer totalCount;
    //返回结果
    private List<T> result;

    /**
     * 一共有多少页
     * @return
     */
    public int getTotalPages() {
        return this.getTotalCount() % this.getSize() == 0 ? this
                .getTotalCount() / this.getSize() : this.getTotalCount()
                / this.getSize() + 1;
    }

    /**
     * 返回的列表
     * @return
     */
    public List<T> getResult() {
        return result;
    }

    /**
     * 
     * @param result 查询结果
     * @return 0 查询成功
     * 1查询失败 查询条件有问题
     */
    public int setResult(List<T> result) {
        if (result instanceof com.github.pagehelper.Page) {
            com.github.pagehelper.Page page = (com.github.pagehelper.Page) result;
            this.totalCount = (int) page.getTotal();
            this.result = page;
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * 是否还有下一页
     * 
     * @return
     */
    public boolean getHasMore() {
        if (null != this.getTotalCount())
            return this.getTotalCount() > this.getPage() * this.getSize();
        return false;
    }

    /**
     * 满足条件的总记录数
     * @return the totalCount
     */
    public Integer getTotalCount() {
        if(null == totalCount)
            return 0;
        return totalCount;
    }

    /**
     * @param totalCount the totalCount to set
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

	public void setResultNoTotalCount(List<T> result) {
		this.result = result;
	}
}
