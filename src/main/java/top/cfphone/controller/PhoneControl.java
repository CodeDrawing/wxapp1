package top.cfphone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.cfphone.mapper.PhoneMapper;
import top.cfphone.pojo.CommitInfo;
import top.cfphone.pojo.PhoneInfo;
import top.cfphone.pojo.Tubiao;
import top.cfphone.service.PhoneService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author zx
 * @Date 2020/9/8 16:04
 */
@Controller
public class PhoneControl {
    @Autowired
    PhoneService phoneService;

    @RequestMapping("/queryPingpai")
    @ResponseBody
    public List<PhoneInfo> queryPingPai(HttpServletResponse response, HttpServletRequest request, String pingPai){
        ArrayList<PhoneInfo> phoneInfos = phoneService.showPhoneInfo(pingPai);
        return phoneInfos;
    }
    @RequestMapping("/queryPingpai1")
    @ResponseBody
    public List<PhoneInfo> queryPingPai1(HttpServletResponse response, HttpServletRequest request, String pingPai){
        ArrayList<PhoneInfo> phoneInfos = phoneService.showPhoneInfo1(pingPai);
        return phoneInfos;
    }
    @RequestMapping("/queryPingpaiCount")
    @ResponseBody
    public List<PhoneInfo> queryPingpaiCount(HttpServletRequest request,HttpServletResponse response,String pingPai){
        ArrayList<PhoneInfo> phoneInfos = phoneService.queryPingpaiCount(pingPai);
        return phoneInfos;
    }
    @RequestMapping("/queryPingpaiCount1")
    @ResponseBody
    public List<PhoneInfo> queryPingpaiCount1(HttpServletRequest request,HttpServletResponse response,String pingPai){
        ArrayList<PhoneInfo> phoneInfos = phoneService.queryPingpaiCount1(pingPai);
        return phoneInfos;
    }

    @RequestMapping("/commitOrder")
    @ResponseBody
    public void commitOrder(HttpServletResponse response, HttpServletRequest request){
        response.setContentType("text/json");
        response.setCharacterEncoding("utf-8");
        String name=(String) request.getParameter("name");
        String number= (String) request.getParameter("number"); //获取传递的参数
        String price= (String) request.getParameter("price"); //获取传递的参数
        String phone= (String) request.getParameter("phone"); //获取传递的参数
        String address= (String) request.getParameter("address"); //获取传递的参数
        System.out.println("数量为"+number);
        System.out.println("价格为"+price);
        System.out.println("电话为"+phone);
        System.out.println("地址为"+address);
        CommitInfo commitInfo=new CommitInfo();
        commitInfo.setName(name);
        commitInfo.setAddress(address);
        commitInfo.setNumber(number);
        commitInfo.setPrice(price);
        commitInfo.setPhone(phone); 
        phoneService.commitInfo(commitInfo);
    }
    @RequestMapping("/showIndexTubiao")
    @ResponseBody
    public List<Tubiao> showIndexTubiao(){
        List<Tubiao> tubiaos = new ArrayList<Tubiao>();
        Tubiao tubiao = new Tubiao();
        tubiao.setName("小米");
        tubiao.setPath("http://localhost:8080/image/分类/小米.png");
        tubiao.setUrl("../info/info?pingPai=小米");
        tubiaos.add(tubiao);
        Tubiao tubiao1 = new Tubiao();
        tubiao1.setName("华为");
        tubiao1.setPath("http://localhost:8080/image/分类/华为.png");
        tubiao1.setUrl("../info/info?pingPai=华为");
        tubiaos.add(tubiao1);
        Tubiao tubiao2 = new Tubiao();
        tubiao2.setName("oppo");
        tubiao2.setPath("http://localhost:8080/image/分类/oppo.png");
        tubiao2.setUrl("../info/info?pingPai=oppo");
        tubiaos.add(tubiao2);
        Tubiao tubiao3 = new Tubiao();
        tubiao3.setName("vivo");
        tubiao3.setPath("http://localhost:8080/image/分类/vivo.png");
        tubiao3.setUrl("../info/info?pingPai=vivo");
        tubiaos.add(tubiao3);
        Tubiao tubiao4 = new Tubiao();
        tubiao4.setName("魅族");
        tubiao4.setPath("http://localhost:8080/image/分类/魅族.png");
        tubiao4.setUrl("../info/info?pingPai=魅族");
        tubiaos.add(tubiao4);
        return tubiaos;
    }

}
