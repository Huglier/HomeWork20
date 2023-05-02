public class HogwartsCompare {
public void compareGryffindor(Gryffindor first, Gryffindor second){
    int firstPoints = first.getBravery() + first.getHonor() + first.getNobility();
    int secondPoints = second.getBravery() + second.getHonor() + second.getNobility();

    if (firstPoints>secondPoints) {
        System.out.println("Студент " + first.getName() + " лучше чем " + second.getName());
    }else if (firstPoints<secondPoints){
        System.out.println("Студент " + second.getName() + " лучше чем " + first.getName());
    }else {
        System.out.println("Студент " + first.getName() + " и " + second.getName()+ " равны");

    }
}
public void compareAnnyStudents(Hogwarts first, Hogwarts second){
    int firstPoints = first.getPowerMagic()+ first.getTransgressionDistance();
    int secondPoints = second.getPowerMagic()+ second.getTransgressionDistance();

    if (firstPoints>secondPoints) {
        System.out.println("Студент " + first.getName() + " лучше чем " + second.getName());
    }else if (firstPoints<secondPoints){
        System.out.println("Студент " + second.getName() + " лучше чем " + first.getName());
    }else {
        System.out.println("Студент " + first.getName() + " и " + second.getName()+ " равны");

    }
}
}
