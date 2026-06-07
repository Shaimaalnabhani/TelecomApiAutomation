package utils;

import com.github.javafaker.Faker;
import payloads.UserPayload;

public class TestDataFactory {

    private static final Faker faker =
            new Faker();

    public static UserPayload createUser() {

        UserPayload user =
                new UserPayload();

        user.setName(
                faker.name().fullName());

        user.setEmail(
                faker.internet().emailAddress());

        user.setPhone(
                faker.phoneNumber().cellPhone());

        return user;
    }
}