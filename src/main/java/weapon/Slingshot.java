package weapon;

public class Slingshot extends Weapon {

    @Override
    public String shot(){
        String voice = "Вжих!";
        return voice;
    }
    @Override
    public String getName() {
        String name = "Slingshot";
        return name;
    }
}