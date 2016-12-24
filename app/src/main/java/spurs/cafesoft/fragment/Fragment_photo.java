package spurs.cafesoft.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 12/3/15.
 */
public class Fragment_photo extends Fragment {

    Integer[] imageIDs = {
            R.drawable.dept1,R.drawable.dept6,R.drawable.dept11,R.drawable.dept16,
            R.drawable.dept2,R.drawable.dept7,R.drawable.dept12,R.drawable.dept17,
            R.drawable.dept3,R.drawable.dept8,R.drawable.dept13,R.drawable.dept18,
            R.drawable.dept4,R.drawable.dept9,R.drawable.dept14,R.drawable.dept19,
            R.drawable.dept5,R.drawable.dept10,R.drawable.dept15,R.drawable.dept20,
            R.drawable.dept21,};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_photo, container, false);

        Gallery gallery = (Gallery) rootview.findViewById(R.id.deptphotogelary);
        gallery.setAdapter(new ImageAdapter(getActivity()));
//

        return rootview;
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        private int itemBackground;
        public ImageAdapter(Context c)
        {
            context = c;
        }
        // returns the number of images
        public int getCount() {
            return imageIDs.length;
        }
        // returns the ID of an item
        public Object getItem(int position) {
            return position;
        }
        // returns the ID of an item
        public long getItemId(int position) {
            return position;
        }
        // returns an ImageView view
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imageIDs[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setBackgroundResource(itemBackground);
            imageView.setLayoutParams(new Gallery.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT));
            return imageView;
        }
    }
}
