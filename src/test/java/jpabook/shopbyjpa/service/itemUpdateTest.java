package jpabook.shopbyjpa.service;

import jpabook.shopbyjpa.domain.item.Book;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class itemUpdateTest {

    @Autowired EntityManager em;

    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        // TX
        book.setName("abcdefg");

        // 변경감지 == dirty checking
        // TX commit
    }
}
