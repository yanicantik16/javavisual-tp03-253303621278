package com.unpri.charactermanager.model;

import java.util.ArrayList;

/** Mengelola koleksi Character dan menjaga agar daftar internal tetap terenkapsulasi. */
public class CharacterManager {
    private final ArrayList<Character> characterList = new ArrayList<>();

    /** Menambahkan karakter jika nama belum digunakan. @return true jika berhasil. */
    public boolean addCharacter(Character character) {
        if (character == null) {
            System.out.println("Gagal: karakter tidak boleh null.");
            return false;
        }
        if (findByName(character.getName()) != null) {
            System.out.println("Gagal: karakter dengan nama '" + character.getName() + "' sudah ada!");
            return false;
        }
        characterList.add(character);
        System.out.println("Karakter '" + character.getName() + "' berhasil ditambahkan.");
        return true;
    }

    /** Mencari karakter berdasarkan nama; null jika tidak ditemukan. */
    public Character findByName(String name) {
        if (name == null) return null;
        for (Character character : characterList) {
            if (character.getName().equals(name)) return character;
        }
        return null;
    }

    /** Menghapus karakter berdasarkan nama; true jika berhasil. */
    public boolean removeCharacter(String name) {
        Character target = findByName(name);
        if (target == null) {
            System.out.println("Gagal hapus: karakter '" + name + "' tidak ditemukan.");
            return false;
        }
        characterList.remove(target);
        System.out.println("Karakter '" + name + "' berhasil dihapus.");
        return true;
    }

    public int getTotalCharacters() { return characterList.size(); }

    /** Mengembalikan defensive copy agar pemanggil tidak dapat mengubah daftar internal. */
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characterList);
    }

    /** Menghitung rata-rata level; mengembalikan 0.0 jika belum ada karakter. */
    public double getAverageLevel() {
        if (characterList.isEmpty()) return 0.0;
        int totalLevel = 0;
        for (Character character : characterList) totalLevel += character.getLevel();
        return (double) totalLevel / characterList.size();
    }

    /** Mengembalikan daftar baru berisi semua karakter dengan tipe yang diminta. */
    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();
        if (type == null) return result;
        for (Character character : characterList) {
            if (character.getType() == type) result.add(character);
        }
        return result;
    }

    /** Fitur analitik TP5: menghitung karakter dengan tipe tertentu tanpa membuka daftar internal. */
    public int countByType(CharacterType type) {
        if (type == null) return 0;
        int count = 0;
        for (Character character : characterList) {
            if (character.getType() == type) count++;
        }
        return count;
    }
}
