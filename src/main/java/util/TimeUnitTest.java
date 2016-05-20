package util;

import java.util.concurrent.TimeUnit;

/**
 * TimeUnit提供了可读性更好的线程暂停操作，
 * 通常用来替换Thread.sleep()
 * @author zhengsy
 * 2016-5-20
 */
public class TimeUnitTest {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sleeping for 4 minutes using Thread.sleep()");
        Thread.sleep(4 * 60 * 1000);
        System.out.println("Sleeping for 4 minutes using TimeUnit sleep()");
 
        TimeUnit.SECONDS.sleep(4);  //4秒
        TimeUnit.MINUTES.sleep(4);  //4分
        TimeUnit.HOURS.sleep(1);    //1小时
        TimeUnit.DAYS.sleep(1);     //一天
        
        long millis = TimeUnit.SECONDS.toMillis(44);  //秒转换成毫秒
        System.out.println("seconds to millis :"+millis);

    }

}
