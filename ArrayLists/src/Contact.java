public class Contact {
   private String name;
   private String phone;

   public Contact(String name, String phone) {
      this.name = name;
      this.phone = phone;
   }

   public String getName() {
      return name;
   }

   public String getPhone() {
      return phone;
   }

   public void printContact() {
      System.out.println("Name: " + this.name + "\nPhone: " + this.phone + "\n");
   }

   public static Contact createContact(String name, String phone) {
      return new Contact(name, phone);
   }
}
