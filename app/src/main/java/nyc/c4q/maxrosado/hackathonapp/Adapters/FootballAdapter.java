package nyc.c4q.maxrosado.hackathonapp.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.maxrosado.hackathonapp.R;

/**
 * Created by queenabergen on 2/18/17.
 */

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.MyViewHolder> {

    String[] bouroughNames = {"Manhattan", "Bronx", "Brooklyn", "Queens", "Staten Island",
            "Manhattan", "Bronx", "Brooklyn", "Queens", "Staten Island"};
    String[] dates = {"Thu Jan 28th ", "Mon Feb 28th ", "Fri Jan 28th ", "Wed Jan 28th "};
    int[] sportsCons = {R.drawable.footballicon, R.drawable.footballicon, R.drawable.footballicon,
            R.drawable.footballicon, R.drawable.footballicon};
    int[] peopleIcons = {R.drawable.usericon, R.drawable.usericon, R.drawable.usericon, R.drawable.usericon,
            R.drawable.usericon, R.drawable.usericon, R.drawable.usericon, R.drawable.usericon,
            R.drawable.usericon, R.drawable.usericon, R.drawable.usericon};
    private ImageView userImage;
    private ImageView sportsIcon;
    private ImageView oneperson;
    private ImageView twoperson;
    private ImageView threeperson;
    private ImageView fourperson;
    private ImageView additionalTeam;
    private TextView cityNames;
    private TextView dateOfGame;
    private Button button;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
            userImage = (ImageView) itemView.findViewById(R.id.userImage);
            sportsIcon = (ImageView) itemView.findViewById(R.id.sportsIcon);
            oneperson = (ImageView) itemView.findViewById(R.id.onePerson);
            twoperson = (ImageView) itemView.findViewById(R.id.twoPerson);
            threeperson = (ImageView) itemView.findViewById(R.id.threePerson);
            fourperson = (ImageView) itemView.findViewById(R.id.fourPerson);
            additionalTeam = (ImageView) itemView.findViewById(R.id.fourPerson);
            cityNames = (TextView) itemView.findViewById(R.id.bouroughOfGame);
            dateOfGame = (TextView) itemView.findViewById(R.id.dateOfGame);
            button = (Button) itemView.findViewById(R.id.joingameBTN);

        }
    }

    @Override
    public FootballAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sportsholder, parent, false);
        return new FootballAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FootballAdapter.MyViewHolder holder, int position) {
        sportsIcon.setImageResource(sportsCons[position]);
        oneperson.setImageResource(peopleIcons[position]);
        twoperson.setImageResource(peopleIcons[position]);
        threeperson.setImageResource(peopleIcons[position]);
        cityNames.setText(bouroughNames[position]);
        dateOfGame.setText(dates[position]);
    }

    @Override
    public int getItemCount() {
        return bouroughNames.length;
    }
}
