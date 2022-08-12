package ru.netology.sqr;

public class SQRService {

    public long sqrCount(long lower, long upper) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lower) {
                if (i * i <= upper) {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
