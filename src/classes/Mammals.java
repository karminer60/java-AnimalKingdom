package classes;

public class Mammals extends AbstractAnimal {
    public Mammals(String name, int yearNamed) {
        super(name, yearNamed);
    }

@Override
public String move() {
    return "move type- walk";
}

}