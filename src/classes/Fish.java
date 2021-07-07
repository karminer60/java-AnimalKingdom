package classes;

public class Fish extends AbstractAnimal {
    public Fish(String name, int yearNamed) {
        super(name, yearNamed);
}

@Override
public String move() {
    return "move type- swim";
}

}