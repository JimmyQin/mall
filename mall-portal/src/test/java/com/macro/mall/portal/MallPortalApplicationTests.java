package com.macro.mall.portal;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.portal.controller.UmsMemberController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallPortalApplicationTests {
@Autowired
UmsMemberController umsMemberController;
    @Test
    public void contextLoads() {
        CommonResult login = umsMemberController.login("test", "macro123");
        Map<String,String> data = (Map<String, String>) login.getData();
        System.out.println(data.get("token"));
    }

}
