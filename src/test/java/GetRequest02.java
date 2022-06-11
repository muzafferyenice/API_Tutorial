import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest02 {
    @Test
    public void get02(){

        String url="https://reqres.in/api/users";

        Response response=given().when().get(url);

       // response.prettyPrint();//response daki datayi yazdirir

       // response.prettyPeek();//response daki haerseyi yazdrir (body ve headers)

        //response.then().log().all();// response daki herseyi yazdirir

       // response.then().assertThat().statusCode(200);

        response.then().assertThat().
                statusCode(200).
                contentType(ContentType.JSON);


    }


}
