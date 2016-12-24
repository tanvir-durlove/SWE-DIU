package spurs.cafesoft.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 11/16/15.
 */
public class Fragment_teachers extends Fragment {


    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_teacher, container, false);

        mRecyclerView = (RecyclerView)rootview.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        //mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new CardAdapter();
        mRecyclerView.setAdapter(mAdapter);

        return rootview;

    }

}