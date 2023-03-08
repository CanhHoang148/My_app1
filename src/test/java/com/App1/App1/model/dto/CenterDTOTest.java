package com.App1.App1.model.dto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CenterDTOTest {
    @Test
    void getCenterCode() {
        CenterDTO centerDTO = new CenterDTO();
        centerDTO.setCenterId("A2");
        assertEquals("A2",centerDTO.getCenterId());
    }

    @Test
    void getCenterName() {
        CenterDTO centerDTO = new CenterDTO();
        centerDTO.setCenterName("PLC");
        assertEquals("PLC",centerDTO.getCenterName());
    }

    @Test
    void getCenterAddress() {
        CenterDTO centerDTO = new CenterDTO();
        centerDTO.setCenterAddress("Toa LandMark, " +
                "Thuy Nguyen, Hai Phong");
        assertEquals("Toa LandMark, " +
                "Thuy Nguyen, Hai Phong",centerDTO.getCenterAddress());
    }

    @Test
    void getCenterPhone() {
        CenterDTO centerDTO = new CenterDTO();
        centerDTO.setCenterPhone("0123456789");
        assertEquals("0123456789",centerDTO.getCenterPhone());
    }
    @Test
    void testCenterDTOConstructor() {
        CenterDTO centerDTO = new CenterDTO("A2","PLC",
                "Toa LandMark,Thuy Nguyen, Hai Phong", "0123456789");
        assertEquals("A2",centerDTO.getCenterId());
        assertEquals("PLC",centerDTO.getCenterName());
        assertEquals("Toa LandMark,Thuy Nguyen, Hai Phong",centerDTO.getCenterAddress());
        assertEquals("0123456789",centerDTO.getCenterPhone());
    }
}
