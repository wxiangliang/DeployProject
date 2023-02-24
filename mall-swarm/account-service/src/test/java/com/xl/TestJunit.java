package com.xl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;

@DisplayName("Junit5功能测试类")
public class TestJunit {
    @DisplayName("测试DisplayName注解---方法1")
    @Test
    public void testDisplayName1() {
        System.out.println(123);
    }

    @Disabled
    @DisplayName("测试DisplayName注解---方法2")
    @Test
    public void testDisplayName2() {
        System.out.println(456);
    }

    @BeforeEach
    public void testBeforeEach() {
        System.out.println("测试就要开始了....");
    }

    @AfterEach
    public void testAfterEach() {
        System.out.println("测试已经结束了....");
    }

    @BeforeAll
    public static void testBeforeAll() {
        System.out.println("所有测试就要开始了....");
    }

    @AfterAll
    public static void testAfterAll() {
        System.out.println("所有测试已经结束了....");
    }

    @DisplayName("测试Timeout注解")
    @Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
    @Test
    @Disabled
    public void testTimeout() throws InterruptedException {
        Thread.sleep(1000);
    }

    @RepeatedTest(5)
    @Test
    public void testRepeatedTest() {
        System.out.println(1);
    }

    // ----------------------------断言----------------------------

    /**
     * 如果前面的断言失败，则后面的代码不会再执行
     */
    @DisplayName("测试简单断言")
    @Test
    public void testSimpleAssertions() {
        int result = cal(1, 2);
        assertEquals(3, result, "业务逻辑计算结果出错....");
        Object obj1 = new Object();
        Object obj2 = new Object();
        assertNotSame(obj1, obj2);
    }

    public int cal(int x, int y) {
        return x + y;
    }

    @DisplayName(("测试组合断言"))
    @Test
    public void testAllAssertions() {
        assertAll("testAll", () -> assertTrue(true && true), () -> assertEquals(2, 2));
        // 当以上两个断言全部成功时，才会打印下面的内容
        System.out.println("success!!!");
    }

    @DisplayName("测试前置条件")
    @Test
    public void testAssumptions() {
        Assumptions.assumeTrue(true, "结果不是true....");
        System.out.println(111);
    }
}
