package top.codingmore.tobebetterjavaer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import top.codingmore.tobebetterjavaer.pojo.User;
import top.codingmore.tobebetterjavaer.pojo.UserRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: tobebetterjavaer
 * @description: 333
 * @packagename: top.codingmore.tobebetterjavaer.service
 * @author: 姚泽宇
 * @date: 2022-06-16 00:04
 **/
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


}
