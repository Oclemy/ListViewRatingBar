package com.tutorials.hp.listviewratingbar.mAdapterView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.iarcuschin.simpleratingbar.SimpleRatingBar;
import com.tutorials.hp.listviewratingbar.R;
import com.tutorials.hp.listviewratingbar.mData.Spaceship;

import java.util.ArrayList;

/**
 * Created by Oclemy for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our adapter class.
 - Derives from android.widget.BaseAdapter.
 - Here we: inflate our model xml layout to viewitems and recycle it, bind data to these viewitems.
 - The data we bind is passed to us via constructor.
 - Apart from the data being passed us, we are also passed a Context object that will help us getSystemService that we  need for
 our inflation of model layout.
 - Being that we derive from BaseAdapter, we override getCount() which returns total count of our data, getItem() which returns
 each data object,getItemId() which returns the object's id, and getView() to return us its view().
 */
public class CustomAdapter extends BaseAdapter {

    private ArrayList<Spaceship> spaceships;
    private Context c;

    public CustomAdapter(Context c,ArrayList<Spaceship> spaceships) {
        this.spaceships = spaceships;
        this.c = c;
    }
    @Override
    public int getCount() {
        return spaceships.size();
    }
    @Override
    public Object getItem(int i) {
        return spaceships.get(i);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    /*
    INFLATE XML LAYOUT TO VIEW
     */
    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view= LayoutInflater.from(c).inflate(R.layout.model,viewGroup,false);
        }

        TextView nameTxt= (TextView) view.findViewById(R.id.nameTxt);
        ImageView img= (ImageView) view.findViewById(R.id.spacecraftImage);
        SimpleRatingBar ratingBar= (SimpleRatingBar) view.findViewById(R.id.ratingBarID);

        final Spaceship s= (Spaceship) this.getItem(pos);

        nameTxt.setText(s.getName());
        ratingBar.setRating(s.getRating());
        img.setImageResource(s.getImage());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, s.getName()+ " Rating : "+String.valueOf(s.getRating()), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
