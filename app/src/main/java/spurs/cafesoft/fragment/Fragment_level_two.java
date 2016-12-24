package spurs.cafesoft.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 11/16/15.
 */
public class Fragment_level_two extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_level_two, container, false);
        return rootview;
    }
}
