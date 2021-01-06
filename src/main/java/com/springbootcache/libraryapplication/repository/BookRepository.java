package com.springbootcache.libraryapplication.repository;

import com.springbootcache.libraryapplication.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends JpaRepository<Book,Long> {

    @Query("update Book u set u.name=?2 where u.id=?1")
    int updateAddress(long id, String name);
}
