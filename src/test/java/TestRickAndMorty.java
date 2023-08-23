import Objects.Characters;
import Objects.Info;
import Objects.Result;
import config.BaseClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class TestRickAndMorty extends BaseClass {

    @Test
    public void test(){
        when()
                .get("location")
                .then()
                .body("info.pages", equalTo(7));

    }
    @Test
    public void test2(){
       int i = when()
                .get("location")
                .then()
               .extract().body().path("info.count");
        System.out.println(i);

    }
    @Test
    public void test3(){
        Info info = when()
                .get("location")
                .then()
                .extract()
                .jsonPath()
                .getObject("info", Info.class);
        System.out.println(info.count);
    }
    @Test
    public void test4(){
        Characters character = when()
                .get("location")
                .then()
                .extract().as(Characters.class);
        System.out.println(character.info.next);

    }
    @Test
    public void test5(){
        List<Result> list= when()
                .get("location").then().extract().jsonPath().getList("results",Result.class);
        for (Result l : list) {
            System.out.println(l.dimension);

        }
    }
    }

