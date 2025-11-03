🎯 Fungsi Program
Program ini digunakan untuk menghitung total biaya pengiriman paket berdasarkan tiga faktor utama:
Berat paket (kg)
Jarak tempuh pengiriman (km)
Volume paket (cm³) — hasil dari panjang × lebar × tinggi

⚙️ Cara Kerja Program

Input Data
Program meminta pengguna untuk memasukkan:
Berat paket
Jarak tempuh
Panjang, lebar, dan tinggi paket
Menghitung Volume
double volume = panjang * lebar * tinggi;
Volume dihitung dalam satuan cm³.

Menentukan Biaya per Kg

if (jarak <= 10) {
    biayaPerKg = 4250;
} else {
    biayaPerKg = 6000;
}


Jika jarak ≤ 10 km → Rp 4.250/kg
Jika jarak > 10 km → Rp 6.000/kg

Menentukan Biaya Tambahan Volume

if (volume > 100) {
    biayaTambahan = 50000;
}

Jika volume lebih dari 100 cm³ → dikenakan biaya tambahan Rp 50.000

Menghitung Total Biaya
totalBiaya = (berat * biayaPerKg) + biayaTambahan;
Total biaya = biaya berdasarkan berat + biaya tambahan volume

Menampilkan Hasil
Program menampilkan rincian lengkap:
Berat paket
Jarak tempuh
Volume paket
Biaya per kg
Biaya tambahan
Total biaya kirim

<img width="1920" height="1080" alt="Screenshot 2025-11-03 090048" src="https://github.com/user-attachments/assets/cc70e07f-db2d-4889-b30e-20d2a69ca660" />
