public abstract class Hogwarts {
    private String name;
    private int powerMagic;
    private int distanceTransgression;


    public Hogwarts(String name, int powerMagic, int distanceTransgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    @Override
    public String toString() {
        return "Имя:" + name +
                ", Сила магии:" + powerMagic +
                ", расстояние трансгресии:" + distanceTransgression
                ;
    }

    public int calculateGeneralScore() {
        return powerMagic + distanceTransgression;
    }

    public abstract int calculateSpecificScore();

    public abstract void printCompareOfStudents(String betterStudentName, String otherStudentName);

    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareBySpecific(hogwarts);
        } else {
            compareByGeneral(hogwarts);
        }
    }

    private void compareBySpecific(Hogwarts hogwarts) {
        int thisScore = this.calculateGeneralScore() + this.calculateSpecificScore();
        int otherScore = hogwarts.calculateGeneralScore() + hogwarts.calculateSpecificScore();
        if (thisScore > otherScore) {
            printCompareOfStudents(this.getName(), hogwarts.getName());
        } else if (thisScore < otherScore) {
            printCompareOfStudents(hogwarts.getName(), this.getName());
        } else {
            System.out.println("Волшебники равны по силе");
        }
    }

    private void compareByGeneral(Hogwarts hogwarts) {
        int thisScore = this.calculateGeneralScore();
        int otherScore = hogwarts.calculateGeneralScore();
        if (thisScore > otherScore) {
            System.out.println(String.format("%s сильнее чем %s", this.name, hogwarts.getName()));
        } else if (thisScore < otherScore) {
            System.out.println(String.format("%s сильнее чем %s", hogwarts.getName(), this.name));
        } else {
            System.out.println("Волшебники равны по силе");
        }
    }
}

