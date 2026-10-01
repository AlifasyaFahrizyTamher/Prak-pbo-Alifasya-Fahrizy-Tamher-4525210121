package com.univ;

public class Main {
    public static void main(String[] args) {

        // Objek kedua: David
        Mahasiswa alif = new Mahasiswa(
            "4524210121",
            "Alif",
            "tamher",
            "12 januari 2007",
            "Jl. Kalisari",
            "Teknik Informatika",
            19
        );

        // Tampilkan info
          alif.displayInfo();

        // Panggil method belajar dan ujian
        alif.ujian();
    }
}
