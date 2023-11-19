public class Main {


    public static void main(String[] args) {
        Griffindor potter = new Griffindor("Гарри Поттер", 97, 75, 77, 87, 95);
        Griffindor greindger = new Griffindor("Гермиона Грейнджер", 90, 90, 70, 80, 74);
        Griffindor uisly = new Griffindor("Рон Уизли", 80, 65, 70, 70, 56);
        Slytherin malfoy = new Slytherin("Драко Малфой", 84, 74, 87, 79, 79, 98, 99);
        Slytherin montegu = new Slytherin("Грэхем Монтегю", 75, 54, 78, 75, 87, 87, 80);
        Slytherin goil = new Slytherin("Грегори Гойл", 76, 69, 88, 87, 74, 78, 85);
        Puphendui smith = new Puphendui("Захария Смит", 78, 54, 44, 74, 78);
        Puphendui diggori = new Puphendui("Седрик Диггори", 72, 70, 80, 85, 90);
        Puphendui finch = new Puphendui("Джастин Финч-Флетчли", 69, 72, 71, 87, 91);
        Kogtevrun chang = new Kogtevrun("Чжоу Чанг", 78, 81, 78, 91, 89, 78);
        Kogtevrun patil = new Kogtevrun("Падма Патил", 77, 78, 87, 80, 78, 89);
        Kogtevrun belbi = new Kogtevrun("Маркус Белби", 74, 74, 92, 88, 75, 94);

       System.out.println(potter);
       potter.WhoIsTheBestOnGrifindor(greindger);
       uisly.whoIsTheBestInHogwarts(malfoy);

    }

}