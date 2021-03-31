package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import kr.ac.kopo.Log4j;

@Log4j
public class JDBCtest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 테스트코드 작성, con 객체 생성
	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"hs",
				"qwer123")){
			System.out.println(con);
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
}