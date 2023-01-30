class Consumer implements Runnable{
    Operations obj;
    Consumer(Operations obj) {
        this.obj = obj;
        Thread t2 = new Thread(this,"Consumer 1");
        t2.start();
    }

    public void run(){
        for(int i=0; i<10; i++) {
            obj.getValue();
            try{ Thread.sleep(500); } catch (Exception e){ System.out.println(e); }
        }
    }
}