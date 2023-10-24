package Hilos;

public class hilo2 extends Thread {
   public void run(){
       
        try {
            Thread.sleep(2000);
            System.out.println("hilo2");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
