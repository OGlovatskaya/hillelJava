import OOP.Animal;

/**
 * Created by OGlovatskaya on 05.10.2015.
 */
public class Cat  {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    String color;
    
    public Cat(){
        System.out.println("in cat's constructor");
    }


    public Cat(boolean isPet, int age, String name, String color){
        pet = isPet; //mojno bez this, esli pereimenovat'
        //this.age = age;
       // this.name = name;
        this.color = color;

    }

 //   public boolean equals(Cat other){
       // if (pet != other.pet) return false;
       // if (age != other.age) return false;
       // if (!name.equals(other.name)) return false;
       // if (!color.equals(other.color)) return false;
      //  return true;
   // }
   // @Override
/*     public String makeSound(){
        return "Meow";
*/
}
