package classes;

public class Birds extends AbstractAnimal {
    public Birds(String name, int yearNamed) {
        super(yearNamed, name);

    }
@Override
 	public String move() {
         return "move type- fly";
     }
    }