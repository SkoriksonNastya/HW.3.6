package weapon;

public class Love extends Weapon {

    @Override
    public String shot(){
        String voice = "Ваше сердце остановилось!";
        return voice;
    }
    @Override
    public String getName() {
        String name = "Love";
        return name;
    }
}