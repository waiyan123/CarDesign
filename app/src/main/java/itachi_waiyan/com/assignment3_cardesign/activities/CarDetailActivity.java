package itachi_waiyan.com.assignment3_cardesign.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import itachi_waiyan.com.assignment3_cardesign.R;

public class CarDetailActivity extends AppCompatActivity {

    ImageView imgCancel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_detail_layout);
        imgCancel = findViewById(R.id.img_cancel);
        imgCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
