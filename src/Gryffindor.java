public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int distanceTransgression, int nobility, int honor, int bravery) {
        super(name, powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                super.toString()+
                " храбрость:" + nobility +
                ", честь:" + honor +
                ", благородство:" + bravery +
                '}' ;
    }
    public String notFullToString() {
        return "Gryffindor{" +" Имя:"+getName()+
                " храбрость:" + nobility +
                ", честь:" + honor +
                ", благородство:" + bravery +
                '}' ;
    }

    public static void comparison(String firstName, String secondName, Gryffindor[] studentGryffindor) {
        int scoresFirst = 0;
        int scoresSecond = 0;
        for (Gryffindor person : studentGryffindor) {
            if (firstName.equals(person.getName())) {
                System.out.println(person.notFullToString());
                scoresFirst = person.getNobility() + person.getHonor() + person.getBravery();
            }
            if (secondName.equals(person.getName())) {
                System.out.println(person.notFullToString());
                scoresSecond = person.getNobility() + person.getHonor() + person.getBravery();
            }
        }
        if (scoresSecond > scoresFirst) {
            System.out.println(firstName
                    + " лучший Гриффиндорец, чем " + secondName);
        } else if (scoresSecond < scoresFirst) {
            System.out.println(secondName
                    + " лучший Гриффиндорец, чем " + firstName);
        } else {
            System.out.println("Ученики оба хорошие Гриффиндорцы, имеют одинаковое количество баллов");
        }

    }
}
