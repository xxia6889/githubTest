package com.e;

import com.e.demos.web.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {

        User user = new User();

        user.setName("zs");

        System.out.println(user.getName().toString());
    }

}
