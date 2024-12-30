package id.my.hendisantika.redisshedlockdemo.task;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : redis-shedlock-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/12/24
 * Time: 18.08
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Service
public class ExampleTask {

    @Scheduled(cron = "0 * * ? * *")
    @SchedulerLock(name = "exampleTask", lockAtMostFor = "50s", lockAtLeastFor = "20s")
    public void scheduledTask() throws InterruptedException {
        log.info("task scheduled!");
        Thread.sleep(15000);
        log.info("task executed!");
    }

}
