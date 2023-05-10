package badera.kate.docs.doc;

import org.junit.jupiter.api.*;

public class Junit5Examples {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests!");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After all tests!");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("Before test!");
    }
    @AfterEach
    void afterEach() {
        System.out.println("After test!");
    }
    @Test
    void firstTest() {
        System.out.println("I love java, mthrfck1");
    }
    @Test
    void secondTest() {
        System.out.println("I love java, mthrfck2");
    }

}
