package com.App1.App1.model.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FresherDTOTest {
    @Test
    void getFresherId() {
        FresherDTO fresherDTO = new FresherDTO();
        fresherDTO.setFresherId("2019603655");
        assertEquals("2019603655",fresherDTO.getFresherId());
    }

    @Test
    void getFresherName() {
        FresherDTO fresherDTO = new FresherDTO();
        fresherDTO.setFresherName("Kevin");
        assertEquals("Kevin",fresherDTO.getFresherName());
    }

    @Test
    void set_getFresherAddress() {
        FresherDTO fresherDTO = new FresherDTO();
        fresherDTO.setFresherAddress("Maroc");
        assertEquals("Maroc",fresherDTO.getFresherAddress());

    }

    @Test
    void set_getFresherPhone() {
        FresherDTO fresherDTO = new FresherDTO();
        fresherDTO.setFresherPhone("0912345567");
        assertEquals("0912345567",fresherDTO.getFresherPhone());
    }

    @Test
    void set_getFresherEmail() {
        FresherDTO fresherDTO = new FresherDTO();
        fresherDTO.setFresherEmail("comCom@gmail.com");
        assertEquals("comCom@gmail.com",fresherDTO.getFresherEmail());
    }

    @Test
    void testFresherDTOConstructor() {
        FresherDTO fresherDTO = new FresherDTO("2019603655","Kevin","Maroc",
                "0912345567","comCom@gmail.com");
        assertEquals("2019603655",fresherDTO.getFresherId());
        assertEquals("Kevin",fresherDTO.getFresherName());
        assertEquals("Maroc",fresherDTO.getFresherAddress());
        assertEquals("0912345567",fresherDTO.getFresherPhone());
        assertEquals("comCom@gmail.com",fresherDTO.getFresherEmail());
    }
}
