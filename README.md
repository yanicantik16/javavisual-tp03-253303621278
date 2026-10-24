
# Character Manager — TP8

## 1. Deskripsi Project

Character Manager adalah aplikasi Java berbasis GUI yang digunakan untuk mengelola dan menampilkan data karakter game.

Project ini merupakan pengembangan dari tugas sebelumnya dengan menerapkan konsep Object-Oriented Programming (OOP), Java Swing, ArrayList, dan pemisahan package berdasarkan tanggung jawab kelas.

Aplikasi menampilkan data karakter secara dinamis menggunakan perulangan, sehingga penambahan karakter tidak memerlukan pembuatan JLabel secara manual untuk setiap karakter.

## 2. Tujuan Praktikum

Tujuan pengembangan project ini adalah:

- Menerapkan konsep Object-Oriented Programming (OOP).
- Membuat antarmuka grafis menggunakan Java Swing.
- Mengimplementasikan JFrame sebagai jendela utama.
- Menggunakan JPanel dan JLabel untuk menampilkan data.
- Menampilkan koleksi karakter secara dinamis.
- Menghitung total karakter dan rata-rata level.
- Memahami pemisahan model dan view dalam konsep MVC.
- Menjalankan GUI menggunakan SwingUtilities.invokeLater().

## 3. Fitur Aplikasi

Aplikasi Character Manager memiliki fitur:

- Menambahkan karakter ke dalam ArrayList.
- Mencegah penambahan karakter dengan nama duplikat.
- Mencari karakter berdasarkan nama dan tipe.
- Menghapus karakter berdasarkan nama.
- Menampilkan nama, tipe, level, HP, dan Attack Power.
- Menghitung total karakter.
- Menghitung rata-rata level karakter.
- Menampilkan seluruh karakter secara dinamis.
- Menggunakan JScrollPane agar data dapat digulir.

## 4. Struktur Project

```text
CharacterManager/
├── src/
│   ├── Main.java
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── model/
│               │   ├── Character.java
│               │   ├── CharacterManager.java
│               │   └── CharacterType.java
│               └── view/
│                   └── MainWindow.java
├── out/
├── screenshots/
│   ├── tp8-tampilan-aplikasi.png
│   └── tp8-kode-terminal.png
└── README.md
```

## 5. Teknologi yang Digunakan

- Bahasa pemrograman Java
- Java Swing
- Visual Studio Code
- ArrayList
- Enum
- Object-Oriented Programming (OOP)
- Git dan GitHub

## 6. Data Karakter

Program menggunakan lima karakter contoh:

| No | Nama | Tipe | Level |
|----|------|------|-------|
| 1 | Arjuna | WARRIOR | 5 |
| 2 | Merlin | MAGE | 3 |
| 3 | Athena | ARCHER | 4 |
| 4 | Srikandi | HEALER | 6 |
| 5 | Gatotkaca | WARRIOR | 8 |

**Total Karakter:** 5

**Rata-rata Level:** 5.20

## 7. Cara Menjalankan Program

Buka terminal pada folder utama project CharacterManager.

### Kompilasi Program

```powershell
javac -d out src\com\unpri\charactermanager\model\CharacterType.java src\com\unpri\charactermanager\model\Character.java src\com\unpri\charactermanager\model\CharacterManager.java src\com\unpri\charactermanager\view\MainWindow.java src\Main.java
```

### Menjalankan Program

```powershell
java -cp out Main
```

Setelah program dijalankan, jendela Character Manager akan menampilkan lima karakter beserta informasi dan statistiknya.

## 8. Bukti Program

Berikut merupakan dokumentasi hasil implementasi Character Manager TP8.

### 8.1 Screenshot Tampilan Aplikasi

Screenshot berikut menunjukkan aplikasi Character Manager yang berhasil dijalankan menggunakan Java Swing.

![Tampilan Aplikasi Character Manager TP8](screenshots/Screenshot%202026-10-24%20070759.png)

### 8.2 Screenshot Kode dan Terminal VS Code

Screenshot berikut menunjukkan implementasi kode Java di Visual Studio Code serta hasil eksekusi program melalui terminal.

![Kode dan Terminal Character Manager TP8](screenshots/Screenshot%202026-10-24%20070905.png)

## 9. Analisis Implementasi

Project Character Manager menerapkan konsep pemrograman berorientasi objek dengan memisahkan bagian model dan view.

Package model terdiri dari Character, CharacterManager, dan CharacterType. Kelas Character menyimpan atribut karakter, sedangkan CharacterManager mengelola kumpulan karakter menggunakan ArrayList.

Package view berisi MainWindow yang bertanggung jawab menampilkan data karakter menggunakan komponen Java Swing.

Data karakter ditampilkan secara dinamis menggunakan perulangan for-each. Dengan pendekatan ini, jumlah karakter yang ditampilkan dapat mengikuti isi koleksi tanpa harus menambahkan komponen secara manual untuk setiap karakter.

Aplikasi juga menampilkan total karakter dan rata-rata level sebagai informasi statistik.

Pemanggilan SwingUtilities.invokeLater() pada Main.java memastikan proses pembuatan antarmuka dilakukan melalui Event Dispatch Thread (EDT).

Pemisahan tanggung jawab antara model dan view membuat kode lebih terstruktur dan lebih mudah dikembangkan.

## 10. Link Google Docs Analisis TP8

Dokumen analisis lengkap Character Manager TP8 dapat dibaca melalui Google Docs berikut:

[Klik di sini untuk melihat Analisis Character Manager TP8](https://docs.google.com/document/d/1N_j1fCVVdD4JbcHTHUzI1LIU6VkryTnDt11Zz_TMtzY/edit?usp=sharing)

## 11. Kesimpulan

Project Character Manager TP8 berhasil dikembangkan menggunakan Java Swing dengan menerapkan konsep OOP, ArrayList, enum, dan pemisahan package.

Aplikasi dapat menampilkan lima karakter secara dinamis beserta informasi nama, tipe, level, HP, dan Attack Power.

Selain itu, aplikasi berhasil menampilkan total karakter dan rata-rata level.

Project ini menjadi dasar untuk pengembangan aplikasi Java berbasis GUI yang lebih kompleks pada praktikum selanjutnya.
