package classes;

public class Main
{
    public static void print(List<AbstractAnimal> animalList, CheckAnimal tester) {
        for (AbstractAnimal a : animalList) {
          if (tester.test(a)) {
            System.out.println(a);
          }
        }
      }
	public static void main(String[] args)
	{
		System.out.println("Welcome to Lambda School's JavaModule 2");
        System.out.println("***Work with Iterfaces***");
        /* * [ ] **Mammals:**

        | Name      | Year Named |
        |-----------|-------|
        | Panda     | 1869  |
        | Zebra     | 1778  |
        | Koala     | 1816  |
        | Sloth     | 1804  |
        | Armadillo | 1758  |
        | Raccoon   | 1758  |
        | Bigfoot   | 2021  |

        * [ ] **Birds:**

        | Name      | Year Named |
        |-----------|------|
        | Pigeon    | 1837 |
        | Peacock   | 1821 |
        | Toucan    | 1758 |
        | Parrot    | 1824 |
        | Swan      | 1758 |

        [ ] **Fish:**

        | Name      | Year Named |
        |-----------|------|
        | Salmon    | 1758 |
        | Catfish   | 1817 |
        | Perch     | 1758 |*/

        //mammals

        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala",1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo",1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        // birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock",1821);
        Birds toucan = new Birds( "Toucan",1758);
        Birds parrot = new Birds("Parrot",1824);
        Birds swan = new Birds("Swan", 1758);

        // fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish",1817);
        Fish perch = new Fish("Perch", 1758);

        

	

		System.out.println("\n\n\n*** From Abstract Class ***")
		HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
		secretariat.addFuel(10);
		System.out.println("Secretariat " + secretariat.getFuelLevel());

		HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
		eclipse.move(10);

		HorseFromVehicle trigger = new HorseFromVehhicle("Trigger", 10);
		HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
		HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);

		Auto vw = new Auto(1, "Eurovan", 2000);
		Auto toyota = new Auto(10, "Tundra", 1998);
		Auto honda = new Auto(5, "Accord", 20003);

		vw.move();
		vw.move(5);
		
	}
}