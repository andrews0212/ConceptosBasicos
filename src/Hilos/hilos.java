package Hilos;

public class hilos extends Thread {
    public void run(){
        
        try {
            Thread.sleep(4000);
            System.out.println("hilo1");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        hilos h1 = new hilos();
        hilo2 h2 = new hilo2();
        h1.start();
        h2.start();    
    }
}
