package com.sample;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class SampleResourceTest {
    @Test
    public void testGet() {
        given()
                .when().get("/api/1")
                .then()
                .statusCode(200)
                .body(is("{\"id\":1,\"description\":\"Hi\"}"));
    }
}