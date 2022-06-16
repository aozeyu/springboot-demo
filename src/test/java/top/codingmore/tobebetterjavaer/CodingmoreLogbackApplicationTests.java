package top.codingmore.tobebetterjavaer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: tobebetterjavaer
 * @description: 444
 * @packagename: top.codingmore.tobebetterjavaer
 * @author: 姚泽宇
 * @date: 2022-06-16 14:16
 **/
@SpringBootTest
@Slf4j
public class CodingmoreLogbackApplicationTests {

    @Test
    void testSlf4j() {
        log.info("沉默王二是个大煞笔");
    }
}
