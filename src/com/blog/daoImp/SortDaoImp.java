package com.blog.daoImp;

import java.util.List;

import com.blog.dao.SortDao;
import com.blog.pojo.Sort;
import com.blog.toolUtil.DbUtil;

public class SortDaoImp implements SortDao {

	@Override
	public boolean insertSort(Sort sort) {
		String sql="insert into sort (sname,uid,isShow) values(?,?,?)";
		Object[] obj={sort.getSname(),sort.getUid(),sort.getIsShow()};
		int result=DbUtil.executeUpdate(sql, obj);
		if(result>0){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public List<Sort> selectSort(String sname) {
		// TODO Auto-generated method stub
			String sql = "select * form sort";
			Object[] obj={};
		   List<Sort> listSort=DbUtil.getbeanClass(Sort.class, sql, obj);
		   if(listSort.size()>0){
			   return listSort;
		   }else{
			   return null;
		   }
			
		
	}

	@Override
	public boolean deleteSort(String sname) {
		// TODO Auto-generated method stub
		String sql="delete from sort where sname=?";
		Object[] obj={sname};
		int result=DbUtil.executeUpdate(sql, obj);
		if(result>0){
			return true;
		}else{
		   return false;
		}
	}

	@Override
	public boolean updateSort(String sname) {
		// TODO Auto-generated method stub
		Sort sort=new Sort();
		String sql="update sort set sname=?,uid=?,isShow=? where sname=?";
		Object[] obj={sname,sort.getUid(),sort.getIsShow()};
		int result=DbUtil.executeUpdate(sql, obj);
		if(result>0){
			return true;
		}else{
		  return false;
		}
	}

}
