package com.com.thinkinginjava11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by xuxi on 2019/11/30.
 */

/**
 * Queue队列是一个典型的先进先出（FIFO）的容器。即从容器的一端放入事物，从另一端取出，并且事物放入容器
 * 的顺序是相同的。队列常被当作一种可靠的将对象从程序的某个区域传输到另一个区域的途径。队列在并发编程的
 * 特别重要21章中所看到的，因为它们可以安全地将对象从一个任务传输给另一个任务
 */

/**
 * offer()方法是Queue相关的方法之一，它在允许的情况下，将一个元素插入到队尾，或者
 * 返回false。peek()和element()都将在不移除的情况下返回队头，但是peek()方法在队列
 * 为空时返回null,而element()会抛出NoSuchElementException异常。poll()和remove()
 * 方法将移除并返回队头，但是poll()在队列为空时返回null,而remove()会抛出NoSuchElementException
 * 异常。
 * 自动包装机制会自动地将nextInt
 */
public class QueueDemo {

    public static void printQ(Queue queue){
        while (queue.peek() != null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i+ 10));
        }
        printQ(queue);

        Queue<Character> qc = new LinkedList<>();
        for (char c : "Brontosaurus".toCharArray())
            qc.offer(c);
        System.out.println(qc);

    }


}
