package org.college.practice2.task8;

public class BankAccount extends Accountable {
    private User client;
    private Administrator admin;
    private long currentBalance;
    private boolean isCredit;

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitBankAccount(this);
    }

    public User getClient() {
        return client;
    }

    public Administrator getAdmin() {
        return admin;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public boolean isCredit() {
        return isCredit;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public void setAdmin(Administrator admin) {
        this.admin = admin;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setCredit(boolean credit) {
        isCredit = credit;
    }
}