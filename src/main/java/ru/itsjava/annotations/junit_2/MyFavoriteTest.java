package ru.itsjava.annotations.junit_2;

public class MyFavoriteTest {

    @BeforeAll
    public void beforeAllMethod(){
        System.out.println("BEFORE ALL");
    }

    @Before
    public void beforeMethod(){
        System.out.println("BEFORE TEST");
    }

    @After
    public void afterMethod(){
        System.out.println("AFTER METHOD");
    }

    @AfterAll
    public void afterAllMethod(){
        System.out.println("AFTER ALL METHODS");
    }

    @Test
    public void test1(){}

    @Test
    public void test2(){}

    @Test
    public void test3(){
        throw new RuntimeException();
    }

    @Test
    public void test4(){
        throw new RuntimeException();
    }

    public void noTestMethod(){}


}
