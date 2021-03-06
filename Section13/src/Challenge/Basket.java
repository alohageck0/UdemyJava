package Challenge;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
   private final String name;
   private final Map<StockItem, Integer> list;

   public Basket(String name) {
      this.name = name;
      this.list = new TreeMap<>();
   }

   public int addToBasket(StockItem item, int quantity) {
      if (item != null && quantity > 0) {
         int inBasket = list.getOrDefault(item, 0);
         list.put(item, inBasket + quantity);
         return inBasket;
      }
      return 0;
   }

   public int removeFormBasket(StockItem item, int quantity) {
      if (item != null && quantity > 0) {
         System.out.println("Deleting " + item + " from basket");
         int inBasket = list.getOrDefault(item, 0);
         if (inBasket > quantity) {
            list.put(item, inBasket - quantity);
            return inBasket - quantity;
         } else if (inBasket == quantity) {
            list.remove(item);
            return 0;
         } else {
            System.out.println("You reserved " + inBasket + " items. You can not unreserve " + quantity);
         }
      }
      return 0;
   }


   public Map<StockItem, Integer> Items() {
      return Collections.unmodifiableMap(list);
   }

   @Override
   public String toString() {
      String s = "\nShopping Basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
      double totalCost = 0.0;
      for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
         s = s + item.getKey() + ". " + item.getValue() + " reserved\n";
         totalCost += item.getKey().getPrice() * item.getValue();

      }
      return s + "Total cost " + String.format("%.2f", totalCost);
   }

   public void clearBasket() {
      this.list.clear();
   }

//   public void checkOutBasket() {
//      for (Map.Entry<StockItem, Integer> entry : list.entrySet()) {
//         entry.getKey().checkOutItem(entry.getValue());
//      }
//      clearBasket();
//   }

}
