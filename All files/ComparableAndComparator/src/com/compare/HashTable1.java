package com.compare;

public class HashTable1 {
private int bookid;
private String bookname;
private String bookAuther;
private int bookprise;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getBookAuther() {
	return bookAuther;
}
public void setBookAuther(String bookAuther) {
	this.bookAuther = bookAuther;
}
public int getBookprise() {
	return bookprise;
}
public void setBookprise(int bookprise) {
	this.bookprise = bookprise;
}
public HashTable1(int bookid, String bookname, String bookAuther, int bookprise) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.bookAuther = bookAuther;
	this.bookprise = bookprise;
}


}
