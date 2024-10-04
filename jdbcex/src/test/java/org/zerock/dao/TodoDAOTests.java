package org.zerock.dao;

import lombok.ToString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVO;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {
    // todoDAO를 어떤 메소드에서도 사용할 수 있도록 설정
    private TodoDAO todoDAO;
    //Test 메소드가 실행되기 전 반드시 실행되는 메소드
    @BeforeEach
    public void ready(){
        todoDAO = new TodoDAO();
    }
    @Test
    public void testTime() throws Exception{
        System.out.println(todoDAO.getTime());
        System.out.println(todoDAO.getTime2());
    }
    @Test
    public void testInsert() throws Exception{
        // 저장할 데이터 생성
        // builder() : java chain을 사용하기 위한 메소드
        TodoVO todoVO = TodoVO.builder()
                .title("Sample Title...")
                .dueDate(LocalDate.of(2021,12,31))
                .finished(false)
                .build();
        todoDAO.insert(todoVO);
        // 생성자, setter 를 설정하지 않고 builder 만 설정했기 때문에 생성자, setter 는 사용할 수 없음
//        TodoVO vo2 = new TodoVO("Sample Title2", LocalDate.of(2021,12,31), false );
    }
    @Test
    public void testSelectAll() throws Exception{
        List<TodoVO> list = todoDAO.selectAll();
        list.forEach(vo -> System.out.println(vo));
    }
    @Test
    public void testSElectOne() throws Exception{
        Long tno = 1l;
        TodoVO todoVO = todoDAO.selectOne(tno);
        System.out.println(todoVO);
    }

    @Test
    public void testDelete() throws Exception{
        todoDAO.delete(5L);
    }
    @Test
    public void testUpdate() throws Exception{
        TodoVO todoVO = TodoVO.builder()
                .tno(2L)
                .title("update title...")
                .dueDate(LocalDate.now())
                .finished(true)
                .build();
        todoDAO.update(todoVO);
    }
}
