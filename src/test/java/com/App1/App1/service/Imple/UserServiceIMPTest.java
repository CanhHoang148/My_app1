package com.App1.App1.service.Imple;

import com.App1.App1.model.user.User;
import com.App1.App1.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
class UserServiceIMPTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserServiceIMP userServiceIMP;
    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
        user.setUsername("CanhHoang");
    }
    @Test
    void loadUserByUsername() {
        assertEquals("CanhHoang",user.getUsername());
    }

    @Test
    void loadUserById() {

    }
}
