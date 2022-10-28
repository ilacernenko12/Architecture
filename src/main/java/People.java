public class People extends Unit{
    public People(String name, int health) {
        super(name, health);
    }

    @Override
    public void Run(){
        System.out.println("People is run");
    }

    @Override
    public void Attack() {
        System.out.println("People is attack");
    }
}
