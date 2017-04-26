package at.sw2017.trackster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        final Button button = (Button) findViewById(R.id.button_input);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                System.out.println("do i get here");

                Intent myIntent = new Intent(v.getContext(), SportActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
