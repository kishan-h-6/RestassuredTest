import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class sampleTests {
   @Test
    public void randomTest(){
       Assert.assertEquals(1,1);
   }

   @Test
    public void shouldCreateUser(){
        // AAA
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 7ccd399ac8b7e4a6eca70af7725f91acbe0d58e3271a91c7795a3e22ad2f8310")
                .body("{\n" +
                        "    \"id\": 3519,\n" +
                        "    \"name\": \"kishan r\",\n" +
                        "    \"email\": \"kishanrao@ruby.info\",\n" +
                        "    \"gender\": \"male\",\n" +
                        "    \"status\": \"active\"\n" +
                        "}")
                .when()
                .post("https://gorest.co.in/public/v2/users")
                .then()
                .log().body()
                .statusCode(201);



   }
}
