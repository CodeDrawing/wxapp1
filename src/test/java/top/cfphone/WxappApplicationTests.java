package top.cfphone;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.cfphone.mapper.PhoneMapper;
import top.cfphone.pojo.PhoneInfo;
import top.cfphone.service.PhoneService;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class WxappApplicationTests {
    @Autowired
    PhoneService phoneService;
    @Test
    public void contextLoads() {
        ArrayList<PhoneInfo> aa = phoneService.showPhoneInfo("小米");
        System.out.println(aa);

    }
}
