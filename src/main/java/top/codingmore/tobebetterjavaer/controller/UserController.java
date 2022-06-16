package top.codingmore.tobebetterjavaer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.codingmore.tobebetterjavaer.service.UserService;

import javax.annotation.Resource;

/**
 * @program: tobebetterjavaer
 * @description: 444
 * @packagename: top.codingmore.tobebetterjavaer.controller
 * @author: 姚泽宇
 * @date: 2022-06-16 09:53
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/all")
    public String all(Model model) {
        model.addAttribute("users",userService.findAll());
        System.out.println(userService.findAll());
        return "all";
    }
}
