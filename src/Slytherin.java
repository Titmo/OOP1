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

    public static void comparison(String firstName, String secondName, Slytherin[] studentSlytherin) {
        int scoresFirst = 0;
        int scoresSecond = 0;
        for (Slytherin slytherin : studentSlytherin) {
            if (firstName.equals(slytherin.getName())) {
                System.out.println(slytherin.notFullToString());
                scoresFirst = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getThirstForPower();
            }
            if (secondName.equals(slytherin.getName())) {
                System.out.println(slytherin.notFullToString());
                scoresSecond = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getThirstForPower();
            }
        }
        if (scoresSecond > scoresFirst) {
            System.out.println(firstName
                    + " лучший Слизеринец, чем " + secondName);
        } else if (scoresSecond < scoresFirst) {
            System.out.println(secondName
                    + " лучший Слизеринец, чем " + firstName);
        } else {
            System.out.println("Ученики оба хорошие Слизеринецы, имеют одинаковое количество баллов");
        }

    }
}
