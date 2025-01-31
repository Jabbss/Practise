package org.college.practice2.task8;

public class BankDatabaseVisitor implements BankAbstractVisitor {
    @Override
    public String visitUser(User user) {
        return "INSERT INTO users (name)" + user.getFirstName() + " " + user.getLastName() ;
    }

    @Override
    public String visitAdministrator(Administrator admin) {
        return "INSERT INTO administrators (department) " + admin.getDepartment();
    }

    @Override
    public String visitBankAccount(BankAccount account) {
        return "INSERT INTO bank_accounts (client, balance) " + account.getClient().getFirstName() + ", " + account.getCurrentBalance();
    }

    @Override
    public String visitInternalAccount(InternalAccount account) {
        return "INSERT INTO internal_accounts (name)    " + account.name + "');";
    }
}
