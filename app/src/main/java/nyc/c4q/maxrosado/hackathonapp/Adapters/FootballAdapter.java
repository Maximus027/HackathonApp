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

    
    String[] bouroughNames = {"Manhattan", "Queens", "Bronx"};
    String[] times = {"12:30 PM", "9:30AM", "1:30PM"};
    String[] dates = {"Thu Feb 28th ", "Friday November 3rd", "Tuesday July 8th"};
    int[] sportsCons = {R.drawable.footballicon, R.drawable.footballicon, R.drawable.footballicon};
    int[] peopleIcons = {R.drawable.usericon, R.drawable.usericon, R.drawable.usericon};
    int[] userImageList = {R.drawable.user5, R.drawable.user6, R.drawable.user7, R.drawable.user8};
    private ImageView userImage;
    private ImageView sportsIcon;
    private ImageView oneperson;
    private ImageView twoperson;
    private ImageView threeperson;
    private ImageView fourperson;
    private ImageView additionalTeam;
    private TextView cityNames;
    private TextView dateOfGame;
    private TextView timeofGame;
    private Button button;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
            timeofGame = (TextView) itemView.findViewById(R.id.timeView);
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
        timeofGame.setText(times[position]);
        userImage.setImageResource(userImageList[position]);
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
