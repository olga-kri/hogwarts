public class Kogtevrun extends Hogwarts {
   private int mind;
    private int wisdom;
    private int humor;
   private int creation;
   private  int facultySkill;

    public Kogtevrun (String student, int magicalPowers, int transgresson,  int mind, int wisdom, int humor, int creation) {
        super(student, magicalPowers, transgresson);
        this.mind = mind;
        this.wisdom = wisdom;
        this.humor = humor;
        this.creation = creation;
        this.facultySkill = mind + wisdom + humor + creation;
    }
    // геттеры и сеттеры
    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getHumor() {
        return humor;
    }

    public int getCreation() {
        return creation;
    }

    public int getFacultySkill() {
        return facultySkill;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() + ", факультет Когтевран" +
                ", ум" + mind +
                ", мудрость" + wisdom +
                ", остроумие" + humor +
                ", креативность" + creation;
    }
    public void WhoIsTheBestOnKogtevrun(Kogtevrun student){

        if (this.getFacultySkill() > student.getFacultySkill()) {
            System.out.println("Студент Когтевран " + this.getStudent() + " имеет лучшие софтскиллы, нежели чем " +  student.getStudent());
        } else if (this.facultySkill < student.facultySkill) {
            System.out.println("Студент Когтевран " + student.getStudent() + " имеет лучшие софтскиллы, нежели чем " +  this.getStudent());
        } else {
            System.out.println("Студенты Когтевран " + this.getStudent() + " и " + student.getStudent() + " равны по силам");
        }
    }
}


