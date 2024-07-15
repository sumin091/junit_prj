package kr.co.sist.test.day0320;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import kr.co.sist.day0320.Work;

class TestWork {

//	@DisplayName("0~9까지 난수 테스트")
//	@Test
//	void testRandomNum() {
//		//given
//		Work work= new Work();
//		//when
//		int num= work.randomNum();
//		System.out.println(num);
//		//then
//		assertNotEquals(num, 0);
//	}
	
	@DisplayName("0~11까지 범위 난수 테스트")
	@Test
	void testRandomNum() {
		//given
		Work work= new Work();
		//when
//		int dataSize= work.randomNum();	//DB를 조회 했더니만 몇개의 행이 나올지 모름
		int dataSize= 26;
		System.out.println(dataSize);
		//then
		assertEquals(dataSize, 15, 10);	//발생한값, 결과값, 오차범위
		//발생한 값이 결과값까지 오차범위 안쪽이니? (발생한 20이 15까지 10내의 범위인가?) => true
		//발생한 26이 15까지 10내의 범위인가? => 16의 범위 false
	}

}
