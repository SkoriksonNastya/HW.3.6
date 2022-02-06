import weapon.*;

public class Player {

    private Weapon[] weaponSlots;

    public Player() {

        weaponSlots = new Weapon[] {
                new GrenadeLauncher(),
                new Gun(),
                new Slingshot(),
                new WaterGun(),
                new Love()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public Weapon getWeapon(int slot) {
        return weaponSlots[slot];
    }

    public void shotWithWeapon(int slot){
        if(slot < -2 || slot > getSlotsCount() || slot == 0){
            System.out.println("Ошибка! Вы ввелии не коректное значение. Значение слота должно быть от 1 до " + getSlotsCount());
        } else {
            Weapon weapon = weaponSlots[slot - 1];
            weapon.shot();
        }
    }
}