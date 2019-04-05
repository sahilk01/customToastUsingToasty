package com.elgigs.customgradle;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showToast(View view) {

        switch (view.getId()) {
            case R.id.error_button:
                Toasty.error(this, "Bhai Error Agya", Toast.LENGTH_SHORT).show();
                break;

            case R.id.success_button:
                Toasty.success(this, "Bhai kaam hogya", Toasty.LENGTH_SHORT).show();
                break;
            case R.id.info_button:
                Toasty.info(this, "Bhai ye toasty h", Toast.LENGTH_SHORT).show();
                break;

            case R.id.warning_button:
                Toasty.warning(this, "oops", Toasty.LENGTH_SHORT).show();
                break;

            case R.id.image_button:
                Toasty.normal(this, "this is image button", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this, R.drawable.ic_child)).show();
                break;
        }

    }
}
