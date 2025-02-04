package org.college.practice2.task10;

public class Main {
    public static void main(String[] args) {
        DatabaseAccess msAccess = new DatabaseAccess(new MsSQLDatabaseAdapter());
        msAccess.execute("SELECT * FROM users");
        msAccess.printResults();

        DatabaseAccess pgAccess = new DatabaseAccess(new PostgreSQLDatabaseAdapter());
        pgAccess.execute("SELECT * FROM employees");
        pgAccess.printResults();

        DatabaseAccess mongoAccess = new DatabaseAccess(new MongoDBDatabaseAdapter());
        mongoAccess.execute("find: 'orders' ");
        mongoAccess.printResults();
    }
}
