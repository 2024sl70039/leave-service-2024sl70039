package com.bits.hr;

public class LeaveCalculator {
    public int getRemainingLeave(int totalLeave, int usedLeave) {
        if (usedLeave < 0 || usedLeave > totalLeave)
            throw new IllegalArgumentException("Invalid leave used");
        return totalLeave - usedLeave;
    }

    public double getEncashmentAmount(int remainingLeave, double dailySalary) {
        return remainingLeave * dailySalary;
    }

}

