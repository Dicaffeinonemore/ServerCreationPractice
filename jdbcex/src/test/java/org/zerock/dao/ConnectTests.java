package org.zerock.dao;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectTests {
    // 서버를 실행하지 않아도 테스트를, 코드를 실행하도록 하는 어노테이션
    @Test
    public void test1(){
        int v1 =20;
        int v2 =20;
        // 같으면 정상실행, 다르면 테스트 실패를 띄우는 메소드
        Assertions.assertEquals(v1, v2);
    }

    @Test
    public void testConnection() throws Exception{
        //mariadb 임포트
        Class.forName("org.mariadb.jdbc.Driver");
        // Connection : 데이터베이스에 접속하기 위한 설정
        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3307/webdb",
                "webuser",
                "webuser"
        );
        Assertions.assertNotNull(connection);
        connection.close();
        // 앞으로 에러가 나면 콘솔창에 에러 문장 복붙해서 인터넷 검색을 해서 찾아보자.
    }
    @Test
    public void testHikariCP() throws Exception{
        // HikariCP : Connection Pool을 사용하기 위한 라이브러리
        // Connection Pool : 데이터베이스에 접속하는 과정의 시간을 줄이기 위해서 사용하는 시술
        // HikariCP 설정
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3307/webdb");
        config.setUsername("webuser");
        config.setPassword("webuser");
        // 커넥션 저장 공간
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtsCacheSize", "250");
        config.addDataSourceProperty("prepStmtsCacheSqlimit", "2048");
        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = ds.getConnection();

        System.out.println();
    }
}
