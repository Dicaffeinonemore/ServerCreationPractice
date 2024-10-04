package org.zerock.jdbcex.dto;

import lombok.*;

import java.time.LocalDate;

// VO : 데이터베이스의 테이블을 구현한 객체, 데이터베이스에서 데이터를 꺼내거나 취득할 때 사용
// DTO : 화면에 출력하는 내용을 구현한 객체, 화면에 출력하거나 데이터를 변경
@Builder
// DTO 클래스에 사용하는 @Date 어노테이션
// @Getter, @Setter, @RequiredArgsConstructor, @toString, @HashCode, @equals
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}

