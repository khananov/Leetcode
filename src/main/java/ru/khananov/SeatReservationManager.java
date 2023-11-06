package ru.khananov;

import java.util.PriorityQueue;

public class SeatReservationManager {
    public static void main(String[] args) {

    }

    private int last;
    private PriorityQueue<Integer> pq;

    public SeatReservationManager(int n) {
        this.last = 0;
        this.pq = new PriorityQueue<>();
    }

    public int reserve() {
        if (pq.isEmpty()) {
            return ++last;
        } else {
            return pq.poll();
        }
    }

    public void unreserve(int seatNumber) {
        if (seatNumber == last) {
            --last;
        } else {
            pq.offer(seatNumber);
        }
    }
}
