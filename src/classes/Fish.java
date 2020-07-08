package classes;

public class Fish extends AbstractAnimal {
    public Fish(String name, int yearNamed) {
        super(yearNamed, name);
}

@Override
public String move() {
    return "move type- swim";
}

}