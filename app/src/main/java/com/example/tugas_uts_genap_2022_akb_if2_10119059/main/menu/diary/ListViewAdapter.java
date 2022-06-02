package com.example.tugas_uts_genap_2022_akb_if2_10119059.main.menu.diary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.tugas_uts_genap_2022_akb_if2_10119059.R;
import com.example.tugas_uts_genap_2022_akb_if2_10119059.createDiary.CreateDiaryActivity;
import com.example.tugas_uts_genap_2022_akb_if2_10119059.editDiary.EditDiaryActivity;
import com.example.tugas_uts_genap_2022_akb_if2_10119059.model.Diary;

import java.util.List;


public class ListViewAdapter extends BaseAdapter {
    private List<Diary> listDiary;
    private Context context;
    private TextView judul, date, month, year, kategori, isi;
    private Button editButton, deleteButton;

    public ListViewAdapter(List<Diary> listDiary, Context context) {
        this.listDiary = listDiary;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listDiary.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.diary_card,null);

        judul = view.findViewById(R.id.cardJudul);
        date = view.findViewById(R.id.cardDate);
        month = view.findViewById(R.id.cardMonth);
        year = view.findViewById(R.id.cardYear);
        kategori = view.findViewById(R.id.cardKategori);
        isi = view.findViewById(R.id.cardIsi);
/*      editButton = view.findViewById(R.id.editButton);
        deleteButton = view.findViewById(R.id.deleteButton);*/

        judul.setText(listDiary.get(position).getJudul());
        date.setText(listDiary.get(position).getDate());
        month.setText(listDiary.get(position).getMonth());
        kategori.setText(listDiary.get(position).getKategori());
        isi.setText(listDiary.get(position).getIsi());

        /*editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EditDiaryActivity.class);
                intent.putExtra("Id", listDiary.get(position).getId());
                intent.putExtra("Judul", listDiary.get(position).getJudul());
                intent.putExtra("Date", listDiary.get(position).getDate());
*//*                intent.putExtra("Month", listDiary.get(position).getMonth());
                intent.putExtra("Year", listDiary.get(position).getYear());*//*
                intent.putExtra("Kategori", listDiary.get(position).getKategori());
                intent.putExtra("Isi", listDiary.get(position).getIsi());

                context.startActivity(intent);
            }
        });*/

/*        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DeleteDiaryActivity.class);
                intent.putExtra("Id", listDiary.get(position).getId());

                context.startActivity(intent);
            }
        });*/

        return view;
    }
}
