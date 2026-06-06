package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerTest {

    @Test
    public void generateFakeData() {

        Faker faker = new Faker();

        String name = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String phone = faker.phoneNumber().cellPhone();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}