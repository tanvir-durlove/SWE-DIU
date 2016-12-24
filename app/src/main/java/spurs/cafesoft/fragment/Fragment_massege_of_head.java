package spurs.cafesoft.fragment;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 11/16/15.
 */
public class Fragment_massege_of_head extends Fragment {

    ImageView headpic;
    RoundImage roundedImage2;
    ImageButton fb,twtr,lnkdin;
    TextView hdmsg;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_head_msg, container, false);

        headpic= (ImageView) rootview.findViewById(R.id.headspeech);
        fb= (ImageButton) rootview.findViewById(R.id.headfacebook);
        twtr=(ImageButton) rootview.findViewById(R.id.headtwitter);
        lnkdin=(ImageButton) rootview.findViewById(R.id.headlinkedin);
        hdmsg=(TextView)rootview.findViewById(R.id.headmsg);


        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.touhidbhuiyan);
        roundedImage2 = new RoundImage(bm);
        headpic.setImageDrawable(roundedImage2);

        Typeface face= Typeface.createFromAsset(getActivity().getAssets(), "font/DejaVuSans.ttf");
        hdmsg.setTypeface(face);

        fb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new AlertDialog.Builder(getActivity())
                        .setTitle("You're going to visit Facebook")
                        .setMessage("You're going to use internet.")
                        .setNegativeButton(android.R.string.no, null)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/touhid.bhuiyan?fref=ts"));
                                startActivity(in);
                            }
                        }).create().show();
            }
        });
        twtr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new AlertDialog.Builder(getActivity())
                        .setTitle("You're going to visit Twitter")
                        .setMessage("You're going to use internet.")
                        .setNegativeButton(android.R.string.no, null)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/touhidbhuiyan"));
                                startActivity(in);
                            }
                        }).create().show();
            }
        });
        lnkdin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new AlertDialog.Builder(getActivity())
                        .setTitle("You're going to visit LinkedIn")
                        .setMessage("You're going to use internet.")
                        .setNegativeButton(android.R.string.no, null)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/profile/view?id=ADEAAADAQbgBV0R7ZgfXHDCxzO6rVF63i08RcLM&authType=NAME_SEARCH&authToken=QARo&locale=en_US&srchid=4361128641449931472175&srchindex=1&srchtotal=4&trk=vsrp_people_res_name&trkInfo=VSRPsearchId%3A4361128641449931472175%2CVSRPtargetId%3A12599736%2CVSRPcmpt%3Aprimary%2CVSRPnm%3Atrue%2CauthType%3ANAME_SEARCH"));
                                startActivity(in);
                            }
                        }).create().show();
            }
        });

        return rootview;
    }
}


