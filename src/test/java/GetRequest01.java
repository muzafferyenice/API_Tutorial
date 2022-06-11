import io.restassured.response.Response;
import org.junit.Test;


import static io.restassured.RestAssured.given;
public class GetRequest01 {

    @Test
    public void get01(){
    String url="https://restful-booker.herokuapp.com/booking/2607";

    Response responce=given().when().get(url);//request gonderildi

    responce.prettyPrint();//API den gelen response


    }
}
