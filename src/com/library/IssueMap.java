package com.library;

import java.awt.List;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IssueMap {
	
	    private Map<Integer, Set<IssueDetails>> student_book;
	    private Map<Integer, Set<IssueDetails>> book_student;
	    
	    private void getStudentsforBookId(Integer bookId){
	        Set<IssueDetails> list = book_student.get(bookId);
	    }
	    
	    private void getBooksForStudent(Integer studentId){
	        Set<IssueDetails> list = student_book.get(studentId);
	    }
	   
	    private Set<IssueDetails> addStudentsforBookId(Integer bookId, Integer StuduntId){
	        IssueDetails issueDetails = new IssueDetails();
	        issueDetails.setBookid();
	        issueDetails.setStudentid();;
	        issueDetails.setDate() ;     
	        Set<IssueDetails> set = book_student.get(bookId);
	        if(set == null){
	            set = new HashSet<>();
	        }
	        set.add(issueDetails);
	        return book_student.put(bookId, set);
	    }

	    private Set<IssueDetails> setBooksForStudent(Integer studentId){
	        Set<IssueDetails> list = student_book.get(studentId);
			return list;
	    }

	    private Set<IssueDetails> removeStudentsforBookId(Integer bookId,Integer StuduntId){
	        IssueDetails issueDetails = new IssueDetails();
	        issueDetails.setBookid();
	        issueDetails.setStudentid();;
	        issueDetails.setDate();;
	        Set<IssueDetails> set = book_student.get(bookId);
	        if(set == null){
	            set = new HashSet<>();
	        }
	        set.add(issueDetails);
	        return book_student.put(bookId, set);
	    }

	}

