package top.cfphone.mapper;

import org.springframework.stereotype.Repository;
import top.cfphone.pojo.CommitInfo;
import top.cfphone.pojo.PhoneInfo;

import java.util.ArrayList;

/**
 * @Author zx
 * @Date 2020/9/8 16:02
 */
@Repository
public interface PhoneMapper {
    public ArrayList<PhoneInfo> showPhoneInfo(String pingPai);
    public ArrayList<PhoneInfo> queryPingpaiCount(String pingPai);
    public ArrayList<PhoneInfo> queryPingpaiCount1(String pingPai);
    public void commitInfo(CommitInfo commitInfo);
    public ArrayList<PhoneInfo> showPhoneInfo1(String pingPai);
    public ArrayList<PhoneInfo> showAllPhoneInfo();
}
