package ramble.sokol.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Level1 extends AppCompatActivity{
public static int sum1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button buttonNext1 = (Button) findViewById(R.id.buttonNext1);
        TextView text1 = (TextView) findViewById(R.id.text1);
        EditText editText1 = (EditText) findViewById(R.id.editText1);

        buttonNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (editText1.getText().toString().replaceAll(" ", "").equalsIgnoreCase("Татуин")){
                        sum1 += 1;
                    }else{
                        sum1 += 0;
                    }
                try{
                    Intent intent = new Intent(Level1.this, Level2.class);
                    startActivity(intent);
                    finish();
                }catch(Exception e) {

                }
            }
        });
        
    }
}