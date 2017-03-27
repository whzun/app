package org.whz.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.whz.app.beans.Book;

@Repository
@Transactional
public interface BookMapper {
	List<Book> getAllUser();
	Book selectByPrimaryKey(int id);
}
