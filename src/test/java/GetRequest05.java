import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest05 extends Authentication{

    String endPoint = "http://www.gmibank.com/api/tp-customers/";

    @Test
    public void get05(){

        Response response = given().header("Authorization", "Bearer " + generateToken()).when().get(endPoint);

        response.prettyPrint();

        response.then().assertThat().contentType(ContentType.JSON).statusCode(200);

    }
}