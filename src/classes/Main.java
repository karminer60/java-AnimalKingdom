package classes;

import java.util.*;

public class Main
{
    public static void print(ArrayList<AbstractAnimal> animalList, CheckAnimal tester) {
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

        

	

        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();
            animalList.add(panda);
            animalList.add(zebra);
            animalList.add(koala);
            animalList.add(sloth);
            animalList.add(armadillo);
            animalList.add(raccoon);
            animalList.add(bigfoot);
            animalList.add(pigeon);
            animalList.add(peacock);
            animalList.add(toucan);
            animalList.add(parrot);
            animalList.add(swan);
            animalList.add(salmon);
            animalList.add(catfish);
            animalList.add(perch);



            System.out.println();
        
            animalList.sort((a1, a2)-> Integer.compare(a2.getYear(), a1.getYear()));
            
            for (AbstractAnimal a : animalList) {
                  System.out.println(a);
            }
    
    }   
    
}