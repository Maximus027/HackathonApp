package nyc.c4q.maxrosado.hackathonapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import nyc.c4q.maxrosado.hackathonapp.sportchoose.sportChooser;

public class CreateGameActivity4 extends AppCompatActivity {
    ImageView imageView2;
    TextView progressView;
    SeekBar seekBar;
    Button createGame;
    Button getImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creategamepage4);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        imageView2 = (ImageView) findViewById(R.id.header);
        getImage = (Button) findViewById(R.id.addImage);
        getImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 0);
            }
        });

        createGame = (Button) findViewById(R.id.createbtn);
        createGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Handball Game Created", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), sportChooser.class);
                startActivity(intent);
            }
        });
        progressView = (TextView) findViewById(R.id.progessBarText);
        seekBar = (SeekBar) findViewById(R.id.howmanyplayersSeek);
        seekBar.setMax(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressView.setText("You have : " + progress + " players.");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
