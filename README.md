# ⚡ Kalkulator Biaya Listrik Rumah (JavaFX)

Aplikasi desktop sederhana berbasis **JavaFX** dan **Maven** untuk menghitung estimasi biaya penggunaan listrik bulanan berdasarkan konsumsi daya perangkat elektronik rumah tangga (berdasarkan standar tarif PLN).

---

## 📸 Tangkapan Layar (Screenshot)

| Antarmuka Aplikasi |
| :---: |
| ![Kalkulator Biaya Listrik-Tampilan utama](<img width="461" height="493" alt="tampilan_utama jpg" src="https://github.com/user-attachments/assets/3b8a30bf-612f-4703-bfff-a2a677170b24" />)
| ![Kalkulator Biaya Listrik-Tampilan Input tidak lengkap](<img width="461" height="491" alt="output_tidak_ada_input jpg" src="https://github.com/user-attachments/assets/7cc263a4-0716-440e-8200-013cfb9268d8" />)
| ![Kalkulator Biaya Listrik-Tampilan akhir](<img width="461" height="490" alt="hasil jpg" src="https://github.com/user-attachments/assets/00906d5c-4967-400e-8a44-5bb1c2aeb987" />)

## ✨ Fitur Utama

- **Kalkulasi Biaya Otomatis:** Menghitung total konsumsi energi harian (kWh), total bulanan, serta estimasi tagihan listrik.
- **Validasi Input:** Menangani eror saat input kosong, karakter huruf pada kolom angka, atau batas pemakaian lebih dari 24 jam.
- **Antarmuka Modern:** Desain ringkas dan bersih menggunakan *styling* CSS kustom (`style.css`).
- **Arsitektur Rapi (MVC):** Pemisahan logika antara *Model*, *View* (FXML), dan *Controller*.

---

## 🛠️ Teknologi yang Digunakan

- **Bahasa Pemrograman:** Java 17 / 21
- **GUI Framework:** JavaFX 21
- **Build Tool:** Apache Maven
- **IDE:** NetBeans

---

## 📁 Struktur Proyek

```text
kalkulator_listrik/
├── src/
│   └── main/
│       ├── java/
│       │   └── kalkulator_listrik/
│       │       ├── App.java                   # Entry Point Aplikasi
│       │       ├── PrimaryController.java     # Logic Controller FXML
│       │       └── model/
│       │           └── Appliance.java         # Model Objek & Perhitungan
│       └── resources/
│           └── kalkulator_listrik/
│               ├── primary.fxml               # Tampilan UI (XML)
│               └── style.css                  # Custom Styling CSS
├── hasil                       # Gambar UI untuk README
├── pom.xml
└── README.md
