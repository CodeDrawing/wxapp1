package top.cfphone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.cfphone.pojo.PhoneInfo;
import top.cfphone.service.IPhontService;

import java.util.ArrayList;

/**
 * @Author zx
 * @Date 2020/12/9 15:05
 */
@Controller
@RequestMapping("/phone")
public class PhontController {

    @Autowired
    IPhontService iPhontService;

    @RequestMapping("/phoneList")
    private String phoneList(Model model){
        ArrayList<PhoneInfo> phoneInfos = iPhontService.showAllPhoneInfo();
        model.addAttribute("phoneList",phoneInfos);
        return "crud/list";
    }

}
