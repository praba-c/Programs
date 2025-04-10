public class ThreadExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();

        /*
        We can suggest threats y giving them priority, but the system will not call or
        allow the thread based on the priority we gave.
        */
        a.setPriority(10);

        // Use thread.sleep to achieve simultaneous thread flows.(again - not guaranteed)


        // for runnable
        C c = new C();
        D d = new D();

        Thread t1 = new Thread(c);      // thread class implements runnable interface
        Thread t2 = new Thread(d);

        t1.start();
        t2.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("A");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("B");
        }
    }
}


class C implements Runnable {

    public void run() {
        System.out.println("Runnable_C");
    }
}

class D implements Runnable {

    public void run() {
        System.out.println("Runnable_D");
    }
}
