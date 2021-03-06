package HashSetsPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
   private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
   private static Set<HeavenlyBody> planets = new HashSet<>();

   public static void main(String[] args) {
      HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new HeavenlyBody("Venus", 225);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new HeavenlyBody("Pluto", 248);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new HeavenlyBody("Earth", 265);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
      solarSystem.put(tempMoon.getName(), tempMoon);
      temp.addMoon(tempMoon);



      System.out.println("Planets");
      for (HeavenlyBody planet : planets) {
         System.out.println("\t" + planet.getName());
      }
      HeavenlyBody body = solarSystem.get("Earth");
      System.out.println("Moons of " + body.getName());
      for (HeavenlyBody earthMoons : body.getSatellites()) {
         System.out.println("\t" + earthMoons.getName());
      }

      Set<HeavenlyBody> moons = new HashSet<>();
      for (HeavenlyBody planet : planets) {
         moons.addAll(planet.getSatellites());
      }
      System.out.println("All moons");
      for (HeavenlyBody moon : moons) {
         System.out.println(moon.getName());
      }
      HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
      planets.add(pluto);

      for (HeavenlyBody planet : planets) {
         System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
      }

      Object o = new Object();
      o.equals(o);
      "pluto".equals("");
   }
}
