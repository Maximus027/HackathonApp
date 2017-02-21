package nyc.c4q.maxrosado.hackathonapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class CreateGameActivity4 extends AppCompatActivity {
    ImageView imageView2;
    TextView progressView;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creategamepage4);
        imageView2 = (ImageView) findViewById(R.id.header);
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
