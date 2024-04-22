package com.manytomany.model;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="tags")
public class Tag {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long id;

	@Column(name="TagName")
private String name;

	@ManyToMany(mappedBy="tags")
private List<Post>posts;

public Tag() {
	super();
	// TODO Auto-generated constructor stub
}

public Tag(String name) {
	super();
	this.name = name;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Post> getPosts() {
	return posts;
}

public void setPosts(List<Post> posts) {
	this.posts = posts;
}
}