package top.codingmore.tobebetterjavaer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

/**
 * @program: tobebetterjavaer
 * @description: 444
 * @packagename: top.codingmore.tobebetterjavaer
 * @author: 姚泽宇
 * @date: 2022-06-16 11:15
 **/
@SpringBootTest
public class CodingmoreRedisApplicationTests {
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void testRedis() {
        redisTemplate.opsForValue().set("name","姚泽宇");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }
}
