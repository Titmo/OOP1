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

    @Override
    public int calculateSpecificScore() {
        return this.hardworking + this.loyal + this.honest;
    }

    @Override
    public void printCompareOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println(String.format("%s лучший пуфендуец чем %s", betterStudentName, otherStudentName));
    }
}

