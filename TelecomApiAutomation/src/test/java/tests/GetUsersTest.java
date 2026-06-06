package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import reporting.TestListener;
import services.UserService;

@Listeners(TestListener.class)
public class GetUsersTest extends BaseTest {

    UserService userService = new UserService();

    @Test
    public void getUsers() {

        Response response = userService.getUsers();

        response.then().statusCode(200);

        String firstName =
                response.jsonPath().getString("[0].name");

        Assert.assertEquals(
                firstName,
                "Leanne Graham"
        );
    }
}