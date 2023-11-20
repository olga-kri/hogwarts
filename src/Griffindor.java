public class Griffindor extends Hogwarts {
        private  int nobleness;
        private  int honor;
        private  int bravery;


        public Griffindor(String student, int magicalPowers, int transgresson,  int nobleness, int honor, int bravery) {
            super(student, magicalPowers, transgresson);
            this.nobleness = nobleness;
            this.honor = honor;
            this.bravery = bravery;

        }

        // геттеры

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    @Override
    public String toString() {
        return super.toString() + ", факультет Гриффиндор " +
        ", благородство " + nobleness +
                ", честь " + honor +
                ", храбрость " + bravery;
    }

    public void whoIsTheBestOnGrifindor (Griffindor student){

            if ((this.getNobleness()+ this.getHonor()+ this.getBravery()) > (student.getNobleness() + student.getHonor() + student.getBravery())) {
                System.out.println("Студент Гриффиндора " + this.getStudent() + " имеет лучшие софтскиллы, нежели чем " +  student.getStudent());
            } else if ((this.getNobleness()+ this.getHonor()+ this.getBravery()) < (student.getNobleness() + student.getHonor() + student.getBravery())) {
                System.out.println("Студент Гриффиндора " + student.getStudent() + " имеет лучшие софтскиллы, нежели чем " +  this.getStudent());
            } else {
                System.out.println("Студенты Гриффиндор " + this.getStudent() + " и " + student.getStudent() + " равны по силам");
            }
    }
    }

