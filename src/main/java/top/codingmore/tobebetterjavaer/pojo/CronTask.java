package top.codingmore.tobebetterjavaer.pojo;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.DateUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: tobebetterjavaer
 * @description: 344
 * @packagename: top.codingmore.tobebetterjavaer
 * @author: 姚泽宇
 * @date: 2022-06-16 14:46
 **/
@Slf4j
@Component
public class CronTask {
    @Scheduled(cron = "0/1 * * ? * ?")
    public void cron() {
        log.info("定时执行，时间{}", DateUtil.now());
    }
}
