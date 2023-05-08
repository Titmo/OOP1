public class CalculatorHogwarts  {

    public void print (String name,Gryffindor[] studentGryffindor,Hufflepuff[] studentHufflepuff,Ravenclaw[] studentRavenclaw,Slytherin[] studentSlytherin,Hogwarts[] people) {
        for (Hogwarts person : people) {
            if (name.equals(person.getName())) {
                System.out.print(name + " Сила магии:" + person.getPowerMagic()
                        + " расстояние трансгресии:" + person.getDistanceTransgression());
                for (Gryffindor gryffindor : studentGryffindor) {
                    if (name.equals(gryffindor.getName())) {
                        System.out.print(" благородство:"
                                + gryffindor.getBravery() + " честь:"
                                + gryffindor.getHonor() + " храбрость:"
                                + gryffindor.getBravery());
                        break;
                    }
                }
                for (Hufflepuff hufflepuff : studentHufflepuff) {
                    if (name.equals(hufflepuff.getName())) {
                        System.out.print(" трудолюбив:"
                                + hufflepuff.getHardworking() + " верен:"
                                + hufflepuff.getLoyal() + " честен:"
                                + hufflepuff.getHonest());
                        break;
                    }
                }
                for (Ravenclaw ravenclaw : studentRavenclaw) {
                    if (name.equals(ravenclaw.getName())) {
                        System.out.print(" ум:"
                                + ravenclaw.getSmart() + " мудрость:"
                                + ravenclaw.getWise() + " остроумие:"
                                + ravenclaw.getWitty() + "творчество"
                                + ravenclaw.getFullOfCreativity());
                        break;
                    }
                }
                for (Slytherin slytherin : studentSlytherin) {
                    if (name.equals(slytherin.getName())) {
                        System.out.print(" хитрость:"
                                + slytherin.getCunning() + " решительность:"
                                + slytherin.getDetermination() + " амбициозность:"
                                + slytherin.getAmbition() + " находчивость:"
                                + slytherin.getResourcefulness() + " жажда власти:"
                                + slytherin.getThirstForPower());
                        break;
                    }
                }
            }
        }
    }
    public void comparison(Gryffindor[] studentGryffindor,String firstName,String secondName) {
        int scoresFirst = 0;
        int scoresSecond = 0;
        for (Gryffindor gryffindor : studentGryffindor) {
            if (firstName.equals(gryffindor.getName())) {
                System.out.println(firstName + " благородство:"
                        + gryffindor.getBravery() + " честь:"
                        + gryffindor.getHonor() + " храбрость:"
                        + gryffindor.getBravery());
                scoresFirst = gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getBravery();
            }
            if (secondName.equals(gryffindor.getName())) {
                System.out.println(secondName + " благородство:"
                        + gryffindor.getBravery() + " честь:"
                        + gryffindor.getHonor() + " храбрость:"
                        + gryffindor.getBravery());
                scoresSecond = gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getBravery();
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

    public void comparison(Hufflepuff[] studentHufflepuff,String firstName,String secondName) {
        int scoresFirst = 0;
        int scoresSecond = 0;
        for (Hufflepuff hufflepuff : studentHufflepuff) {
            if (firstName.equals(hufflepuff.getName())) {
                System.out.println(firstName + " трудолюбив:"
                        + hufflepuff.getHardworking() + " верен:"
                        + hufflepuff.getLoyal() + " честен:"
                        + hufflepuff.getHonest());
                scoresFirst = hufflepuff.getHardworking() + hufflepuff.getLoyal() + hufflepuff.getHonest();
            }
            if (secondName.equals(hufflepuff.getName())) {
                System.out.println(secondName + " трудолюбив:"
                        + hufflepuff.getHardworking() + " верен:"
                        + hufflepuff.getLoyal() + " честен:"
                        + hufflepuff.getHonest());
                scoresFirst = hufflepuff.getHardworking() + hufflepuff.getLoyal() + hufflepuff.getHonest();
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

    public void comparison(Ravenclaw[] studentRavenclaw,String firstName,String secondName) {
        int scoresFirst = 0;
        int scoresSecond = 0;
        for (Ravenclaw ravenclaw : studentRavenclaw) {
            if (firstName.equals(ravenclaw.getName())) {
                System.out.println(firstName + " ум:"
                        + ravenclaw.getSmart() + " мудрость:"
                        + ravenclaw.getWise() + " остроумие:"
                        + ravenclaw.getWitty() + "творчество"
                        + ravenclaw.getFullOfCreativity());
                scoresFirst = ravenclaw.getSmart() + ravenclaw.getWise() + ravenclaw.getWitty() + ravenclaw.getFullOfCreativity();
            }
            if (secondName.equals(ravenclaw.getName())) {
                System.out.println(secondName + " ум:"
                        + ravenclaw.getSmart() + " мудрость:"
                        + ravenclaw.getWise() + " остроумие:"
                        + ravenclaw.getWitty() + "творчество"
                        + ravenclaw.getFullOfCreativity());
                scoresFirst = ravenclaw.getSmart() + ravenclaw.getWise() + ravenclaw.getWitty() + ravenclaw.getFullOfCreativity();
            }
        }
        if (scoresSecond > scoresFirst) {
            System.out.println(firstName
                    + " лучший Когтевранец, чем " + secondName);
        } else if (scoresSecond < scoresFirst) {
            System.out.println(secondName
                    + " лучший Когтевранец, чем " + firstName);
        } else {
            System.out.println("Ученики оба хорошие Когтевранецы, имеют одинаковое количество баллов");
        }

    }

    public void comparison(Slytherin[] studentSlytherin,String firstName,String secondName) {
        int scoresFirst = 0;
        int scoresSecond = 0;
        for (Slytherin slytherin : studentSlytherin) {
            if (firstName.equals(slytherin.getName())) {
                System.out.println(firstName + " хитрость:"
                        + slytherin.getCunning() + " решительность:"
                        + slytherin.getDetermination() + " амбициозность:"
                        + slytherin.getAmbition() + " находчивость:"
                        + slytherin.getResourcefulness() + " жажда власти:"
                        + slytherin.getThirstForPower());
                scoresSecond = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getThirstForPower();

            }
            if (secondName.equals(slytherin.getName())) {
                System.out.println(secondName + " хитрость:"
                        + slytherin.getCunning() + " решительность:"
                        + slytherin.getDetermination() + " амбициозность:"
                        + slytherin.getAmbition() + " находчивость:"
                        + slytherin.getResourcefulness() + " жажда власти:"
                        + slytherin.getThirstForPower());
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

    public static void comparison(Hogwarts[] people, String firstName, String secondName) {
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
