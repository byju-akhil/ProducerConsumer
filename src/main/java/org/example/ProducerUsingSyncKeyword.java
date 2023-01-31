package org.example;

import java.util.ArrayList;
import java.util.List;

class Stream {
    public List<String> stream;
    int c = 0;

    Stream() {
        stream = new ArrayList<>();
    }
}

public class ProducerUsingSyncKeyword  {
    void produce(Stream list) throws InterruptedException {
        synchronized (this) {
            if (list.c == 10)
                wait();
            list.stream.add("P" + list.c);
            System.out.println("Produce Item P" + list.c);
            list.c++;
            notifyAll();
        }
    }
}

