package toby;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Ex {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService es = Executors.newCachedThreadPool();

    FutureTask<String> f = new FutureTask<>(() -> {
      Thread.sleep(2000);
      System.out.println("Async");
      return "Hello";
    });

    es.execute(f);

    System.out.println(f.isDone());
    Thread.sleep(2000);
    System.out.println("Exit");
    System.out.println(f.get());
    System.out.println(String.valueOf(f.isDone()));
  }
}