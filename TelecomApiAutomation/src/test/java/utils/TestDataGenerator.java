package utils;

import com.github.javafaker.Faker;

public class TestDataGenerator {

    static Faker faker = new Faker();

    public static String getRandomName() {
        return faker.name().fullName();
    }

    public static String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public static String getRandomPhone() {
        return faker.phoneNumber().cellPhone();
    }
}