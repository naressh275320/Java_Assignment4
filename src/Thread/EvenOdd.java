//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

package Thread;

public class EvenOdd{
  private static final int MAX_NUMBER = 20;
  private static Object lock = new Object();
  private static boolean isOddTurn = true;

  public static void main(String[] args) {
    
    Thread oddThread = new Thread(() -> {
      for (int i = 1; i <= MAX_NUMBER; i += 2) {
        synchronized(lock) {
          while (!isOddTurn) {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("Odd Number from oddThread: " + i);
          isOddTurn = false;
          lock.notify();
        }
      }
    });

    Thread evenThread = new Thread(() -> {
      for (int i = 2; i <= MAX_NUMBER; i += 2) {
        synchronized(lock) {
          while (isOddTurn) {
            try {
              lock.wait();
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
          System.out.println("Even Number from evenThread: " + i);
          isOddTurn = true;
          lock.notify();
        }
      }
    });

    oddThread.start();
    evenThread.start();
  }
}