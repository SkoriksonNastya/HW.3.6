package weapon;

public class GrenadeLauncher extends Weapon {

    @Override
    public String shot(){
        String voice = "Бум!";
        return voice;
    }
    @Override
    public String getName() {
        String name = "GrenadeLauncher";
        return name;
    }
}