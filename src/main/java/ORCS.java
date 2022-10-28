public class ORCS extends Unit{
    public ORCS(String name, int health) {
        super(name, health);
    }

    @Override
    public void Run(){
        System.out.println("ORCS is run");
    }

    @Override
    public void Attack() {
        System.out.println("ORCS is attack");
    }
}
