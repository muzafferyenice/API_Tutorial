import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class GetRequest04 {

    String endPoint = "http://www.gmibank.com/api/tp-customers";
    String bearerToken = "“eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtdXJhdHRhbmMiLCJhdXRoIjoiUk9MRV9BRE1JTiIsImV4cCI6MTY1NTA1NTM4Mn0.VoCFpIbGCP-vVR02PjzHgIwktfGuvpASfuuywhlIScw0sgsP9o30BPHMiZHHn8pg1qdYto7CWN773i_Kv4k2WA”";

    @Test
    public void get04() {
        Response response=given().accept(ContentType.JSON).header("Authorization","Bearer"+bearerToken)
                .when().get(endPoint).then().extract().response();

        response.prettyPrint();

    }

}
