package com.a4.egaapps.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.a4.egaapps.R;
import com.a4.egaapps.fragment.sinopsis.SinopsisAction1;
import com.a4.egaapps.fragment.sinopsis.SinopsisAction2;
import com.a4.egaapps.fragment.sinopsis.SinopsisAction3;
import com.a4.egaapps.fragment.sinopsis.SinopsisAction4;

public class Tab2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2, container, false);

        ImageView imageView = view.findViewById(R.id.action1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAction1.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = view.findViewById(R.id.action2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAction2.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = view.findViewById(R.id.action3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAction3.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 = view.findViewById(R.id.action4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAction4.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void OnToggleClicked() {
    }
}