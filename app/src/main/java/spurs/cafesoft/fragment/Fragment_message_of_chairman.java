package spurs.cafesoft.fragment;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 11/16/15.
 */
public class    Fragment_message_of_chairman extends Fragment {

    TextView msg;

    ImageView chairmanpic;
    RoundImage roundedImage1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_chairman_msg, container, false);

        chairmanpic = (ImageView) rootview.findViewById(R.id.chairmanspeech);
        msg = (TextView)rootview.findViewById(R.id.chairmanspeechdetail);

        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.saburkhan);
        roundedImage1 = new RoundImage(bm);
        chairmanpic.setImageDrawable(roundedImage1);

        Typeface face= Typeface.createFromAsset(getActivity().getAssets(), "font/DejaVuSans.ttf");
        msg.setTypeface(face);

        return rootview;
    }
}