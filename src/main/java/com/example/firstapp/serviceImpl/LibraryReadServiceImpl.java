package com.example.firstapp.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.firstapp.entity.Library;
import com.example.firstapp.Repository.LibraryRepository;

@Service
public class LibraryReadServiceImpl {
	
    @Autowired
    LibraryRepository readRepository;
    public List<Library> getAllLibrary(){
    	return readRepository.findAll();
    }
    
    public List<Library> getAlllibrariesWithNoBooks() {
    	Library libraryWithNoBooks = new Library();
    	libraryWithNoBooks.setCommaSeparatedBookName("");
    	//System.out.println(libraryWithNoBooks);
    	ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("commaSeparatedBookName",
    			ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("id","name");
    	Example<Library> example = Example.of(libraryWithNoBooks, exampleMatcher);
    	return readRepository.findAll(example);
    }
    
    public Page<Library> getLibrariesPaged() {
    	
    	Pageable first3records = PageRequest.of(0, 3);
    	return readRepository.findAll(first3records);
    	
    }

}
