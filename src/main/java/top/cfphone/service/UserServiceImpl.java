package top.cfphone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cfphone.mapper.UserMapper;
import top.cfphone.pojo.User;

import java.util.List;

/**
 * @author zx
 * @date 2020/9/27
 **/
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> loginIn(User user) {
        List<User> users = userMapper.loginIn(user);
        return users;
    }

    @Override
    public int queryPermission(String name) {
        int i = userMapper.queryPermission(name);
        return i;
    }
}
