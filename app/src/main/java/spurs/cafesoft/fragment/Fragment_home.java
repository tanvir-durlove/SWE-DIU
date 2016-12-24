package spurs.cafesoft.fragment;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 11/12/15.
 */
public class Fragment_home extends Fragment {
    Button homeabout,homewebsite;
    ImageButton fb,twtr,lnkdin;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_main, container, false);
        homewebsite =(Button)rootview.findViewById(R.id.homewebsite);
        homeabout=(Button)rootview.findViewById(R.id.homeabout);

        fb= (ImageButton) rootview.findViewById(R.id.homefacebook);
        twtr=(ImageButton) rootview.findViewById(R.id.imagetwitter);
        lnkdin=(ImageButton) rootview.findViewById(R.id.homeother);

        homewebsite.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new AlertDialog.Builder(getActivity())
                        .setTitle("VISIT WEBSITE???")
                        .setMessage("You're going to use internet.")
                        .setNegativeButton(android.R.string.no, null)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://daffodilvarsity.edu.bd"));
                                startActivity(in);
                            }
                        }).create().show();
            }
        });

        homeabout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                Fragment_about frag = new Fragment_about();
                ft.replace(R.id.frame_layout, frag);
                ft.commit();
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://daffodilvarsity.edu.bd"));
                //startActivity(in);

                new AlertDialog.Builder(getActivity())
                        .setTitle("You're going to visit Facebook")
                        .setMessage("You're going to use internet.")
                        .setNegativeButton(android.R.string.no, null)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/daffodilvarsity.edu.bd/?fref=ts"));
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
                                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/daffodilvarsity"));
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
                                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/edu/school?id=10304&trk=tyah&trkInfo=clickedVertical%3Aschool%2CclickedEntityId%3A10304%2Cidx%3A3-1-5%2CtarId%3A1449931146618%2Ctas%3ADaffodil%20Interna"));
                                startActivity(in);
                            }
                        }).create().show();
            }
        });

        return rootview;
    }
}
