package ramble.sokol.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Level3 extends AppCompatActivity {
public static int sum3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button buttonNext3 = (Button) findViewById(R.id.buttonNext3);
        RadioButton radio3 = findViewById(R.id.radio3);



        buttonNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radio3.isChecked())
                {
                    sum3 += 1;
                }
                else
                {
                    sum3 += 0;
                }
                try{
                    Intent intent = new Intent(Level3.this, Finish.class);
                    startActivity(intent);
                    finish();
                }catch(Exception e) {

                }
            }
        });

        
    }
}