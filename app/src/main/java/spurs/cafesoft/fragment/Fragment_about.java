package spurs.cafesoft.fragment;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 11/16/15.
 */
public class Fragment_about extends Fragment {
    Button fb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_about, container, false);

        fb=(Button)rootview.findViewById(R.id.devfb);

        fb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new AlertDialog.Builder(getActivity())
                        .setTitle("Like us Facebook")
                        .setMessage("Visit our page and like us.")
                        .setNegativeButton(android.R.string.no, null)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface arg0, int arg1) {
                                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cafesoftbd/?ref=hl"));
                                startActivity(in);
                            }
                        }).create().show();
            }
        });
        return rootview;
    }
}
