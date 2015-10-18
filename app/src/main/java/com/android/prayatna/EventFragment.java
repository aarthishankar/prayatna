package com.android.prayatna;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by root on 26/7/15.
 */
public class EventFragment extends Fragment implements View.OnClickListener{

    View rootView;


    public EventFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        rootView = inflater.inflate(R.layout.eventsfragment, container, false);




        ImageView event1=(ImageView)rootView.findViewById(R.id.event01);
        ImageView event2=(ImageView)rootView.findViewById(R.id.event02);
        ImageView event3=(ImageView)rootView.findViewById(R.id.event03);
        ImageView event4=(ImageView)rootView.findViewById(R.id.event04);
        ImageView event5=(ImageView)rootView.findViewById(R.id.event05);
        ImageView event6=(ImageView)rootView.findViewById(R.id.event06);
        ImageView event7=(ImageView)rootView.findViewById(R.id.event07);
        ImageView event8=(ImageView)rootView.findViewById(R.id.event08);
        ImageView event9=(ImageView)rootView.findViewById(R.id.event09);
        ImageView event10=(ImageView)rootView.findViewById(R.id.event10);
        ImageView event11=(ImageView)rootView.findViewById(R.id.event11);
        ImageView event12=(ImageView)rootView.findViewById(R.id.event12);
        ImageView event13=(ImageView)rootView.findViewById(R.id.event13);
        ImageView event14=(ImageView)rootView.findViewById(R.id.event14);
        ImageView event15=(ImageView)rootView.findViewById(R.id.event15);
        ImageView event16=(ImageView)rootView.findViewById(R.id.event16);
        ImageView event17=(ImageView)rootView.findViewById(R.id.event17);
        ImageView event18=(ImageView)rootView.findViewById(R.id.event18);
        ImageView event21=(ImageView)rootView.findViewById(R.id.event21);
        ImageView event22=(ImageView)rootView.findViewById(R.id.event22);
        ImageView event23=(ImageView)rootView.findViewById(R.id.event23);
        ImageView event24=(ImageView)rootView.findViewById(R.id.event24);
        ImageView event25=(ImageView)rootView.findViewById(R.id.event25);

        TextView tvt1=(TextView)rootView.findViewById(R.id.tv01);
        TextView tvt2=(TextView)rootView.findViewById(R.id.tv02);
        TextView tvt3=(TextView)rootView.findViewById(R.id.tv03);
        TextView tvt4=(TextView)rootView.findViewById(R.id.tv04);
        TextView tvt5=(TextView)rootView.findViewById(R.id.tv05);
        TextView tvt6=(TextView)rootView.findViewById(R.id.tv06);
        TextView tvt7=(TextView)rootView.findViewById(R.id.tv07);
        TextView tvt8=(TextView)rootView.findViewById(R.id.tv08);
        TextView tvt9=(TextView)rootView.findViewById(R.id.tv09);
        TextView tvt10=(TextView)rootView.findViewById(R.id.tv10);
        TextView tvt11=(TextView)rootView.findViewById(R.id.tv11);
        TextView tvt12=(TextView)rootView.findViewById(R.id.tv12);
        TextView tvt13=(TextView)rootView.findViewById(R.id.tv13);
        TextView tvt14=(TextView)rootView.findViewById(R.id.tv14);
        TextView tvt15=(TextView)rootView.findViewById(R.id.tv15);
        TextView tvt16=(TextView)rootView.findViewById(R.id.tv16);
        TextView tvt17=(TextView)rootView.findViewById(R.id.tv17);
        TextView tvt18=(TextView)rootView.findViewById(R.id.tv18);
        TextView tvt21=(TextView)rootView.findViewById(R.id.tv21);
        TextView tvt22=(TextView)rootView.findViewById(R.id.tv22);
        TextView tvt23=(TextView)rootView.findViewById(R.id.tv23);
        TextView tvt24=(TextView)rootView.findViewById(R.id.tv24);
        TextView tvt25=(TextView)rootView.findViewById(R.id.tv25);


        event1.setOnClickListener(this);
        event2.setOnClickListener(this);
        event3.setOnClickListener(this);
        event4.setOnClickListener(this);
        event5.setOnClickListener(this);
        event6.setOnClickListener(this);
        event7.setOnClickListener(this);
        event8.setOnClickListener(this);
        event9.setOnClickListener(this);
        event10.setOnClickListener(this);
        event11.setOnClickListener(this);
        event12.setOnClickListener(this);
        event13.setOnClickListener(this);
        event14.setOnClickListener(this);
        event15.setOnClickListener(this);
        event16.setOnClickListener(this);
        event17.setOnClickListener(this);
        event18.setOnClickListener(this);
        event21.setOnClickListener(this);
        event22.setOnClickListener(this);
        event23.setOnClickListener(this);
        event24.setOnClickListener(this);
        event25.setOnClickListener(this);

        tvt1.setOnClickListener(this);
        tvt2.setOnClickListener(this);
        tvt3.setOnClickListener(this);
        tvt4.setOnClickListener(this);
        tvt5.setOnClickListener(this);
        tvt6.setOnClickListener(this);
        tvt7.setOnClickListener(this);
        tvt8.setOnClickListener(this);
        tvt9.setOnClickListener(this);
        tvt10.setOnClickListener(this);
        tvt11.setOnClickListener(this);
        tvt12.setOnClickListener(this);
        tvt13.setOnClickListener(this);
        tvt14.setOnClickListener(this);
        tvt15.setOnClickListener(this);
        tvt16.setOnClickListener(this);
        tvt17.setOnClickListener(this);
        tvt18.setOnClickListener(this);
        tvt21.setOnClickListener(this);
        tvt22.setOnClickListener(this);
        tvt23.setOnClickListener(this);
        tvt24.setOnClickListener(this);
        tvt25.setOnClickListener(this);





        return rootView;
    }

    @Override
    public void onClick(View v) {
        String temp=getResources().getResourceName(v.getId());
        String fin="" + temp.charAt(temp.length()-2)+temp.charAt(temp.length()-1);
        Log.e("evemt id",fin);
        Intent i = new Intent(rootView.getContext(), EventDescription.class);
        i.putExtra("event_id",fin);
        startActivity(i);

    }


}
