public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, int powerMagic, int distanceTransgression, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, powerMagic, distanceTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                super.toString()+
                " ум:" + smart +
                ", мудрость:" + wise +
                ", остроумие:" + witty +
                ", творчество:" + fullOfCreativity +
                '}';
    }
    public String notFullToString() {
        return "Ravenclaw{" +" Имя:"+getName()+
                " ум:" + smart +
                ", мудрость:" + wise +
                ", остроумие:" + witty +
                ", творчество:" + fullOfCreativity +
                '}' ;
    }

    @Override
    public int calculateSpecificScore() {
        return this.smart + this.wise + this.witty + this.fullOfCreativity;
    }

    @Override
    public void printCompareOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println(String.format("%s лучший когтевранец чем %s", betterStudentName, otherStudentName));
    }
}

