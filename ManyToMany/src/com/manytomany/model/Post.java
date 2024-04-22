package com.manytomany.model;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="posts")
public class Post {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
public Post() {
	super();
	// TODO Auto-generated constructor stub
}

public Post(String title) {
	super();
	this.title = title;
}

@Column(name="TITLE")
	private String title;
	
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="post_tag",
joinColumns=@JoinColumn(name="post_id"),
inverseJoinColumns=@JoinColumn(name="tag_id"))

	private List<Tag>tags;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}