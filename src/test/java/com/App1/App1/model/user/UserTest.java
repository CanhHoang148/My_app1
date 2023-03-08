package com.App1.App1.model.user;

import com.App1.App1.model.user.User;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UserTest {
    @Test
    public void getId(){
        User user = new User();
        user.setId(12345L);
        assertEquals(12345L,user.getId());
    }

    @Test
    public void getUsername(){
        User user = new User();
        user.setUsername("CanhHoang");
        assertEquals("CanhHoang",user.getUsername());
    }

    @Test
    public void getPassword(){
        User user = new User();
        user.setPassword("54321");
        assertEquals("54321",user.getPassword());
    }

    @Test
    public void setId(){
        User user = new User();
        user.setId(12345L);
        assertEquals(12345L,user.getId());
    }

    @Test
    public void setUsername(){
        User user = new User();
        user.setUsername("CanhHoang");
        assertEquals("CanhHoang",user.getUsername());
    }

    @Test
    public void setPassword(){
        User user = new User();
        user.setPassword("54321");
        assertEquals("54321",user.getPassword());
    }

    @Test
    public void testUser(){
        User user = new User(12345L,"CanhHoang","54321");
        assertEquals(12345L,user.getId());
        assertEquals("CanhHoang",user.getUsername());
        assertEquals("54321",user.getPassword());
    }
}
