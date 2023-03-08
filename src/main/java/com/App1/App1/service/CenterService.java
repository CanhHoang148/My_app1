package com.App1.App1.service;

import com.App1.App1.model.entity.Center;
import com.App1.App1.model.entity.Fresher;


import java.util.List;

public interface CenterService {
    List<Center> getAllCenter();

    Center addCenter(Center center);

    void deleteCenter(String id);

    Center editCenter(Center center);

    List<Fresher> getListFresherOfCenter(String string);
}