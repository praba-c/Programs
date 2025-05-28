package ds.queue;

public class Main {

    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray(5);
        queueUsingArray.push(1);
        queueUsingArray.push(2);
        queueUsingArray.push(3);
        queueUsingArray.push(4);
        queueUsingArray.push(5);

        System.out.println(queueUsingArray.poll());
        System.out.println(queueUsingArray.peek());

        QueueUsingList queueUsingList = new QueueUsingList();
        queueUsingList.pushOrEnqueue(1);
        queueUsingList.pushOrEnqueue(2);
        queueUsingList.pushOrEnqueue(3);
        queueUsingList.pushOrEnqueue(4);

        System.out.println(queueUsingList.pollOrDequeue());
        System.out.println(queueUsingList.peek());
    }
}
