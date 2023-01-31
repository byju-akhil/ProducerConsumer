package org.example;

import java.util.concurrent.BlockingQueue;

public class ConsumerUsingBlockingQueue {
    void consume(BlockingQueue<String> list) throws InterruptedException {
        list.take();
        System.out.println("Consume Item P");
    }
}
