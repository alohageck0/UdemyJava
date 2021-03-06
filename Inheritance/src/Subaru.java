public class Subaru extends Car {

   private boolean spoiler;
   private boolean turbo;


   public Subaru(String condition, String model, String color, int maxSpeed, String bodyType, boolean spoiler, boolean turbo) {
      super("Car", "Subaru", model, condition, 4, color, maxSpeed, bodyType, "Boxer", 23);
      this.spoiler = spoiler;
      this.turbo = turbo;
   }

   @Override
   public void startMove(int speed) {
      super.startMove(speed);
   }

   @Override
   public void speedUp(int speed) {
      super.speedUp(speed);
   }

   @Override
   public void slowDown(int speed) {
      super.slowDown(speed);
   }
}
