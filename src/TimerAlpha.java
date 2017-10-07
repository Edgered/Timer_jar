package dt;

// import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAlpha{
  Timer timer1;
  public void TimerRun(int sec) {
    timer1 = new Timer();
    timer1.schedule(new TimerTest(), sec * 1000);
  }

  public void a(){
    System.out.println("haha");
  }


  class TimerTest extends TimerTask {
    public void run() {
      System.out.println("Running TimerTest.");
      timer1.cancel();
    }
  }
}

/*
    try {
      Thread.sleep(1500);
    } catch (InterruptedException e){
      e.printStackTrace();
    }

   timer_a.timer1.cancel();
 } @Override
 public void run() {
   System.out.println("task is running");
 }
}

*/
