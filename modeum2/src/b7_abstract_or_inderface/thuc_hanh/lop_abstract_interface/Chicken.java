package b7_abstract_or_inderface.thuc_hanh.lop_abstract_interface;

public class Chicken extends AbstractAnimal implements InterfaceEdible {
    @Override
    public String makeSound() {
        return "cuc tac";
    }

    @Override
    public String howtoEat() {
        return "chien xu";
    }
}
