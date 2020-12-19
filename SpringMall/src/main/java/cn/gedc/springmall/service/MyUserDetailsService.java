package cn.gedc.springmall.service;

import cn.gedc.springmall.bean.MyUserBean;
import cn.gedc.springmall.mapper.MyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    MyUserMapper mapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUserBean userBean = mapper.selectByUsername(username);
        if (userBean == null) {
            throw new UsernameNotFoundException("数据库中无此用户！");
        }
        return userBean;
    }
}
