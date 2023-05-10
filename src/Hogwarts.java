public class Hogwarts {
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

    public static void print(String name, Hogwarts[] people) {
        for (Hogwarts person : people) {
            if (name.equals(person.getName())) {
                System.out.println(person.toString());
            }
        }
    }

    public static void comparison(String firstName, String secondName, Hogwarts[] people ) {
        int scoresFirst = 0;
        int scoresSecond = 0;
        for (Hogwarts person : people) {
            if (firstName.equals(person.getName())) {
                scoresFirst = person.getPowerMagic() + person.getDistanceTransgression();
            }
            if (secondName.equals(person.getName())) {
                scoresSecond = person.getPowerMagic() + person.getDistanceTransgression();
            }
        }
        if (scoresSecond > scoresFirst) {
            System.out.println(firstName
                    + " обладает большей мощностью магии, чем " + secondName);
        } else if (scoresSecond < scoresFirst) {
            System.out.println(secondName
                    + " обладает большей мощностью магии, чем " + firstName);
        } else {
            System.out.println("Ученики оба обладает большей мощностью магии, имеют одинаковое количество баллов");
        }
    }
}
