import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.given;
public class PostRequest01 extends HerOkuAppTestData {
    @Test
    public void post() {
        String url="https://restful-booker.herokuapp.com/booking";
        HerOkuAppTestData testData = new HerOkuAppTestData();

        JSONObject requestData = testData.setUpTestAndRequestData();

        Response response = given().contentType(ContentType.JSON).auth()
                .basic("admin","password123")
                .body(requestData.toString())
                .when().post(url);
        response.prettyPrint();
    }
}
