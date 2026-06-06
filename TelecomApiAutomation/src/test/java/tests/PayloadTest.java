package tests;

import org.testng.annotations.Test;
import payloads.UserPayload;
import utils.TestDataFactory;

public class PayloadTest {

    @Test
    public void generateUser() {

        UserPayload user =
                TestDataFactory.createUser();

        System.out.println(
                user.getName());

        System.out.println(
                user.getEmail());

        System.out.println(
                user.getPhone());
    }
}