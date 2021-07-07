package classes;

public class Birds extends AbstractAnimal {
    public Birds(String name, int yearNamed) {
        super(name, yearNamed);

    }
@Override
 	public String move() {
         return "move type- fly";
     }
    }