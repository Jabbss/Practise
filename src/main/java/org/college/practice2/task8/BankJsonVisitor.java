package org.college.practice2.task8;

public class BankJsonVisitor implements BankAbstractVisitor {
    @Override
    public String visitUser(User user) {
        return "User " + user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public String visitAdministrator(Administrator admin) {
        return "Administrator department " + admin.getDepartment() ;
    }

    @Override
    public String visitBankAccount(BankAccount account) {
        return "BankAccount of client" + account.getClient().getFirstName() + ". Balance " + account.getCurrentBalance();
    }

    @Override
    public String visitInternalAccount(InternalAccount account) {
        return "InternalAccount " + account.name;
    }
}
