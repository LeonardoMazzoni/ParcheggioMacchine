import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {
    String nome;
    int tempo;
    public static int y = 100;
    static Semaphore s = new Semaphore(10);
    
    public MyThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public void run()
    {
        int x = y;
        try {
            s.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nome + ": è entrata nel parcheggio. posti liberi: " + s.availablePermits());
        for (int i = 0; i < y; i++) {
            x--;
            try {
                sleep(tempo);
            } catch (Exception e) {
            }
        }
        System.out.println(nome + ": ha liberato il posto. posti liberi: " + s.availablePermits());
        s.release();
    }
}
