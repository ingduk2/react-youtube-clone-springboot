package com.ingduk2.ytclone.domain.test;

import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestRepositoryTest {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    StoreRepository storeRepository;
    @Autowired
    StoreTwoRepository storeTwoRepository;

    @Test
    public void saveBook(){
        Book book = Book.builder().name("book2").build();

        bookRepository.save(book);

//        Store store = Store.builder().name("store1").book(book).build();

    }

    @Test
    public void saveStore(){
        ObjectId oid = new ObjectId("5f28340d67eb30374720c7c6");
        Book book = bookRepository.findById(oid).get();
        Store store = Store.builder().name("store1").book(book).build();

        storeRepository.save(store);
    }

    @Test
    public void select(){
        List<Book> bookList = bookRepository.findAll();
        System.out.println(bookList);

        List<Store> storeList = storeRepository.findAll();
        System.out.println(storeList);
    }

    @Test
    public void saveStoreStringRef(){
        StoreTwo storeTwo= StoreTwo.builder().name("Store2").bookId("5f2838a2985091778bea6439").build();
        storeTwoRepository.save(storeTwo);
    }
}