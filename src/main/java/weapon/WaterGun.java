package weapon;

public class WaterGun extends Weapon {

    @Override
    public String shot(){
        String voice = "Кап-кап!";
        return voice;
    }
    @Override
    public String getName() {
        String name = "WaterGun";
        return name;
    }
}