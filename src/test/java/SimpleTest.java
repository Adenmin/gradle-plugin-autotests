import org.junit.Test;

import static io.restassured.RestAssured.when;

public class SimpleTest {

    @Test
    public void test1() {
        when().get("http://localhost:8087/vets").then().statusCode(200);
    }
}
