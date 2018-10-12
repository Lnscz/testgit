package com.blog.service;

import java.util.List;

import com.blog.daoImp.SortDaoImp;
import com.blog.pojo.Sort;

public class SortService {
	SortDaoImp sortDaoImp = new SortDaoImp();
	public boolean insertSort(Sort sort){
		return sortDaoImp.insertSort(sort);
	}
	public List<Sort> selectSort(String sname){
		return sortDaoImp.selectSort(sname);
	}
	public boolean deleteSort(String sname){
		return sortDaoImp.deleteSort(sname);
	}
	public boolean updateSort(String sname){
		return sortDaoImp.updateSort(sname);
	}
}
