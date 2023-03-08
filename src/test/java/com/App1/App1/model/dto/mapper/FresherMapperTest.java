package com.App1.App1.model.dto.mapper;
import com.App1.App1.model.dto.FresherDTO;
import com.App1.App1.model.entity.Fresher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FresherMapperTest {
    @Test
    void toFresher() {
        FresherDTO fresherDTO = new FresherDTO("2019603655","Kevin","Maroc",
                "0912345567","comCom@gmail.com");
        FresherMapper fresherMapper = new FresherMapper();
        Fresher fresher = fresherMapper.toFresher(fresherDTO);
        assertEquals("2019603655",fresher.getFresherId());
        assertEquals("Kevin",fresher.getFresherName());
        assertEquals("Maroc",fresher.getFresherAddress());
        assertEquals("0912345567",fresher.getFresherPhone());
        assertEquals("comCom@gmail.com",fresher.getFresherEmail());
    }
}
