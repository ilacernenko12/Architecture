public class Main {
    public static void main(String[] args) {

        Unit elves = new ELVES("Blade",100);
        Unit orcs = new ORCS("Alchemist", 80);
        Unit people = new People("Vladimir", 50);

        elves.Run();
        orcs.Run();
        people.Run();

        elves.Attack();
        orcs.Attack();
        people.Attack();
    }
}
