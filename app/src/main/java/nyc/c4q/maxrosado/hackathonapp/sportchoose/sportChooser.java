package nyc.c4q.maxrosado.hackathonapp.sportchoose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import nyc.c4q.maxrosado.hackathonapp.Basketball;
import nyc.c4q.maxrosado.hackathonapp.Handbal;
import nyc.c4q.maxrosado.hackathonapp.R;
import nyc.c4q.maxrosado.hackathonapp.models.bike_models.BikeRental;

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
                switch(position){
                    case 0:
                        Intent goToBasketball = new Intent(getApplicationContext(), Basketball.class);
                        startActivity(goToBasketball);
                        break;
                    case 1:
                        Intent goToHandball = new Intent(getApplicationContext(), Handbal.class);
                        startActivity(goToHandball);
                        break;
                    case 2:
                        Intent goToSoccer = new Intent(getApplicationContext(), Soccer.class);
                        startActivity(goToSoccer);
                        break;
                    case 3:
                        Intent goToFootball = new Intent(getApplicationContext(), Basketball.class);
                        startActivity(goToFootball);
                        break;
                    case 4:
                        Intent goToBikes = new Intent(getApplicationContext(), BikeRental.class);
                        startActivity(goToBikes);
                        break;
                    case 5:
                        break;
                }

                }
            });

    }

}
