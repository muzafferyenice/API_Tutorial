import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
public class GetRequest01 {

    @Test
    public void get01(){
    String url="https://restful-booker.herokuapp.com/booking/";

    Response responce=given().when().get(url);//request gonderildi

    responce.prettyPrint();//API den gelen response


    }
}
