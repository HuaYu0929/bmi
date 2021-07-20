package tw.com.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText weight,height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        weight = findViewById(R.id.userWeight);
        height = findViewById(R.id.userHeight);


    }
    public void bmiClick(View view){
        float userWeight = Float.parseFloat(weight.getText().toString());
        float userHeight = Float.parseFloat(height.getText().toString());
        float bmi = userWeight / (userHeight / 100) * (userHeight / 100);

        result.setText("結果:" + bmi);
    }
}