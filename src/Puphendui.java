public class Puphendui extends Hogwarts {
   private int hardWork;
   private int fidelity;
    private int fairness;
    public Puphendui(String student, int magicalPowers, int transgresson,  int hardWork, int fidelity, int fairness) {
        super (student, magicalPowers, transgresson);
        this.hardWork = hardWork;
        this.fidelity = fidelity;
        this.fairness = fairness;
    }
    // геттеры и сеттеры
    public int getHardWork() {
        return hardWork;
    }
    public int getFidelity() {
        return fidelity;
    }
    public int getFairness() {
        return fairness;
    }
    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }
    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }
    public void setFairness(int fairness) {
        this.fairness = fairness;
    }
    @Override
    public String toString() {
        return super.toString() + ", факультет Пуффендуй" +
                ", трудолюбие" + hardWork +
                ", верность" + fidelity +
                ", честность" + fairness;
    }
    public void whoIsTheBestOnPuphendui(Puphendui student){
        if ((this.getHardWork() + this.getFidelity() + this.getFairness()) >
                (student.getHardWork() + student.getFidelity() + student.getFairness())) {
            System.out.println("Студент Пуфендуй " + this.getStudent() + " имеет лучшие софтскиллы, нежели чем " +  student.getStudent());
        } else if ((this.getHardWork() + this.getFidelity() + this.getFairness()) < (student.getHardWork() + student.getFidelity() + student.getFairness())) {
            System.out.println("Студент Пуфендуй " + student.getStudent() + " имеет лучшие софтскиллы, нежели чем " +  this.getStudent());
        } else {
            System.out.println("Студенты Пуфендуй " + this.getStudent() + " и " + student.getStudent() + " равны по силам");
        }
    }

}
