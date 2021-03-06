package com.example.tugas_uts_genap_2022_akb_if2_10119059.main.menu.info;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

/*
        NIM : 10119059
        Nama : Irgi Dwiputra
        Kelas : IF-2/VI
        Tanggal : Rabu, 1 Juni 2022
        Membuat class InfoViewModel untuk membuat list fragment info
*/
public class InfoViewModel extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;

    public InfoViewModel(FragmentManager fm, List<Fragment> fragmentList ) {
        super(fm);

        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}