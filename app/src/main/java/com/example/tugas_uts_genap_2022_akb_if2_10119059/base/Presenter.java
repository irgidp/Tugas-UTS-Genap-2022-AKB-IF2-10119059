package com.example.tugas_uts_genap_2022_akb_if2_10119059.base;

public interface Presenter <T extends View> {
    void onAttach(T view);
    void onDetach();
}
