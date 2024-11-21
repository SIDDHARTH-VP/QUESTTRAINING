package com.quest.oops.library;

public class RegularMember extends Member {
    public RegularMember(String name, int memberId) {
        super(name, memberId, "Regular");
    }

    @Override
    public double calculateLateFee(final int daysLate) {
        return daysLate * 2.5; // Higher rate
    }

    @Override
    public String toString() {
        String str=super.toString();
        return str;
    }
}
