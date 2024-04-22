package com.manytomanyrelation.model;
import javax.persistence.*;
@Entity
@Table(name="SUBJECT")
public class Subject {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "SUBJECT_ID")
 private long id;
	@Column(name="NAME")
 private String name;
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
@Override
public String toString() {
	return "Subject [id=" + id + ", name=" + name + "]";
}
public Subject( String name) {
	super();
	
	this.name = name;
}
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}

}
