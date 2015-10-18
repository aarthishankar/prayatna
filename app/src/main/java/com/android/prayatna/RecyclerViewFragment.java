package com.android.prayatna;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;

/**
 * Created by florentchampigny on 24/04/15.
 */
public class RecyclerViewFragment extends Fragment {

    private ObservableScrollView mScrollView;

    public static RecyclerViewFragment newInstance() {
        return new RecyclerViewFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_scroll2, container, false);

        TextView eventrules= (TextView)rootView.findViewById(R.id.event_rules);
        TextView eventsample= (TextView)rootView.findViewById(R.id.event_sample);
        Button register=(Button)rootView.findViewById(R.id.event_register2);
        eventsample.setText(EventDescription.event_array[4]);
        eventrules.setText(EventDescription.event_array[3]);
        if(EventDescription.paper){
            TextView temp= (TextView) rootView.findViewById(R.id.sample);
            temp.setText("Topics");
        }

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent i = new Intent(getActivity().getApplicationContext(), Register.class);
                    i.putExtra("tag","update");
                    startActivity(i);

            }
        });

        return rootView;


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mScrollView = (ObservableScrollView) view.findViewById(R.id.scrollView2);

        MaterialViewPagerHelper.registerScrollView(getActivity(), mScrollView, null);

    }
}
