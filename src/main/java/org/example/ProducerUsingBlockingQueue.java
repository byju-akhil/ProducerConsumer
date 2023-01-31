package org.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerUsingBlockingQueue {
    void produce(BlockingQueue<String> list) throws InterruptedException {
        list.put("Produce Item P");
        System.out.println("Produce Item P");
    }


}
