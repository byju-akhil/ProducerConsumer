package org.example;

public class ConsumerUsingSyncKeyword {

    void consume(Stream list) throws InterruptedException {
        synchronized (this) {
            if (list.c == 0)
                wait();
            String consume = list.stream.get(list.c - 1);
            System.out.println("Consumer consume: " + consume);
            list.stream.remove(list.c - 1);
            list.c--;
            notifyAll();
        }
    }
}
