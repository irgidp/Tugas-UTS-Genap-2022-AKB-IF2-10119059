package com.example.tugas_uts_genap_2022_akb_if2_10119059.base;

/*
        NIM : 10119059
        Nama : Irgi Dwiputra
        Kelas : IF-2/VI
        Tanggal : Selasa, 31 Mei 2022
        Membuat presenter dengan konsep MVP
*/

public interface Presenter <T extends View> {
    void onAttach(T view);
    void onDetach();
}
