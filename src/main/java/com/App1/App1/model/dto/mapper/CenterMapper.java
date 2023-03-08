package com.App1.App1.model.dto.mapper;

import com.App1.App1.model.dto.CenterDTO;
import com.App1.App1.model.entity.Center;

public class CenterMapper {
    public Center toCenter(CenterDTO centerDTO) {
        Center center = new Center();
        center.setCenterId(centerDTO.getCenterId());
        center.setCenterName(centerDTO.getCenterName());
        center.setCenterAddress(centerDTO.getCenterAddress());
        center.setCenterPhone(centerDTO.getCenterPhone());
        return center;
    }
}