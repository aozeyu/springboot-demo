package top.codingmore.tobebetterjavaer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: tobebetterjavaer
 * @description: 444
 * @packagename: top.codingmore.tobebetterjavaer.controller
 * @author: 姚泽宇
 * @date: 2022-06-16 14:26
 **/
@Api(tags = "测试swagger接口")
@RestController
@RequestMapping("/swagger")
public class SwaggerController {
    @ApiOperation("测试")
    @RequestMapping("/test")
    public String test() {
        return "姚泽宇";
    }
}
