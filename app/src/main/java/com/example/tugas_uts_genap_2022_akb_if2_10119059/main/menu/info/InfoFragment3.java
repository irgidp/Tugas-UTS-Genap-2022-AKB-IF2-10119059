package com.example.tugas_uts_genap_2022_akb_if2_10119059.main.menu.info;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uts_genap_2022_akb_if2_10119059.R;

/*
        NIM : 10119059
        Nama : Irgi Dwiputra
        Kelas : IF-2/VI
        Tanggal : Rabu, 1 Juni 2022
        Membuat class InfoFragment1 untuk deklrasi info fragment halaman 1
*/
public class InfoFragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_info3, container, false);

        return root;
    }
}