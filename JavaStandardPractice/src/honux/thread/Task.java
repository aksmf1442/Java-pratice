package honux.thread;

class Result {

    public long sum;

    public synchronized void add(long i) {
        sum += i;
    }
}

public class Task extends Thread {

    private long start;
    private long end;
    public Result result;

    public Task(long start, long end, Result r) {
        this.start = start;
        this.end = end;
        this.result = r;
    }

    private void sum() {
        long localSum = 0;
        for (long i = start; i <= end; i++) {
            localSum += i;
        }
        result.add(localSum);
        System.out.println("thread ended: " + getName());
    }

    public void run() {
        sum();
    }

    public static void main(String[] args) {
        final long n = 2000000000;
        final int numThread = 5;
        final long size = n / numThread;
        Thread[] t = new Thread[numThread];
        Result r = new Result();
        r.sum = 0;
        for (int i = 0; i < numThread; i++) {
            t[i] = new Task(i * size + 1, (i + 1) * size, r);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < numThread; i++) {
            t[i].start();
        }
        for (int i = 0; i < numThread; i++) {
            try {
                t[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start));
        System.out.printf("sum of 1 to %d is %d\n", n, r.sum);
    }
}