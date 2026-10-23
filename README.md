
# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi

Character Manager adalah aplikasi Java sederhana untuk mengelola karakter game. Project ini dibuat untuk menerapkan konsep Object-Oriented Programming (OOP), seperti class, object, constructor, encapsulation, getter, setter, dan enum. Program ini memiliki fitur untuk membuat karakter, menaikkan level, menghitung HP dan attack berdasarkan level, mengatur mana, serta memeriksa status hidup karakter menggunakan method `isAlive()`.

## Fitur

- Membuat karakter dengan nama, jenis karakter, dan level.
- Menggunakan enum `CharacterType` untuk menentukan jenis karakter.
- Menggunakan dua constructor untuk membuat objek karakter.
- Menerapkan encapsulation dengan atribut `private`.
- Menggunakan getter dan setter untuk mengakses serta mengubah data karakter.
- Menghitung HP dan attack berdasarkan level karakter.
- Menaikkan level karakter menggunakan method `setLevel()`.
- Mengatur mana dengan validasi agar nilainya tidak negatif.
- Memeriksa apakah karakter masih hidup menggunakan method `isAlive()`.

## Struktur Folder

```text
CharacterManager/
├── src/
│   ├── Main.java
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               └── model/
│                   ├── Character.java
│                   └── CharacterType.java
├── out/
└── README.md
```

## Persyaratan

- Java Development Kit (JDK).
- Visual Studio Code (opsional untuk mengedit dan menjalankan kode).

## Cara Menjalankan Program

Pastikan terminal berada di folder utama `CharacterManager`.

### 1. Kompilasi program

Jalankan perintah berikut di terminal PowerShell:

```powershell
javac -d out src\com\unpri\charactermanager\model\CharacterType.java src\com\unpri\charactermanager\model\Character.java src\Main.java
```

### 2. Jalankan program

Setelah proses kompilasi berhasil, jalankan:

```powershell
java -cp out Main
```

## Hasil Program

Program menampilkan tiga karakter awal, yaitu Arjuna, Merlin, dan Athena. Program kemudian menaikkan level Arjuna dan menampilkan perubahan HP serta attack. Pada bagian mini-challenge, program membuat karakter Aurora, mengatur mana menjadi 75, dan memeriksa status hidupnya menggunakan `isAlive()`.

Hasil yang diharapkan untuk pemeriksaan status hidup Aurora adalah:

```text
>> Apakah Aurora masih hidup? true
```

## Bukti Output Program

Screenshot terminal yang menampilkan hasil program, proses level up, nilai mana Aurora, dan hasil `isAlive()` disiapkan sebagai bukti pengerjaan tugas dan akan dikumpulkan secara terpisah.

## Identitas Mahasiswa

- Nama Lengkap: Triyani Vianny
- NIM: 253303621278
- Mata Kuliah: Java Visual SIH-6406

## Google Docs

Dokumen teori Java Visual TP3:

[https://docs.google.com/document/d/1dAGIkz2O9_-CEyK_-ONV9UVBErFjpvyR_64NC5E5m6I/edit?usp=sharing]
