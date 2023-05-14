public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int thirstForPower;

    public Slytherin(String name, int powerMagic, int distanceTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerMagic, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                super.toString()+
                "хитрость:" + cunning +
                ", решительность:" + determination +
                ", амбициозность:" + ambition +
                ", находчивость:" + resourcefulness +
                ", жажда власти:" + thirstForPower +
                '}';
    }
    public String notFullToString() {
        return "Slytherin{" +" Имя:"+getName()+
                "хитрость:" + cunning +
                ", решительность:" + determination +
                ", амбициозность:" + ambition +
                ", находчивость:" + resourcefulness +
                ", жажда власти:" + thirstForPower +
                '}' ;
    }

    @Override
    public int calculateSpecificScore() {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
    }

    @Override
    public void printCompareOfStudents(String betterStudentName, String otherStudentName) {
        System.out.println(String.format("%s лучший слизеринец чем %s", betterStudentName, otherStudentName));
    }
}
