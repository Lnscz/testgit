package com.blog.dao;

import java.util.List;

import com.blog.pojo.Sort;

public interface SortDao {
	public boolean insertSort(Sort sort);
	public List<Sort> selectSort(String sname);
	public boolean deleteSort(String sname);
	public boolean updateSort(String sname);
}
