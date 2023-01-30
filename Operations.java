import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Operations{
    private Queue<Integer> ls;
    private boolean valueProduced;
    private BlockingQueue<Integer> bq;

    Operations(){
        ls = new LinkedList<>();
        valueProduced = false;
        bq  = new ArrayBlockingQueue<>(20);
    }

    public synchronized void setValue(){
        while (valueProduced){
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        int n = (int)(Math.random()*100);
        System.out.println("Produced : "+n);
        ls.add(n);
        valueProduced = true;
        notify();
    }

    public synchronized void getValue(){
        while (!valueProduced){
            try {
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Consumed : "+ls.peek());
        ls.remove();
        valueProduced = false;
        notify();
    }
}