package top.cfphone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cfphone.mapper.PhoneMapper;
import top.cfphone.pojo.CommitInfo;
import top.cfphone.pojo.PhoneInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zx
 * @Date 2020/9/8 16:23
 */
@Service
public class PhoneService implements IPhontService{
    @Autowired
    PhoneMapper phoneMapper;
    @Override
    public ArrayList<PhoneInfo> showPhoneInfo(String pingPai){

        return phoneMapper.showPhoneInfo(pingPai);
    }
    @Override
    public ArrayList<PhoneInfo> showPhoneInfo1(String pingPai){
        return phoneMapper.showPhoneInfo1(pingPai);
    }
    @Override
    public void commitInfo(CommitInfo commitInfo){
        phoneMapper.commitInfo(commitInfo);
    }
    @Override
    public ArrayList<PhoneInfo> queryPingpaiCount(String pingPai){
        return phoneMapper.queryPingpaiCount(pingPai);
    }
    @Override
    public ArrayList<PhoneInfo> queryPingpaiCount1(String pingPai){
        return phoneMapper.queryPingpaiCount1(pingPai);
    }

    @Override
    public ArrayList<PhoneInfo> showAllPhoneInfo() {
        ArrayList<PhoneInfo> phoneInfos = phoneMapper.showAllPhoneInfo();
        return phoneInfos;
    }

}
