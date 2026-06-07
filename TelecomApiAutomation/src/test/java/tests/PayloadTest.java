package tests;

import base.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import payloads.UserPayload;
import reporting.TestListener;
import utils.TestDataFactory;

@Listeners(TestListener.class)
public class PayloadTest extends BaseTest {

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