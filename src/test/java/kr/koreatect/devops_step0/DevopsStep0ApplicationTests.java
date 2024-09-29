package kr.koreatect.devops_step0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsStep0ApplicationTests {

	@Test
	void contextLoads() {
	}

	//두수 더하는 메서드
	int add(int a, int b) {
		return a+b;
	}

	@Test
	void testAdd1() {
		int result = add(10, 20);
		assertEquals(30, result);
	}

	@Test
	void testAdd2() {
		int result = add(10, 20);
		// assertEquals(20, result); 수정하면 자동 빌드 가능함
		assertEquals(30, result);
	}
}
