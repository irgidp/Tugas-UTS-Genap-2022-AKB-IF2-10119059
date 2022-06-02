package com.example.tugas_uts_genap_2022_akb_if2_10119059.main.menu.profil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tugas_uts_genap_2022_akb_if2_10119059.R;
import com.example.tugas_uts_genap_2022_akb_if2_10119059.databinding.FragmentDiaryBinding;

/*
        NIM : 10119059
        Nama : Irgi Dwiputra
        Kelas : IF-2/VI
        Tanggal : Rabu, 1 Juni 2022
        Membuat class ProfilFragment untuk deklrasi profil fragment
*/
public class ProfilFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profil, container, false);

        return root;
    }
}