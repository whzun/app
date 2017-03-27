package org.whz.app.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.whz.app.beans.Book;
import org.whz.app.dao.BookMapper;

@Service("bookService")
public class BookService {
	@Autowired
	private BookMapper bookMapper;
	
	public Book getBookById(int id){
		return bookMapper.selectByPrimaryKey(id);
	}
}
