package com.quest.oops.library;

public class PremiumMember extends Member {

    public PremiumMember(String name, int memberId) {
        super(name, memberId, "Premium");
        this.maxBooks=10;
        this.borrowedBooks=new Book[this.maxBooks];
    }

    @Override
    public double calculateLateFee(final int daysLate) {
        return daysLate * 1.5; // Lower rate for premium members
    }

    @Override
    public String toString() {
        String str=super.toString();
        return str;
    }
}
