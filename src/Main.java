public class Main {
    public static void main(String[] args) {
        Hogwarts[] people = {
                new Hogwarts("Гарри Поттер", 75, 89),
                new Hogwarts("Гермиона Грейнджер", 84, 72),
                new Hogwarts("Рон Уизли", 23, 73),
                new Hogwarts("Драко Малфой", 74, 14),
                new Hogwarts("Грэхэм Монтегю", 15, 98),
                new Hogwarts("Грегори Гойл", 42, 56),
                new Hogwarts("Захария Смит", 72, 87),
                new Hogwarts("Седрик Диггори", 47, 14),
                new Hogwarts("Джастин Финч-Флетчли", 96, 74),
                new Hogwarts("Чжоу Чанг", 23, 54),
                new Hogwarts("Падма Патил", 83, 62),
                new Hogwarts("Маркус Белби", 36, 83),
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
        CalculatorHogwarts calculatorHogwarts = new CalculatorHogwarts();
        calculatorHogwarts.print("Гарри Поттер",studentGryffindor,studentHufflepuff,studentRavenclaw,studentSlytherin, people);
        System.out.println("\n");
        calculatorHogwarts.comparison(studentGryffindor,"Гарри Поттер","Рон Уизли");
        System.out.println();
        calculatorHogwarts.comparison(studentHufflepuff,"Захария Смит","Седрик Диггори");
        System.out.println();
        calculatorHogwarts.comparison(studentRavenclaw,"Чжоу Чанг","Падма Патил");
        System.out.println();
        calculatorHogwarts.comparison(studentSlytherin,"Грегори Гойл","Драко Малфой");
        System.out.println();
        CalculatorHogwarts.comparison(people,"Джастин Финч-Флетчли", "Грэхэм Монтегю");


    }
}