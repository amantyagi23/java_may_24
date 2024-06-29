public class Human {
    int leg = 2;
    int hand;
    int eyes = 2;
    int ear = 2;

    void accMinusEye() {
        eyes = 1;
    }

    void move() {
        System.out.println("move");
    }

    void see() {

    }

    void run() {

    }

    void fight() {

    }

    int eat() {
        return 0;
    }

    public static void main(String[] args) {

        Human aman = new Human();
        Human tushar = new Human();
        Human jatin = new Human();

        tushar.move();
        Human yash = new Human();

        yash.move();

        System.out.println(yash.eyes);

        System.out.println(jatin.leg);
        aman.hand = 2;
        System.out.println(aman.hand);
        yash.accMinusEye();
        System.out.println(yash.eyes);
    }
}
