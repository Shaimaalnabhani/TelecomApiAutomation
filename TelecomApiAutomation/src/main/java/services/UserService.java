package services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import payloads.UserPayload;
import io.restassured.response.Response;

public class UserService {

    public Response getUsers() {

        return RestAssured
                .given()

                .when()
                .get("/users");
    }
    public Response createUser(UserPayload payload) {

        return RestAssured
                .given()
                .contentType("application/json")
                .body(payload)

                .when()
                .post("/users");
    }
}