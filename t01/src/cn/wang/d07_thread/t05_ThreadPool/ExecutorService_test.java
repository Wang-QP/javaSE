package cn.wang.d07_thread.t05_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService_test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);//线程池若存在就不会结束程序
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        es.shutdown();//销毁线程池(尽量不使用)
    }
}
