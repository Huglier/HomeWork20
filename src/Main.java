public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Gryffindor("Гарри Поттер", 6, 5, 3, 7, 3),
                new Gryffindor("Гермиона Грейнджер", 4, 2, 5, 4, 6),
                new Gryffindor("Рон Уизли", 2, 2, 5, 4, 5),
                new Slizerin("Драко Малфой", 5, 6, 4, 7, 3, 6, 7),
                new Slizerin("Грэхэм Монтегю", 3, 2, 5, 4, 6, 4, 3),
                new Slizerin("Грегори Гойл", 4, 2, 6, 3, 5, 3, 2),
                new Huffenduy("Захария Смит", 4, 6, 2, 5, 2),
                new Huffenduy("Седрик Диггори", 2, 4, 5, 3, 5),
                new Huffenduy("Джастин Финч-Флетчли", 3, 3, 6, 4, 3),
                new Kogtevran("Чжоу Чанг", 3, 5, 6, 3, 2, 5),
                new Kogtevran("Падма Патил", 4, 2, 4, 6, 4, 2),
                new Kogtevran("Маркус Белби", 2, 4, 3, 4, 6, 3)
        };
        System.out.println();
        HogwartsStudentsPrinter printer = new HogwartsStudentsPrinter();
        for (Hogwarts student : students) {
            printer.print(student);
        }
        System.out.println();
        HogwartsCompare hogwartsCompare = new HogwartsCompare();
        hogwartsCompare.compareAnnyStudents(students[6], students[2]);
        System.out.println();
        hogwartsCompare = new HogwartsCompare();
        hogwartsCompare.compareGryffindor((Gryffindor) students[1], (Gryffindor) students[0]);
        System.out.println();
        hogwartsCompare = new HogwartsCompare();
        hogwartsCompare.compareHuffenduy((Huffenduy) students[1],(Huffenduy) students[2]);
        System.out.println();
        hogwartsCompare = new HogwartsCompare();
        hogwartsCompare.compareSlizerin((Slizerin) students[1], (Slizerin) students[2]);
        System.out.println();
        hogwartsCompare = new HogwartsCompare();
        hogwartsCompare.compareKogtevran((Kogtevran) students[0], (Kogtevran) students[1]);
    }
    }
