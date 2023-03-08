package com.App1.App1.model.response;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.*;
class ErrorResponseTest {
    @Test
    void set_getStatus() {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(HttpStatus.OK);
        assertEquals(HttpStatus.OK,errorResponse.getStatus());
    }

    @Test
    void set_getMsg() {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMsg("NOT Error");
        assertEquals("NOT Error",errorResponse.getMsg());
    }
    @Test
    void testErrorResponseConstructor() {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.OK,"NOT Error");
        assertEquals(HttpStatus.OK,errorResponse.getStatus());
        assertEquals("NOT Error",errorResponse.getMsg());
    }
}
