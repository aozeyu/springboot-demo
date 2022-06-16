package top.codingmore.tobebetterjavaer.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.codingmore.tobebetterjavaer.pojo.User;

import java.util.List;

/**
 * @program: tobebetterjavaer
 * @description: 333
 * @packagename: top.codingmore.tobebetterjavaer.service
 * @author: 姚泽宇
 * @date: 2022-06-16 00:02
 **/
public interface UserService {
    List<User> findAll();
}
