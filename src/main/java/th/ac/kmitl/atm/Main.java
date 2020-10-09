package th.ac.kmitl.atm;

public class Main {
    public static void main(String[] args) {
        DataSourceDB dataSourceDB = new DataSourceDB();
        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
        Bank bank = new Bank("My Bank", dataSourceFile);
        ATM atm = new ATM(bank);
        AtmUI atmUI = new AtmUI(atm);
        atmUI.run();

        String name = atm.validateCustomer(1,1234);
        System.out.println(name + "has" + atm.getBalance());
        atm.withdraw(500);
        System.out.println(name + "has" + atm.getBalance());
    }
}
