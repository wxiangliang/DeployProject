package com.xl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MockitoTest {

    @Test
    public void listTest() {
        List<String> mockedList = mock(List.class);

        // using mock object
        mockedList.add("one");
        mockedList.clear();

        // verification
        verify(mockedList).add("one");
        verify(mockedList).clear();

        // stubbing using built-in anyInt() argument matcher
        when(mockedList.get(anyInt())).thenReturn("element");

        // following prints "element"
        System.out.println(mockedList.get(999));

        // you can also verify using an argument matcher
        verify(mockedList).get(anyInt());

        // argument matchers can also be written as Java 8 Lambdas
        verify(mockedList).add(argThat(someString -> someString.length() > 5));
    }

    @DisplayName("列表数量测试")
    @Test
    void mockAndSpy() {
        List<String> mockList = mock(List.class);
        // List<String> mockList = spy(new ArrayList<>());
        when(mockList.size()).thenReturn(100);

        mockList.add("A");
        mockList.add("B");
        assertEquals(100, mockList.size(), "数量不是100");
        assertEquals("A", mockList.get(0), "不是A");

    }

    @Test
    public void testText() {
        String text =
            "Hamcrest comes bundled with lots of useful matchers, but you’ll probably find that you need to create your own from time to time to fit your testing needs. This commonly occurs when you find a fragment of code that tests the same set of properties over and over again (and in different tests), and you want to bundle the fragment into a single assertion. By writing your own matcher you’ll eliminate code duplication and make your tests more readable!";
        assertThat(text, containsString("comes"));
        assertThat(text, Matchers.startsWith("Hamcrest"));
        assertThat(text, Matchers.endsWith("readable!"));
        assertThat(null, nullValue());
        assertThat("数据不相等", text, equalTo("readable!"));
    }
}
