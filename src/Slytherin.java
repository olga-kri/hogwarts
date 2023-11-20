public class Slytherin extends Hogwarts {

    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slytherin (String student, int magicalPowers, int transgresson,  int cunning, int resoluteness, int ambition, int resourcefulness, int lustForPower) {
        super(student, magicalPowers, transgresson);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }
    // геттеры и сеттеры
    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }



    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", факультет Слизерин" +
                ", хитрость" + cunning +
                ", решительность" + resoluteness +
                ", амбициозность" + ambition +
                ", находчивость" + resourcefulness +
                ", жажда власти" + lustForPower;
    }

    public void whoIsTheBestOnSlytherin(Slytherin student){

        if ((this.getCunning() + this.getResoluteness() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower()) >
                (student.getCunning() + student.getResoluteness() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower())) {
            System.out.println("Студент Слизерин " + this.getStudent() + " имеет лучшие софтскиллы, нежели чем " +  student.getStudent());
        } else if ((this.getCunning() + this.getResoluteness() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower()) <
                (student.getCunning() + student.getResoluteness() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower())) {
            System.out.println("Студент Слизерин " + student.getStudent() + " имеет лучшие софтскиллы, нежели чем " +  this.getStudent());
        } else {
            System.out.println("Студенты Слизерин " + this.getStudent() + " и " + student.getStudent() + " равны по силам");
        }
    }
}

