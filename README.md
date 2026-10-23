
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

Berikut adalah bukti bahwa program Character Manager berhasil dijalankan.
![Output Character Manager](screenshots/Screenshot%202026-10-23%20221944.png)

## Identitas Mahasiswa

- Nama Lengkap: Triyani Vianny
- NIM: 253303621278
- Mata Kuliah: Java Visual SIH-6406

## Google Docs

Dokumen teori Java Visual TP3:

[https://docs.google.com/document/d/1dAGIkz2O9_-CEyK_-ONV9UVBErFjpvyR_64NC5E5m6I/edit?usp=sharing]

---

# TP5 — Character Manager Sprint #2

## Fitur TP5

- `Character.equals()` membandingkan nama karakter secara case-sensitive; `hashCode()` juga mengikuti nama.
- `CharacterManager.addCharacter()` menolak nama duplikat.
- `findByName()`, `removeCharacter()`, `getTotalCharacters()`, dan `getAllCharacters()` mengelola koleksi karakter.
- `getAllCharacters()` mengembalikan defensive copy (`new ArrayList<>(characterList)`), bukan daftar internal.
- `getAverageLevel()` mengembalikan `0.0` jika daftar kosong.
- `findByType(CharacterType type)` mengembalikan daftar baru karakter sesuai tipe.
- Fitur analitik mandiri `countByType(CharacterType type)` menghitung jumlah karakter berdasarkan tipe tanpa membuka daftar internal.
- `Character.totalCharacterCreated` adalah counter `static` yang dibagikan seluruh object Character.

## Rasional Fitur Mandiri: `countByType()`

Fitur `countByType()` membantu pengguna memperoleh ringkasan jumlah karakter untuk satu tipe, misalnya berapa karakter `WARRIOR` yang terdaftar. Method ini melakukan iterasi pada daftar internal dan hanya mengembalikan angka. Dengan demikian, pemanggil tidak memperoleh akses untuk mengubah `characterList`, sehingga Encapsulation tetap terjaga. Method ini dilengkapi Javadoc di `CharacterManager.java`.

## Cara Menjalankan TP5 (PowerShell)

Jalankan perintah berikut dari folder utama `CharacterManager`:

```powershell
javac -d out src\com\unpri\charactermanager\model\CharacterType.java src\com\unpri\charactermanager\model\Character.java src\com\unpri\charactermanager\model\CharacterManager.java src\Main.java
java -cp out Main
```

## Checklist Bukti Screenshot TP5

Screenshot 1 - Bukti Program TP5:

![Bukti Program TP5](screenshots/Screenshot%202026-10-24%20021648.png)

Screenshot 2 - Bukti Pengujian TP5:

![Bukti Pengujian TP5](screenshots/Screenshot%202026-10-24%20021730.png)


1. Nama duplikat `Arjuna` ditolak dan total karakter tetap 3.
2. Hasil rata-rata level dan pencarian berdasarkan tipe.
3. Eksperimen reference: level berubah menjadi 99 dan `asli == alias` bernilai `true`.
4. Defensive copy: total manager asli tetap 2, sedangkan ukuran salinan menjadi 3.
5. Uji daftar kosong yang menghasilkan rata-rata `0.0`.

Simpan screenshot di folder `screenshots/`, lalu ganti daftar ini dengan gambar yang benar-benar kamu ambil setelah menjalankan program di komputermu.

## Google Docs TP5

[Dokumen Analisis TP5](https://docs.google.com/document/d/1FD08w44BXL_JIl6FOT5UnjX6Tw4e-4wPLTNIua4mxMQ/edit?usp=sharing)