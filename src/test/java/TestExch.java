import org.junit.Test;

import static io.restassured.RestAssured.*;

public class TestExch {
    static String URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

    @Test
    public void test() {
        String str = when()
                .get(URL)
                .then()
                .log()
                .all()
                .toString();
        System.out.println(str);
    }
}
