
package main.java;

public class Threads implements Runnable {
    private Thread G;
    private String NomeThread;
     Threads(String nome, boolean OnOff){
        NomeThread = nome;
        G = new Thread (this, NomeThread);
        
        if(OnOff==true){
            start();
        }
        if(OnOff==false){
            stop();
        }
     }

    @Override
    public void run() {
        
    }
    
    public void start(){
        G.start();
    }
    public void stop(){
        G.interrupt();
    }
}
