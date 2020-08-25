package top.cfphone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author zx
 * @Date 2020/7/2 17:21
 */
@Controller
public class text {
    @RequestMapping("/text")
    @ResponseBody
    public void run01(HttpServletResponse response, HttpServletRequest request){
        response.setContentType("text/json");
        response.setCharacterEncoding("utf-8");
        String number= (String) request.getParameter("number"); //获取传递的参数
        String price= (String) request.getParameter("price"); //获取传递的参数
        String phone= (String) request.getParameter("phone"); //获取传递的参数
        String address= (String) request.getParameter("address"); //获取传递的参数
        System.out.println("数量为"+number);
        System.out.println("价格为"+price);
        System.out.println("电话为"+phone);
        System.out.println("地址为"+address);
    }
}
