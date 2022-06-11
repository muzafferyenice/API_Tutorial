import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest03 {

    @Test
    public void get03(){

        String url ="https://dummy.restapiexample.com/api/v1/employees/7";

        Response response=given().when().get(url);

        response.prettyPrint();
    }
}
