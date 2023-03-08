package com.App1.App1.model.response;

import com.App1.App1.model.entity.Fresher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ResponseObjectTest {

    @Test
    void set_getStatus() {
        ResponseObject responseObject = new ResponseObject();
        responseObject.setStatus("OK");
        assertEquals("OK",responseObject.getStatus());
    }

    @Test
    void set_getMsg() {
        ResponseObject responseObject = new ResponseObject();
        responseObject.setMsg("OK?");
        assertEquals("OK?",responseObject.getMsg());
    }

    @Test
    void set_getData() {
        Fresher fresher = new Fresher("2019603655","CanhHoang",
                "Vĩnh Bảo,Hải Phòng","0912345123","my.wok148@gmail.com");
        ResponseObject responseObject = new ResponseObject();
        responseObject.setData(fresher);
        assertEquals(fresher,responseObject.getData());
    }

    @Test
    void testResponseObjectConstructor(){
        ResponseObject responseObject = new ResponseObject("OK","Are you good?","string");
        assertEquals("OK",responseObject.getStatus());
        assertEquals("Are you good?",responseObject.getMsg());
        assertEquals("string",responseObject.getData());
    }

}