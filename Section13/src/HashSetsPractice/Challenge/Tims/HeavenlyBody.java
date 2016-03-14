package HashSetsPractice.Challenge.Tims;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
   private final String name;
   private final double orbitalPeriod;
   private final Set<HeavenlyBody> satellites;
   private final BodyTypes bodyType;

   public enum BodyTypes {
      STAR, PLANET, MOON, DWARF_PLANET, COMET, ASTEROID
   }

   public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
      this.name = name;
      this.orbitalPeriod = orbitalPeriod;
      this.satellites = new HashSet<>();
      this.bodyType = bodyType;
   }

   public String getName() {
      return name;
   }

   public double getOrbitalPeriod() {
      return orbitalPeriod;
   }

   public boolean addSattelite(HeavenlyBody moon) {
      return this.satellites.add(moon);
   }

   public BodyTypes getBodyType() {
      return bodyType;
   }

   public Set<HeavenlyBody> getSatellites() {
      return new HashSet<>(this.satellites);
   }

   @Override
   public final boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj instanceof HeavenlyBody) {
         HeavenlyBody theObj = (HeavenlyBody) obj;
         if (this.name.equals(theObj.getName())) {
            return this.bodyType == theObj.getBodyType();
         }
      }
      return false;
   }

   @Override
   public final int hashCode() {
//      System.out.println("hashCode() called");
      return this.name.hashCode() + 57 + this.bodyType.hashCode();
   }

   @Override
   public String toString() {
      return this.name + ": " + this.bodyType + ", " + this.getOrbitalPeriod();
   }
}
