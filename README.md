
# Character Manager — TP8

## 1. Deskripsi
Character Manager merupakan aplikasi Java sederhana untuk mengelola dan menampilkan data karakter game. Project ini dikembangkan menggunakan konsep Object-Oriented Programming (OOP) dan Java Swing untuk membuat antarmuka grafis.

## 2. Fitur Aplikasi
- Menyimpan dan mengelola kumpulan karakter menggunakan ArrayList.
- Mencegah penambahan karakter dengan nama yang sama.
- Menyediakan empat jenis karakter: WARRIOR, MAGE, ARCHER, dan HEALER.
- Menampilkan nama, tipe, level, Hit Points (HP), dan Attack Power.
- Menghitung total karakter.
- Menghitung rata-rata level karakter.
- Menampilkan informasi melalui GUI Java Swing.

## 3. Struktur Project

```text
CharacterManager/
├── src/
│   ├── Main.java
│   └── com/unpri/charactermanager/
│       ├── model/
│       │   ├── Character.java
│       │   ├── CharacterManager.java
│       │   └── CharacterType.java
│       └── view/
│           └── MainWindow.java
├── out/
├── screenshots/
└── README.md
```

## 4. Teknologi yang Digunakan
- Java
- Java Swing
- ArrayList
- Enum
- Object-Oriented Programming (OOP)

## 5. Data Karakter
Aplikasi menampilkan lima karakter contoh:
1. Arjuna — WARRIOR, level 5
2. Merlin — MAGE, level 3
3. Athena — ARCHER, level 4
4. Srikandi — HEALER, level 6
5. Gatotkaca — WARRIOR, level 8

## 6. Cara Menjalankan Program
Buka terminal pada folder utama project, kemudian jalankan perintah kompilasi berikut:

```powershell
javac -d out src\com\unpri\charactermanager\model\CharacterType.java src\com\unpri\charactermanager\model\Character.java src\com\unpri\charactermanager\model\CharacterManager.java src\com\unpri\charactermanager\view\MainWindow.java src\Main.java
```

Setelah kompilasi berhasil, jalankan aplikasi dengan perintah:

```powershell
java -cp out Main
```

## 7. Analisis
Project ini menerapkan pemrograman berorientasi objek dengan membagi kode ke dalam package model dan view. Package model berisi kelas yang mengelola data karakter, sedangkan package view bertanggung jawab menampilkan antarmuka pengguna.

Kelas Character merepresentasikan karakter dengan atribut nama, tipe, level, HP, dan attack power. Enum CharacterType membatasi jenis karakter pada pilihan yang telah ditentukan. CharacterManager mengelola daftar karakter menggunakan ArrayList dan menyediakan fungsi untuk menambah, mencari, menghapus, serta menghitung jumlah dan rata-rata level karakter.

Kelas MainWindow menggunakan Java Swing untuk menampilkan informasi karakter dalam panel yang dapat digulir. Bagian bawah jendela menampilkan total karakter dan rata-rata level. Dengan struktur tersebut, kode lebih terorganisasi dan lebih mudah dikembangkan.

## 8. Bukti Program
Screenshot kode, terminal, dan aplikasi yang sedang berjalan disimpan dalam folder screenshots.
