package classes;

abstract class AbstractAnimals
{
	protect in fuel;
}

public AbstractVehicle(int fuel)
{
	this.fuel = fuel;
}
abstract String getPath();
abstract String getName();

void move()
{
	fuel--;
}

void move(int steps)
{
	fuel = fuel -steps;
}

int getFuelLevel()
{
	return fuel;
}
