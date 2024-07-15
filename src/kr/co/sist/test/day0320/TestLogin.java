package kr.co.sist.test.day0320;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kr.co.sist.day0320.LoginDAO;
import kr.co.sist.day0320.LoginResultVO;
import kr.co.sist.day0320.LoginVO;

class TestLogin {
	@DisplayName("객체가 얻어 지는지")
	@Test
	void testGetInstance() {
		//given
		LoginDAO lDAO= LoginDAO.getInstance();
		//when
		//then
		assertNotNull(lDAO);
	}

//	@Disabled
	@DisplayName("로그인 결과")
	@Test
	void testSelectLogin() throws SQLException {
		//given
		LoginDAO lDAO= LoginDAO.getInstance();
		//when
		LoginVO lVO= new LoginVO("jin","1234");
		LoginResultVO lrVO= lDAO.selectLogin(lVO);
		String name=lrVO.getName();
		//then
//		assertNotNull(lrVO);
//		assertEquals(name, "진수현");
		assertEquals(name, "짐승현");
	}//testSelectLogin

	@BeforeEach
	void beforeEach() {
		System.out.println("test method가 호출되기 전 실행되어야할 코드");
	}
	
	@AfterEach
	void aferEach() {
		System.out.println("test method가 호출된 후 실행되어야할 코드");
	}
	 
	@BeforeAll
	static void beforeAll() {
		System.out.println("모든 testMethod가 실행되기 전 한번만 호출되어야할 코드");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("모든 testMethod가 실행된 후 한번만 호출되어야할 코드");
	}
}//class
