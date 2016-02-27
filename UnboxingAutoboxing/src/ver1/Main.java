package ver1;

public class Main {
   public static void main(String[] args) {

      Bank bank = new Bank("AUS");

      bank.addBranch("Adelaide");

      bank.addCustomer("Adelaide", "Tim", 50.05);
      bank.addCustomer("Adelaide", "Mike", 1333.4);
      bank.addCustomer("Adelaide", "Percy", 133.4);

      bank.addBranch("Sydney");
      bank.addCustomer("Sydney", "Bob", 323.4);

      bank.addCustomerTransaction("Adelaide", "Tim", 323.3);
      bank.addCustomerTransaction("Adelaide", "Tim", 355);
      bank.addCustomerTransaction("Adelaide", "Tim", 3253);
      bank.addCustomerTransaction("Adelaide", "Mike", 32399);

      bank.listCustomers("Adelaide", true);
   }
}
