package b7_abstract_or_inderface.thuc_hanh.lop_abstract_interface;

public class Main {
//    public static void main(String[] args) {
//        AbstractAnimal[] animal = new AbstractAnimal[2];
//        animal[0] = new Tiger();
//        animal[1] = new Chicken();
//        for (AbstractAnimal index : animal
//        ) {
//            System.out.println(index.makeSound());
//            if(index instanceof Chicken){
//                InterfaceEdible edible=new Chicken();
//                System.out.println(edible.howtoEat());
//            }
//
//        }
//    }
public static void main(String[] args) {
    Fruit[] fruit=new Fruit[2];
    fruit[0]=new Orange();
    fruit[1]=new Apple();
    for (Fruit index:fruit
         ) {
        System.out.println(index.howtoEat());

    }
}

}
