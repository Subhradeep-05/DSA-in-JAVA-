class MyThread extends Thread {
    public void run() {
        // Code that runs in a separate thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread(); // create thread
        t.start(); // start thread execution

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
