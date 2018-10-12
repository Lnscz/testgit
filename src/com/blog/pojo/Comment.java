package com.blog.pojo;

public class Comment {
	private int cid;
	private String content;
	private String ctime;
	//ÆÀÂÛµÄidºÅ
	private int answerid;
	private int uid;
	private int subid;
	private int aid;
	
	public Comment() {
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
}
