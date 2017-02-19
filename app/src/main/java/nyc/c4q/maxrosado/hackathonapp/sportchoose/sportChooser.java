package nyc.c4q.maxrosado.hackathonapp.sportchoose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import nyc.c4q.maxrosado.hackathonapp.HomeActivity;
import nyc.c4q.maxrosado.hackathonapp.R;

public class sportChooser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                if (position < 4) {
                    Intent intent = new Intent(sportChooser.this, HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(sportChooser.this, "" + position,
                            Toast.LENGTH_SHORT).show();
                }

                }
            });

    }

}
