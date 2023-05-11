public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerMagic, int distanceTransgression, int hardworking, int loyal, int honest) {
        super(name, powerMagic, distanceTransgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                super.toString()+
                " трудолюбив:" + hardworking +
                ", верен:" + loyal +
                ", честен:" + honest +
                '}';
    }
    public String notFullToString() {
        return "Hufflepuff{" +" Имя:"+getName()+
                " трудолюбив:" + hardworking +
                ", верен:" + loyal +
                ", честен:" + honest +
                '}';
    }

    public static void comparison(String firstName, String secondName, Hufflepuff[] studentHufflepuff) {
        int scoresFirst = 0;
        int scoresSecond = 0;
        for (Hufflepuff hufflepuff : studentHufflepuff) {
            if (firstName.equals(hufflepuff.getName())) {
                System.out.println(hufflepuff.notFullToString());
                scoresFirst = hufflepuff.getHardworking() + hufflepuff.getLoyal() + hufflepuff.getHonest();
            }
            if (secondName.equals(hufflepuff.getName())) {
                System.out.println(hufflepuff.notFullToString());
                scoresSecond = hufflepuff.getHardworking() + hufflepuff.getLoyal() + hufflepuff.getHonest();
            }
        }
        if (scoresSecond > scoresFirst) {
            System.out.println(firstName
                    + " лучший Пуффендорец , чем " + secondName);
        } else if (scoresSecond < scoresFirst) {
            System.out.println(secondName
                    + " лучший Пуффендорец, чем " + firstName);
        } else {
            System.out.println("Ученики оба хорошие Пуффендорецы, имеют одинаковое количество баллов");
        }

    }
}
