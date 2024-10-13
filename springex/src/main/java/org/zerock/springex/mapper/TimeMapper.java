package org.zerock.springex.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    // 간단한 sql을 실행하는 mybatis
    //@Select("SELECT SQL 작성")
    @Select("SELECT now()")
    String getTime();
}
