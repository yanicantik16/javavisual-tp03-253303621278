
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Character Manager v0.1 ===");

        // Membuat tiga karakter awal.
        Character hero = new Character(
                "Arjuna", CharacterType.WARRIOR, 5);

        Character wizard = new Character(
                "Merlin", CharacterType.MAGE, 3);

        Character scout = new Character(
                "Athena", CharacterType.ARCHER, 4);

        System.out.println(hero);
        System.out.println(wizard);
        System.out.println(scout);

        // Menaikkan level Arjuna.
        System.out.println();
        System.out.println(">> " + hero.getName() + " level up!");

        hero.setLevel(hero.getLevel() + 1);

        System.out.println("After level up: " + hero);

        System.out.println();
        System.out.println(">> Nama karakter: " + hero.getName());
        System.out.println(">> Jenis karakter: " + hero.getType());
        System.out.println(">> HP saat ini: " + hero.getHitPoints());

        // Karakter tambahan untuk mini-challenge.
        System.out.println();
        System.out.println("=== Mini-Challenge: Mana dan IsAlive ===");

        Character healer = new Character(
                "Aurora", CharacterType.HEALER, 2);

        healer.setMana(75);

        System.out.println(healer);
        System.out.println(
                ">> Apakah " + healer.getName()
                + " masih hidup? " + healer.isAlive());
    }
}
