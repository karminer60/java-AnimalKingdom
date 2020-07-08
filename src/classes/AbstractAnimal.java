package classes;

abstract class AbstractAnimal
{
	protected int yearNamed;
}

public AbstractAnimal(int yearNamed)
{
	maxId++;
	id = maxId;

	this.yearNamed = yearNamed;
	this.name = name;
}

public abstract String move();
public abstract String breathe();
public abstract String reproduce();

public int getId() {
	return id;
}

public int getYearNamed() {
	return yearNamed;
}

public String getName() {
	return name;
}

public void setYearNamed(int yearNamed) {
	this.yearNamed = yearNamed;
}

public void setName(String name) {
	this.name = name;
}

@Override
   public String toString() {
     return "Name: " + name + " " + "Year named/Discovered: " + yearNamed;
