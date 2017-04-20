package com.myapplicationdev.android.demoradiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
                int selectedBtnId = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(selectedBtnId);
                Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });









    }

}
