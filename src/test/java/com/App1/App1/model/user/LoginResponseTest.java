package com.App1.App1.model.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LoginResponseTest {
    @Test
    void getAccessToken() {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setAccessToken("it is accessToken");
        assertEquals("it is accessToken",loginResponse.getAccessToken());

    }

    @Test
    void getTokenType() {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setTokenType("Bearer");
        assertEquals("Bearer",loginResponse.getTokenType());
    }

    @Test
    void setAccessToken() {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setAccessToken("it is accessToken");
        assertEquals("it is accessToken",loginResponse.getAccessToken());
    }

    @Test
    void setTokenType() {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setTokenType("Bearer");
        assertEquals("Bearer",loginResponse.getTokenType());
    }
    @Test
    void testLoginResponseConstructor() {
        LoginResponse loginResponse = new LoginResponse("it is token");
        assertEquals("it is token",loginResponse.getAccessToken());
    }
}

