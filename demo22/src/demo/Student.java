package demo;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @AUTHOR : echo_zheng
 * @Description :
 * @Date 2018/6/28 21:17
 */
public class Student {
    //测试java 本身就是多线程的  打印出的结果有6条线程
    public static void main(String[] args) {
        System.out.println("===========================");
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo info : threadInfos) {
            System.out.println("threadId"+ info.getThreadId() + "\n" +
                    "threadName:" + info.getThreadName() + "\n ------------------");
        }
        System.out.println("===========================");
    }
}
