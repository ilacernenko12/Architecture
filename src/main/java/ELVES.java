public class ELVES extends Unit{
    public ELVES(String name, int health) {
        super(name, health);
    }

    @Override
    public void Run(){
        System.out.println("ELVES is run");
    }

    @Override
    public void Attack() {
        System.out.println("ELVES is attack");
    }
}
