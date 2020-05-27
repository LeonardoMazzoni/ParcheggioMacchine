import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        int max = 190; 
        int min = 230; 
        int range = max - min + 1;
        
        MyThread t1 = new MyThread("Macchina1", (int)(Math.random() * range) + min);
        MyThread t2 = new MyThread("Macchina2", (int)(Math.random() * range) + min);
        MyThread t3 = new MyThread("Macchina3", (int)(Math.random() * range) + min);
        MyThread t4 = new MyThread("Macchina4", (int)(Math.random() * range) + min);
        MyThread t5 = new MyThread("Macchina5", (int)(Math.random() * range) + min);
        MyThread t6 = new MyThread("Macchina6", (int)(Math.random() * range) + min);
        MyThread t7 = new MyThread("Macchina7", (int)(Math.random() * range) + min);
        MyThread t8 = new MyThread("Macchina8", (int)(Math.random() * range) + min);
        MyThread t9 = new MyThread("Macchina9", (int)(Math.random() * range) + min);
        MyThread t10 = new MyThread("Macchina10", (int)(Math.random() * range) + min);
        MyThread t11 = new MyThread("Macchina11", (int)(Math.random() * range) + min);
        MyThread t12 = new MyThread("Macchina12", (int)(Math.random() * range) + min);
        MyThread t13 = new MyThread("Macchina13", (int)(Math.random() * range) + min);
        MyThread t14 = new MyThread("Macchina14", (int)(Math.random() * range) + min);
        
        t1.start();
         try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        t2.start();
         try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        t3.start();
         try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        t4.start();
         try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        t5.start();
         try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        t6.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t7.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t8.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t9.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t10.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t11.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t12.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t13.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t14.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
            t11.join();
            t12.join();
            t13.join();
            t14.join(); 
        } catch (Exception e) {
        }  
    }
}
