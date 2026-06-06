package tests;

import config.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import payloads.UserPayload;
import services.UserService;

import static org.hamcrest.Matchers.equalTo;

public class CreateUserTest {

    UserService userService =
            new UserService();

    @BeforeClass
    public void setup() {

        RestAssured.baseURI =
                RestAssured.baseURI = ConfigReader.getBaseUrl();    }

    @Test
    public void createUser() {

        UserPayload payload =
                new UserPayload(
                        "Shaima",
                        "shaima123",
                        "shaima@test.com"
                );

        userService
                .createUser(payload)

                .then()
                .log().all()
                .statusCode(201)
                .body("name", equalTo("Shaima"));
    }
}