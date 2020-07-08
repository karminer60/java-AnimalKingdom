package transport;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Lambda School's JavaModule 2");
		System.out.println("***Work with Iterfaces***");
		Horse seabiscuit = new Horse("Seabiscuit");
		Horse affirmed = new Horse("Affirmed");
		Horse joe = new Horse("Joe");

		seabuscuit.eat(10);
		affirmed.eat(25);
		for (int i =0; i < 3;)
		{
			seabiscuit.move();
		}
		System.out.println("Seabiscuit " + seabiscuit.getFuelLevel() );

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