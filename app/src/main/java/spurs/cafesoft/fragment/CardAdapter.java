package spurs.cafesoft.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import spurs.cafesoft.swe_diu.R;

/**
 * Created by tanvirs on 11/28/15.
 */
public class CardAdapter extends  RecyclerView.Adapter<CardAdapter.ViewHolder> {

        List<Teachers> mItems;

        public CardAdapter() {
            super();
            mItems = new ArrayList<Teachers>();

            Teachers tcr = new Teachers();

            tcr.setName("\n" + "Dr. S.M. Mahbub Ul Haque Majumder");
            tcr.setDes("\n" +
                    "Designation : dean\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : deanfsit@daffodilvarsity.edu.bd");
            tcr.setThumbnail(R.drawable.dean);
            mItems.add(tcr);


            Teachers tcr1 = new Teachers();
            tcr1.setName("\n" + "Professor Dr. Yousuf Mahbubul Islam");
            tcr1.setDes("\n" +
                    "Designation : Vice Chancellor and Professor\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : ymislam@daffodilvarsity.edu.bd");
            tcr1.setThumbnail(R.drawable.yousufmahbub);
            mItems.add(tcr1);


            Teachers tcr2 = new Teachers();
            tcr2.setName("\n" + "Dr. Touhid Bhuiyan");
            tcr2.setDes("\n" +
                    "Designation : Associate Professor and Head\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : headswe@daffodilvarsity.edu.bd");
            tcr2.setThumbnail(R.drawable.touhidbhuiyan);
            mItems.add(tcr2);


            Teachers tcr3 = new Teachers();
            tcr3.setName("\n" + "Dr. Md. Asraf Ali");
            tcr3.setDes("\n" +
                    "Designation : Associate Professor\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : asraf.swe@diu.edu.bd");
            tcr3.setThumbnail(R.drawable.asrafali);
            mItems.add(tcr3);


            Teachers tcr4 = new Teachers();
            tcr4.setName("\n" + "Mr. Md. Khaled Sohel");
            tcr4.setDes("\n" +
                    "Designation : Assistant Professor\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : ----------------------------------------");
            tcr4.setThumbnail(R.drawable.khaledsohel);
            mItems.add(tcr4);


            Teachers tcr5 = new Teachers();
            tcr5.setName("\n" + "Shikha Anirban");
            tcr5.setDes("\n" +
                    "Designation : Assistant Professor\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : anirban@daffodilvarsity.edu.bd");
            tcr5.setThumbnail(R.drawable.sikhaanirban);
            mItems.add(tcr5);


            Teachers tcr6 = new Teachers();
            tcr6.setName("\n" + "Imran Mahmud");
            tcr6.setDes("\n" +
                    "Designation : Senior Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : imranmahmud@daffodilvarsity.edu.bd");
            tcr6.setThumbnail(R.drawable.imranmahmud);
            mItems.add(tcr6);


            Teachers tcr7 = new Teachers();
            tcr7.setName("\n" + "Nayeem Hasan");
            tcr7.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : nayeemhasan@daffodilvarsity.edu.bd");
            tcr7.setThumbnail(R.drawable.tonmoy);
            mItems.add(tcr7);


            Teachers tcr8 = new Teachers();
            tcr8.setName("\n" + "S.M. Hasan Mahmud");
            tcr8.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : hasan.swe@daffodilvarsity.edu.bd");
            tcr8.setThumbnail(R.drawable.hasanmahbub);
            mItems.add(tcr8);


            Teachers tcr9 = new Teachers();
            tcr9.setName("\n" + "Md. Fazla Elahe");
            tcr9.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : elahe.se@daffodilvarsity.edu.bd");
            tcr9.setThumbnail(R.drawable.fazleelahi);
            mItems.add(tcr9);


            Teachers tcr10 = new Teachers();
            tcr10.setName("\n" + "Md. Monjurul Islam Khan");
            tcr10.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : mikhan.swe@daffodilvarsity.edu.bd");
            tcr10.setThumbnail(R.drawable.manjurul);
            mItems.add(tcr10);


            Teachers tcr11 = new Teachers();
            tcr11.setName("\n" + "Kaushik Sarker");
            tcr11.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : mkaushik.swe@daffodilvarsity.edu.bd");
            tcr11.setThumbnail(R.drawable.kaushiksarkar);
            mItems.add(tcr11);


            Teachers tcr12 = new Teachers();
            tcr12.setName("\n" + "Tasnuba Jesmin");
            tcr12.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : jesmin.swe@daffodilvarsity.edu.bd.edu.bd");
            tcr12.setThumbnail(R.drawable.tasnubamesmin);
            mItems.add(tcr12);


            Teachers tcr13 = new Teachers();
            tcr13.setName("\n" + "Nazia Nishat");
            tcr13.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : nazia.cse@daffodilvarsity.edu.bd");
            tcr13.setThumbnail(R.drawable.nazianisat);
            mItems.add(tcr13);


            Teachers tcr14 = new Teachers();
            tcr14.setName("\n" + "Md. Alamgir Kabir");
            tcr14.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : alamgir.swe@diu.edu.bd");
            tcr14.setThumbnail(R.drawable.alamgirkabir);
            mItems.add(tcr14);


            Teachers tcr15 = new Teachers();
            tcr15.setName("\n" + "Mr. Iftekharul Alam Efat");
            tcr15.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : iftekhar.swe@diu.edu.bd");
            tcr15.setThumbnail(R.drawable.eftee);
            mItems.add(tcr15);


            Teachers tcr16 = new Teachers();
            tcr16.setName("\n" + "Ms. Rubaida Easmin");
            tcr16.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : rubaida.swe@diu.edu.bd");
            tcr16.setThumbnail(R.drawable.rubaida);
            mItems.add(tcr16);


            Teachers tcr17 = new Teachers();
            tcr17.setName("\n" + "Ms. Salma Sultana");
            tcr17.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : salma.swe@diu.edu.bd");
            tcr17.setThumbnail(R.drawable.salmasultana);
            mItems.add(tcr17);


            Teachers tcr18 = new Teachers();
            tcr18.setName("\n" + "Ms. Jannatun Nahar");
            tcr18.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : nahar.swe@diu.edu.bd");
            tcr18.setThumbnail(R.drawable.jannatunnahar);
            mItems.add(tcr18);


            Teachers tcr19 = new Teachers();
            tcr19.setName("\n" + "Ms. Tasnim Rahman");
            tcr19.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : tasnim.swe@diu.edu.bd");
            tcr19.setThumbnail(R.drawable.katha);
            mItems.add(tcr19);


            Teachers tcr20 = new Teachers();
            tcr20.setName("\n" + "Asif Khan Shakir");
            tcr20.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : asif.swe@diu.edu.bd");
            tcr20.setThumbnail(R.drawable.asifkhan);
            mItems.add(tcr20);


            Teachers tcr21 = new Teachers();
            tcr21.setName("\n" + "Afsana Begum");
            tcr21.setDes("\n" +
                    "Designation : Lecturer\n" +
                    "Department : Department of Software Engineering\n" +
                    "Email : ----------------------------------------");
            tcr21.setThumbnail(R.drawable.afsana);
            mItems.add(tcr21);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.recycler_view_card_item, viewGroup, false);
            ViewHolder viewHolder = new ViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            Teachers nature = mItems.get(i);
            viewHolder.tvNature.setText(nature.getName());
            viewHolder.tvDesNature.setText(nature.getDes());
            viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
        }

        @Override
        public int getItemCount() {
            return mItems.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder{

            public ImageView imgThumbnail;
            public TextView tvNature;
            public TextView tvDesNature;

            public ViewHolder(View itemView) {
                super(itemView);
                imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
                tvNature = (TextView)itemView.findViewById(R.id.tv_nature);
                tvDesNature = (TextView)itemView.findViewById(R.id.tv_des_nature);
            }
        }
    }