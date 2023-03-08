package com.App1.App1.exception;

import com.App1.App1.model.response.ErrorResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.junit.jupiter.api.Assertions.*;
class CustomExceptionHandlerTest {
    @Test
    void handlerNotImplementedException() {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_IMPLEMENTED,"ERROR");
    }

    @Test
    void handlerNotFoundException() {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND,"ERROR");
        assertEquals(HttpStatus.NOT_FOUND,errorResponse.getStatus());
        assertEquals("ERROR",errorResponse.getMsg());
    }
}
