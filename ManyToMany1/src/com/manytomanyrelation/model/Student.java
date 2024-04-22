package com.manytomanyrelation.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.*;
@Entity
@Table(name="STUDENT")
public class Student {
	 
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name = "STUDENT_ID")
	    private long id;
	 
	    @Column(name = "FIRST_NAME")
	    private String firstName;
	 
	    @Column(name = "LAST_NAME")
	    private String lastName;
	 
	    //cascade={PERSIST, MERGE, REMOVE, REFRESH, DETACH}.whenever we map one entity to another 
	    //we will perform all the operations like merge,refresh etc so table gets autoupdate 
	    //with the help of CascadeType.ALL
	    @ManyToMany(cascade = CascadeType.ALL)
	    // inverseJoinColumns is will act as foregin key
	    @JoinTable(name = "STUDENT_SUBJECT", 
	             joinColumns = { @JoinColumn(name = "STUDENT_ID") }, 
	             inverseJoinColumns = { @JoinColumn(name = "SUBJECT_ID") })
	    private List<Subject> subjects = new ArrayList<Subject>();
	 
	    public Student() {
	    }
	 
	    public Student(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }
	 
	    public long getId() {
	        return id;
	    }
	 
	    public void setId(long id) {
	        this.id = id;
	    }
	 
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    public String getLastName() {
	        return lastName;
	    }
	 
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	 
	    public List<Subject> getSubjects() {
	        return subjects;
	    }
	 
	    public void setSubjects(List<Subject> subjects) {
	        this.subjects = subjects;
	    }
	 
	   
	
	    @Override
	    public String toString() {
	        return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
	                + lastName + "]";
	    }
	 
	}