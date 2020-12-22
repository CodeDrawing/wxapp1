package top.cfphone.service;

import org.springframework.stereotype.Service;
import top.cfphone.pojo.CommitInfo;
import top.cfphone.pojo.PhoneInfo;

import java.util.ArrayList;

/**
 * @Author zx
 * @Date 2020/12/9 15:14
 */

public interface IPhontService {

    public ArrayList<PhoneInfo> showPhoneInfo(String pingPai);
    public ArrayList<PhoneInfo> showPhoneInfo1(String pingPai);
    public void commitInfo(CommitInfo commitInfo);
    public ArrayList<PhoneInfo> queryPingpaiCount(String pingPai);

    public ArrayList<PhoneInfo> queryPingpaiCount1(String pingPai);
    public ArrayList<PhoneInfo> showAllPhoneInfo();
}
