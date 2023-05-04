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
public void compareHuffenduy(Huffenduy first, Huffenduy second){
    int firstPoints = first.getIndustriousness()+first.getLoyalty()+first.getHonesty();
    int secondPoints = second.getIndustriousness()+second.getLoyalty()+second.getHonesty();

    if (firstPoints>secondPoints) {
        System.out.println("Студент " + first.getName() + " лучше чем " + second.getName());
    }else if (firstPoints<secondPoints){
        System.out.println("Студент " + second.getName() + " лучше чем " + first.getName());
    }else {
        System.out.println("Студент " + first.getName() + " и " + second.getName()+ " равны");

    }
}
public void compareSlizerin(Slizerin first, Slizerin second){
    int firstPoints = first.getCunning()+first.getDetermination()+first.getAmbition()+first.getResourcefulness()+first.getLusForPower();
    int secondPoints = second.getCunning()+second.getDetermination()+second.getAmbition()+second.getResourcefulness()+second.getLusForPower();

    if (firstPoints>secondPoints) {
        System.out.println("Студент " + first.getName() + " лучше чем " + second.getName());
    }else if (firstPoints<secondPoints){
        System.out.println("Студент " + second.getName() + " лучше чем " + first.getName());
    }else {
        System.out.println("Студент " + first.getName() + " и " + second.getName()+ " равны");

    }
}
public void compareKogtevran(Kogtevran first, Kogtevran second){
    int firstPoints = first.getMind()+first.getWisdom()+first.getWit()+first.getCreative();
    int secondPoints = second.getMind()+second.getWisdom()+second.getWit()+second.getCreative();

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
