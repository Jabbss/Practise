package org.college.practice2.task8;

public class Main {
    public static void main(String[] args) {
        AccountStorage storage = new AccountStorage();
        storage.changeFormat("json");

        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");

        BankAccount bankAccount = new BankAccount();
        bankAccount.setClient(user);
        bankAccount.setCurrentBalance(5000);

        storage.addInternalAccount(new InternalAccount());
        storage.accountInfo.add(bankAccount);
        storage.save();
    }
}
