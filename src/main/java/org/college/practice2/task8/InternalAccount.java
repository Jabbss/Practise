package org.college.practice2.task8;

public class InternalAccount extends Accountable {
    public String name;
    public String owner;

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitInternalAccount(this);
    }
}
