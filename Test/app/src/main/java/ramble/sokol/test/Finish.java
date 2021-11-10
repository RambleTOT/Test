package ramble.sokol.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Finish extends AppCompatActivity {

    private int sum3;
    private int sum2;
    private int sum1;
    private int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TextView textResult1 = findViewById(R.id.textResult1);
        TextView textResult2 = findViewById(R.id.textResult2);
        TextView textResult3 = findViewById(R.id.textResult3);
        TextView textResult4 = findViewById(R.id.textResult4);
        this.sum3=Level3.sum3;
        this.sum2=Level2.sum2;
        this.sum1=Level1.sum1;
        sum = sum1+sum2+sum3;
        textResult1.setText("Задание №1:\t"+ sum1 +"/1");
        textResult2.setText("Задание №2:\t"+ sum2 +"/1");
        textResult3.setText("Задание №3:\t"+ sum3 +"/1");
        textResult4.setText("Итого:\t"+ sum +"/3");

        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Finish.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });


    }
}