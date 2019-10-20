package com.example.thymleaf_tuto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	private List<Employee> books = null; 
	
	public Page<Employee> findPaginated(Pageable pageable) {
		books = new ArrayList<Employee>();
		books.add(new Employee("1", "", "10"));
		books.add(new Employee("2", "", "10"));
		books.add(new Employee("3", "", "10"));
		books.add(new Employee("4", "", "10"));
		books.add(new Employee("5", "", "10"));
		books.add(new Employee("6", "", "10"));
		books.add(new Employee("7", "", "10"));
		books.add(new Employee("8", "", "10"));
		books.add(new Employee("9", "", "10"));
		books.add(new Employee("10", "", "10"));
		books.add(new Employee("11", "", "10"));
		books.add(new Employee("12", "", "10"));
		books.add(new Employee("13", "", "10"));
		books.add(new Employee("14", "", "10"));
		books.add(new Employee("15", "", "10"));
		books.add(new Employee("16", "", "10"));
		books.add(new Employee("17", "", "10"));
		books.add(new Employee("18", "", "10"));
		books.add(new Employee("19", "", "10"));
		books.add(new Employee("20", "", "10"));
		books.add(new Employee("22", "", "10"));
		books.add(new Employee("23", "", "10"));
		books.add(new Employee("24", "", "10"));
		
		
		int pageSize = pageable.getPageSize();
	        int currentPage = pageable.getPageNumber();
	        int startItem = currentPage * pageSize;
	        List<Employee> list;
	 
	        if (50 < startItem) {
	            list = Collections.emptyList();
	        } else {
	            int toIndex = Math.min(startItem + pageSize, books.size());
	            list = books.subList(startItem, toIndex);
	        }
	 
	        Page<Employee> bookPage
	          = new PageImpl<Employee>(list, PageRequest.of(currentPage, pageSize), books.size());
	 
	        return bookPage;
	    }
}
