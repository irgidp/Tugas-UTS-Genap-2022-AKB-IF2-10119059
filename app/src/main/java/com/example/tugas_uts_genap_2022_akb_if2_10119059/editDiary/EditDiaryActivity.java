package com.example.tugas_uts_genap_2022_akb_if2_10119059.editDiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tugas_uts_genap_2022_akb_if2_10119059.R;
import com.example.tugas_uts_genap_2022_akb_if2_10119059.database.SQLite;
import com.example.tugas_uts_genap_2022_akb_if2_10119059.main.MainActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class EditDiaryActivity extends AppCompatActivity {

    private EditText judulEditText, kategoriEditText, isiEditText;
    private Date date;
    private SimpleDateFormat dateFormat, monthFormat, yearFormat;
    private Button submitButton;
    private SQLite helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_diary);

        Bundle bundle = getIntent().getExtras();

        date = Calendar.getInstance().getTime();
        dateFormat = new SimpleDateFormat("dd", Locale.getDefault());
        monthFormat = new SimpleDateFormat("MMMM", Locale.getDefault());
        yearFormat = new SimpleDateFormat("yyyy", Locale.getDefault());

        submitButton = findViewById(R.id.submitButton);
        judulEditText = findViewById(R.id.judul);
        kategoriEditText = findViewById(R.id.kategori);
        isiEditText = findViewById(R.id.isi);

        judulEditText.setText(bundle.getString("Judul"));
        kategoriEditText.setText(bundle.getString("Kategori"));
        isiEditText.setText(bundle.getString("Isi"));

        helper = new SQLite(this);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = bundle.getString("Id");
                String judul = judulEditText.getText().toString();
                String kategori = kategoriEditText.getText().toString();
                String isi = isiEditText.getText().toString();
                String formattedDate = dateFormat.format(date);
                String formattedMonth = monthFormat.format(date);
                String formattedYear = yearFormat.format(date);

                if (TextUtils.isEmpty(judul)) {
                    judulEditText.setError("Data tidak boleh kosong");
                    judulEditText.requestFocus();
                } else if (TextUtils.isEmpty(kategori)) {
                    kategoriEditText.setError("Data tidak boleh kosong");
                    kategoriEditText.requestFocus();
                } else if (TextUtils.isEmpty(isi)) {
                    isiEditText.setError("Data tidak boleh kosong");
                    isiEditText.requestFocus();
                } else {
                    boolean isSuccess = helper.updateData(id, judul, kategori, isi, formattedDate, formattedMonth, formattedYear);

                    if (isSuccess) {
                        Toast.makeText(EditDiaryActivity.this, "Data has been updated", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(EditDiaryActivity.this, MainActivity.class));
                        finish();
                    } else {
                        Toast.makeText(EditDiaryActivity.this, "Data failed to update", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}