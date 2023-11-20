public class Hogwarts {
    protected  String student;
    protected int magicalPowers;
    protected  int transgresson;
    public Hogwarts(String student, int magicalPowers, int transgresson) {
        this.student = student;
        this.magicalPowers = magicalPowers;
        this.transgresson = transgresson;
    }
    public String getStudent() {
        return student;
    }
    public int getMagicalPowers() {
        return magicalPowers;
    }
    public int getTransgresson() {
        return transgresson;
    }
    public void setMagicalPowers(int magicalPowers) {
        this.magicalPowers = magicalPowers;
    }
    public void setTransgresson(int transgresson) {
        this.transgresson = transgresson;
    }
    @Override
    public String toString() {
        return "Студент Hogwarts, " +
                "имя " + student + ' ' +
                ", сила магии " + magicalPowers +
                ", сила трансгрессии " + transgresson;
    }
    public void whoIsTheBestInHogwarts(Hogwarts student) {
            if (this.getMagicalPowers() > student.getMagicalPowers()) {
                System.out.println("Студент " + this.getStudent() + " сильнее, чем " + student.getStudent() + " по силе магии");
            } else if (this.getMagicalPowers() < student.getMagicalPowers()) {
                System.out.println("Студент " + student.getStudent() + " сильнее, чем " + this.getStudent() + " по силе магии");
            } else {
                System.out.println("Студент " + this.getStudent() + " равен " + student.getStudent() + " по силе магии");
            }
            if (this.getTransgresson() > student.getTransgresson()) {
                System.out.println("Студент " + this.getStudent() + " сильнее, чем " + student.getStudent() + " по силе трансгрессии");
            } else if (this.getTransgresson() < student.getTransgresson()) {
                System.out.println("Студент " + student.getStudent() + " сильнее, чем " + this.getStudent() + " по силе трансгрессии");
            } else {
                System.out.println("Студент " + this.getStudent() + " равен " + student.getStudent() + " по силе трансгрессии");
            }
        }
    }


