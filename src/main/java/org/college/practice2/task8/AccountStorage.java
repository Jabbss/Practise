package org.college.practice2.task8;

import java.util.ArrayList;

public class AccountStorage {
    public ArrayList<Accountable> accountInfo = new ArrayList<>();
    private BankAbstractVisitor serializer;

    public void save() {
        for (Accountable acc : accountInfo) {
            System.out.println(acc.accept(serializer));
        }
    }

    public void changeFormat(String format) {
        if (format.equals("json")) {
            serializer = new BankJsonVisitor();
        } else {
            serializer = new BankDatabaseVisitor();
        }
    }

    public void addInternalAccount(InternalAccount info) {
        accountInfo.add(info);
    }

}
