
package main.java;

public class Threads implements Runnable {
    private Thread G;
    private String NomeThread;
     Threads(String nome){
        NomeThread = nome;
        G = new Thread (this, NomeThread);
     }

    @Override
    public void run() {
        
    }
    
    public void start(){
        G.start();
        System.out.println("Start" + NomeThread);
    }
    public void stop(){
        G.interrupt();
        System.out.println("Stop" + NomeThread);
    }
}
