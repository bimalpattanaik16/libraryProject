package com.library;
import java.util.Date;
public class IssueDetails {
	private int studentid;
	private int    bookid;
    Date issue_date = new Date(System.currentTimeMillis());
	
	Date return_Date = new Date(System.currentTimeMillis()+(5*24*60*60*1000));

	public IssueDetails() {
		super();
		this.studentid = studentid;
		this.bookid = bookid;
		this.issue_date = issue_date;
		this.return_Date = return_Date;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid() {
		this.studentid = studentid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid() {
		this.bookid = bookid;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public Date getReturn_Date() {
		return return_Date;
	}

	public void setReturn_Date(Date return_Date) {
		this.return_Date = return_Date;
	}

	public void setDate() {
		// TODO Auto-generated method stub
		
	}

	
}
