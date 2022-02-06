package weapon;

public class Gun extends Weapon {

    @Override
    public String shot(){
        String voice = "Пиф-паф!";
        return voice;
    }
    @Override
    public String getName() {
        String name = "Gun";
        return name;
    }
}