import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием:"
                + "1. Гранатомет 2. Пистолет  3. Рогатка  4. Водный пистоле 5. Секретное оружие."
                + " Введите номер слота, чтобы выстрелеть,"
                + " -1 чтобы выйти%n", player.getSlotsCount());

        int slot;

        while(true){
            slot = Integer.parseInt(scanner.nextLine());
            if (slot == (-1)){
                break;
            }
            player.shotWithWeapon(slot);

        }
        System.out.println("Game over!");
    }
}