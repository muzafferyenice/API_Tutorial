import org.json.JSONObject;
public class HerOkuAppTestData {
    /*
   https://restful-booker.herokuapp.com/booking
   { "firstname": "Ali",
     "lastname": "Can",
     "totalprice": 500,
     "depositpaid": true,
     "bookingdates": {
                    "checkin": "2022-03-01",
                    "checkout": "2022-03-11"
                     }
    }
  */
    public JSONObject setUpTestAndRequestData() {
        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2022-03-01");
        bookingdates.put("checkout", "2022-03-01");
        JSONObject requestBody = new JSONObject();
        requestBody.put("firstname", "Ali");
        requestBody.put("lastname", "Can");
        requestBody.put("totalprice", 500);
        requestBody.put("depositpaid", true);
        requestBody.put("bookingdates", bookingdates);
        return requestBody;
    }
}
