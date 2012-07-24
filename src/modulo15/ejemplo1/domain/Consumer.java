package modulo15.ejemplo1.domain;

public class Consumer implements Runnable {
 private SyncStack theStack;
 private int num;
 private static int counter = 1;

public Consumer (SyncStack s) {
 theStack = s;
 num = counter++;
}
public void run() {
 char c;
 for (int i = 0; i < 10; i++) {
 c = theStack.pop();
 System.out.println("Consumer" + num + ": " + c);

 try {
 Thread.sleep((int)(Math.random() * 300));
 } catch (InterruptedException e) {
 // ignore it
 }
 }
} // END run method
}