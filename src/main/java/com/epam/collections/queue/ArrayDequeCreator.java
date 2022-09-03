package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.addLast(result.pollFirst());
        result.addLast(result.pollFirst());
        while (firstQueue.isEmpty()) {
            firstQueue.add(result.pollFirst());
        }
        return result;
    }
}
