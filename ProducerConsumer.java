

public class ProducerConsumer {
    public static void main(String[] args) {
        Operations obj = new Operations();
        Producer obj1 = new Producer(obj);
//        try{ Thread.sleep(100); } catch (Exception e){ System.out.println(e); }
        Consumer obj2 = new Consumer(obj);
    }
}