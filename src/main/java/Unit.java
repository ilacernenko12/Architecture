abstract class Unit {
    String name;
    int health;

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void Run() {
        System.out.println("Run");
    }

    public void Attack() {
        System.out.println("Attack");
    }
}
