package com.nahwasa.practice.javateststartjunit5;

public class Study {

    private StudyStatus status;
    private int limit;

    public Study() {
        this.status = StudyStatus.INIT;
        this.limit = 5;
    }

    public void makeException() {
        throw new RuntimeException(StudyExceptionCode.E001.name());
    }

    public StudyStatus getStatus() {
        return this.status;
    }

    public int getLimit() {
        return this.limit;
    }

    public long sumEvenNumbersUnderN(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0)
                sum += i;
        }
        return sum;
    }
}
