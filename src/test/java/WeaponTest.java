import weapon.*;
import org.junit.jupiter.api.*;

public class WeaponTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Начало тестирования");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Тестирование завершено");
    }
    @Test
    public void testWaterGun(){
        String expected = "Кап-кап!";
        Weapon weapon = new WaterGun();
        String actual = weapon.shot();
        Assertions.assertEquals(expected, actual, "Слот работает некорректно");
    }
    @Test
    void shotWithWeapon() {
        int expected = 5;
        Weapon[] weaponSlots = new Weapon[]{
                new GrenadeLauncher(),
                new Gun(),
                new Slingshot(),
                new WaterGun(),
                new Love()
        };
        int actual = weaponSlots.length;
        Assertions.assertEquals(expected, actual, "Количество указанных слотов неверное");
    }
    @Test
    public void weaponChooseTest(){
        int[] weapons = {0, 1, 2, 3, 4};
        for (int slot : weapons){
            Player player = new Player();
            System.out.println("Вы выбрали слот" + slot);
            String expected = null;
            String actual = null;
            switch (slot) {
                case 0:
                    expected = "GrenadeLauncher";
                    actual = player.getWeapon(slot).getName();
                    Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
                    break;
                case 1:
                    expected = "Gun";
                    actual = player.getWeapon(slot).getName();
                    Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
                    break;
                case 2:
                    expected = "Slingshot";
                    actual = player.getWeapon(slot).getName();
                    Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
                    break;
                case 3:
                    expected = "WaterGun";
                    actual = player.getWeapon(slot).getName();
                    Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
                    break;
                case 4:
                    expected = "Love";
                    actual = player.getWeapon(slot).getName();
                    Assertions.assertEquals(expected, actual, " Выбор оружия работает некорректно ");
                    break;
            }
            System.out.println("expected : " + expected + "actual : " + actual);
        }
    }
}