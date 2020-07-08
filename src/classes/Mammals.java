package classes;

public class Mammals extends AbstractAnimal {
    public Mammals(String name, int yearNamed) {
        super(yearNamed, name);
    }

@Override
public String move() {
    return "move type- walk";
}

}