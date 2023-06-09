public class Main {
    public static void main(String[] args) {
        Hogwarts[] people = {
                new Gryffindor("Гарри Поттер", 75, 89,54,23,63),
                new Gryffindor("Гермиона Грейнджер", 84, 72,75,14,75),
                new Gryffindor("Рон Уизли", 23, 73,85,24,96),
                new Hufflepuff("Захария Смит", 72, 87,52,85,34),
                new Hufflepuff("Седрик Диггори", 47, 14,63,14,95),
                new Hufflepuff("Джастин Финч-Флетчли", 96, 74,83,37,19),
                new Ravenclaw("Чжоу Чанг", 23, 54,34,83,91,23),
                new Ravenclaw("Падма Патил", 83, 62,63,91,32,74),
                new Ravenclaw("Маркус Белби", 36, 83,73,82,57,24),
                new Slytherin("Драко Малфой", 74, 14,85,24,57,24,75),
                new Slytherin("Грэхэм Монтегю", 15, 98,82,44,75,92,45),
                new Slytherin("Грегори Гойл", 42, 56,25,84,67,23,86)
        };
        Gryffindor[] studentGryffindor = {
                new Gryffindor("Гарри Поттер", 75, 89,54,23,63),
                new Gryffindor("Гермиона Грейнджер", 84, 72,75,14,75),
                new Gryffindor("Рон Уизли", 23, 73,85,24,96)
        };
        Hufflepuff[] studentHufflepuff = {
                new Hufflepuff("Захария Смит", 72, 87,52,85,34),
                new Hufflepuff("Седрик Диггори", 47, 14,63,14,95),
                new Hufflepuff("Джастин Финч-Флетчли", 96, 74,83,37,19)
        };
        Ravenclaw[] studentRavenclaw = {
                new Ravenclaw("Чжоу Чанг", 23, 54,34,83,91,23),
                new Ravenclaw("Падма Патил", 83, 62,63,91,32,74),
                new Ravenclaw("Маркус Белби", 36, 83,73,82,57,24)
        };
        Slytherin[] studentSlytherin = {
                new Slytherin("Драко Малфой", 74, 14,85,24,57,24,75),
                new Slytherin("Грэхэм Монтегю", 15, 98,82,44,75,92,45),
                new Slytherin("Грегори Гойл", 42, 56,25,84,67,23,86)
        };
        Hogwarts.print("Падма Патил",people);
        System.out.println();
        Gryffindor.comparison("Гарри Поттер","Рон Уизли",studentGryffindor);
        System.out.println();
        Hufflepuff.comparison("Джастин Финч-Флетчли","Захария Смит",studentHufflepuff);
        System.out.println();
        Ravenclaw.comparison("Маркус Белби","Падма Патил",studentRavenclaw);
        System.out.println();
        Slytherin.comparison("Грегори Гойл","Грэхэм Монтегю",studentSlytherin);
        System.out.println();
        Hogwarts.comparison("Грегори Гойл","Чжоу Чанг",people);



    }
}