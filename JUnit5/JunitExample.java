import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class JunitExample {

    @BeforeAll()
    static void beforeAll() {
        System.out.println("executed before all test cases");
    }

    @BeforeEach()
    void beforeEach() {
        System.out.println("executed before each test case");
    }

    @AfterEach()
    void afterEach() {
        System.out.println("Executed after each test case");
    }

    @Test
    @DisplayName("Hello this is displayName")
    public void test() {
        System.out.println("Test method executed");
    }

    @Test
    @DisplayName("Hello this is displayName")
    public void test2() {
        System.out.println("Test2 method executed");
    }

    @Test
    @Disabled
    @DisplayName("Hello this is displayName")
    public void test3() {
        System.out.println("Test3 pending");
    }

    @AfterAll
    void afterAll() {
        System.out.println("Executed after all methods");
    }
}