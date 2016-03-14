package HashSetsPractice.Challenge.Tims;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
   private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
   private static Set<HeavenlyBody> planets = new HashSet<>();

   public static void main(String[] args) {
      HeavenlyBody temp = new Planet("Mercury", 88);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new Planet("Venus", 225);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new Planet("Pluto", 248);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new Planet("Earth", 265);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      HeavenlyBody tempMoon = new Moon("Moon", 27);
      solarSystem.put(tempMoon.getName(), tempMoon);
      temp.addSattelite(tempMoon);

      temp = new Planet("Mars", 687);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      tempMoon = new Moon("Phobos", 0.3);
      solarSystem.put(tempMoon.getName(), tempMoon);
      temp.addSattelite(tempMoon);

      tempMoon = new Moon("Deimos", 1.3);
      solarSystem.put(tempMoon.getName(), tempMoon);
      temp.addSattelite(tempMoon);

      temp = new Planet("Jupiter", 4332);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      tempMoon = new Moon("Io", 1.8);
      solarSystem.put(tempMoon.getName(), tempMoon);
      temp.addSattelite(tempMoon);

      tempMoon = new Moon("Europa", 3.5);
      solarSystem.put(tempMoon.getName(), tempMoon);
      temp.addSattelite(tempMoon);

      tempMoon = new Moon("Ganymede", 7.1);
      solarSystem.put(tempMoon.getName(), tempMoon);
      temp.addSattelite(tempMoon);

      tempMoon = new Moon("Callisto", 16.7);
      solarSystem.put(tempMoon.getName(), tempMoon);
      temp.addSattelite(tempMoon);

      temp = new Planet("Saturn", 10759);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new Planet("Uranus", 30660);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new Planet("Nuptune", 165);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

      temp = new Planet("Pluto", 165);
      solarSystem.put(temp.getName(), temp);
      planets.add(temp);

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
      HeavenlyBody pluto = new DwarfPlanet("Pluto", 842) {
      };
      planets.add(pluto);

      for (HeavenlyBody planet : planets) {
         System.out.println(planet);
//         System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
      }

      Object o = new Object();
      o.equals(o);
      "pluto".equals("");
   }
}
