package com.eb.entity;

public class Post {

	private int post_id;
	private String post_name;
	private String post_comment;
	public Post(int post_id, String post_name, String post_comment) {
		super();
		this.post_id = post_id;
		this.post_name = post_name;
		this.post_comment = post_comment;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void disp() {
		System.out.println("post is:"+post_id+"\npost name:"+post_name+"\npost comment:"+post_comment);
	}

}
