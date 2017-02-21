package nyc.c4q.maxrosado.hackathonapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by queenabergen on 2/21/17.
 */
public class CreateGameActivity3 extends Activity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creategamepage3);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        button = (Button) findViewById(R.id.continuebtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateGameActivity4.class);
                startActivity(intent);
            }
        });

    }
}
