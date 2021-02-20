package Mnogopotochnost;

import com.sun.jmx.mbeanserver.NamedObject;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockClass {
    public static void main(String[] args) throws InterruptedException {
        Runner2 runner2 = new Runner2();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner2.firstThread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner2.secondThread();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner2.finished();

    }
}




 class Runner2 {

    private  Account account1 = new Account();
    private  Account account2 = new Account();
    private Lock lock1 = new ReentrantLock();  //избежение вложенности
     private Lock lock2 = new ReentrantLock();

     private void takeLocks(Lock lock1, Lock lock2) {
         boolean firstLockTaken = false;
         boolean secondLockTaken = false;
         Random random = new Random();

         while (true) {
             try {
                 firstLockTaken = lock1.tryLock();
                 secondLockTaken = lock2.tryLock();
             } finally {
                 if (firstLockTaken && secondLockTaken) {
                     return;
                 } else {
                     if (firstLockTaken) {
                         lock1.unlock();
                     }
                     if (secondLockTaken) {
                         lock2.unlock();
                     }
                 }

                 try {
                     Thread.sleep(random.nextInt (10));
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }

         }
     }
    public void firstThread(){
        Random random = new Random();
        for (int i = 0; i < 10000 ; i++) {


            /*
            lock1.lock();
            lock2.lock();
             */


            takeLocks(lock1, lock2);
            try {
                Account.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
            /*
        synchronized (account1) {
            synchronized (account2) {
                //безопасное изменение данных
                Account.transfer(account1, account2, random.nextInt(100));
            }


        }

             */

        }
    }
    public void secondThread() {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            lock2.lock();
            lock1.lock();
            try {
                Account.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
            /*
            synchronized (account1) {
                synchronized (account2) {
                    Account.transfer(account2, account1, random.nextInt(100));
                }
            }


             */
        }

    }
    public void finished(){
        System.out.println("Общий аккаунт1 " + account1.getBalance());
        System.out.println("Общий аккаунт2 " + account2.getBalance());
        System.out.println("Общий аккаунт " + (account2.getBalance() + account1.getBalance()));
    }

}

class Account {
    private int balance = 10000;


    public void deposit(int amount) {
        synchronized (this) {
            balance += amount; //balance + amount
        }
    }

    public void withdraw (int amount) {
        //synchronized (this) {
            balance -= amount;
        //}
    }

    public int getBalance() {
       // synchronized (this) {
            return balance;
       // }

    }

    public static void transfer(Account acc1, Account acc2, int amount ){
        acc1.withdraw(amount);   //уменьшение счёта
        acc2.deposit(amount);     //увеличение счёта

    }
}