import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Character Manager - TP5 Test ===\n");
        CharacterManager manager = new CharacterManager();

        manager.addCharacter(new Character("Arjuna", CharacterType.WARRIOR, 5));
        manager.addCharacter(new Character("Merlin", CharacterType.MAGE, 3));
        manager.addCharacter(new Character("Athena", CharacterType.ARCHER, 4));
        System.out.println();
        manager.addCharacter(new Character("Arjuna", CharacterType.HEALER, 1));

        System.out.println("\nTotal karakter: " + manager.getTotalCharacters());
        Character found = manager.findByName("Merlin");
        System.out.println("Cari Merlin: " + (found != null ? found : "tidak ditemukan"));
        System.out.println("Cari Zeus: " + (manager.findByName("Zeus") == null ? "tidak ditemukan (sesuai harapan)" : "ditemukan"));

        System.out.println("\n--- Mini-Challenge ---");
        System.out.println("Rata-rata level: " + manager.getAverageLevel());
        System.out.println("Jumlah WARRIOR: " + manager.findByType(CharacterType.WARRIOR).size());
        System.out.println("Daftar MAGE:");
        for (Character c : manager.findByType(CharacterType.MAGE)) System.out.println(c);
        System.out.println("countByType(MAGE): " + manager.countByType(CharacterType.MAGE));

        System.out.println("\n--- Hapus Athena ---");
        manager.removeCharacter("Athena");
        System.out.println("Total setelah hapus: " + manager.getTotalCharacters());

        System.out.println("\n--- Eksperimen Reference ---");
        Character asli = manager.findByName("Arjuna");
        Character alias = asli;
        System.out.println("Level sebelum: " + asli.getLevel());
        alias.setLevel(99);
        System.out.println("Level sesudah diubah lewat alias: " + asli.getLevel());
        System.out.println("asli == alias? " + (asli == alias));

        ArrayList<Character> salinanList = manager.getAllCharacters();
        salinanList.add(new Character("Hantu", CharacterType.MAGE, 1));
        System.out.println("Total di manager asli: " + manager.getTotalCharacters());
        System.out.println("Total di salinan list: " + salinanList.size());

        System.out.println("\n--- Static Counter ---");
        System.out.println("Object Character yang pernah dibuat: " + Character.getTotalCharacterCreated());

        System.out.println("\n--- Uji List Kosong ---");
        CharacterManager emptyManager = new CharacterManager();
        System.out.println("Rata-rata level saat list kosong: " + emptyManager.getAverageLevel());
    }
}
