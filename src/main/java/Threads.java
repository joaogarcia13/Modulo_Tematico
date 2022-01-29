
package main.java;

public class Threads implements Runnable {
    private Thread G;
    private String NomeThread;
    private Boolean sair=false;
     Threads(String nome){
        NomeThread = nome;
        G = new Thread (this, NomeThread);
     }

    @Override
    public void run() {
        while (!sair) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println("OLAAAAAAA"+e);
            }
        }
    }
    
    public void start(){
        G.start();
        System.out.println("Start" + NomeThread);
    }
    public void stop(){
        G.interrupt();
        sair=true;
    }
}
