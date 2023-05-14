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

    @Override
    public int calculateSpecificScore() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    public void printCompareOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println(String.format("%s лучший гриффиндорец чем %s", betterStudentName, otherStudentName));
    }
}

