package com.katibu.misaumodelacademy;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class HomeFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        final CardView aboutUs, Publication, Forum, Contact, myMMA;
        aboutUs = view.findViewById(R.id.aboutUs);
        Publication = view.findViewById(R.id.publications);
        Forum = view.findViewById(R.id.forum);
        Contact = view.findViewById(R.id.contact);
        myMMA = view.findViewById(R.id.myMMA);


        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AboutActivity.class);
                startActivity(intent); }


        });

        Publication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), PdfActivity.class);
                startActivity(intent);

            }
        });

        Forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ForumActivity.class);
                startActivity(intent);

            }
        });

        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), ContactActivity.class);
                startActivity(intent);

            }
        });

        myMMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), MymmaActivity.class);
                startActivity(intent);

            }
        });


        return view;
    }

}