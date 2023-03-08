package com.App1.App1.model.dto.mapper;
import com.App1.App1.model.dto.CenterDTO;
import com.App1.App1.model.entity.Center;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CenterMapperTest {
    @Test
    void toCenter() {
        CenterDTO centerDTO = new CenterDTO("A2","PLC",
                "Toa LandMark,Thuy Nguyen, Hai Phong", "0123456789");
        CenterMapper centerMapper = new CenterMapper();
        Center center = centerMapper.toCenter(centerDTO);
        assertEquals("A2",center.getCenterId());
        assertEquals("PLC",center.getCenterName());
        assertEquals("Toa LandMark,Thuy Nguyen, Hai Phong",center.getCenterAddress());
        assertEquals("0123456789",center.getCenterPhone());
    }
}
