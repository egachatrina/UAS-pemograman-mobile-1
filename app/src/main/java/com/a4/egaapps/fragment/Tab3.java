package com.a4.egaapps.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.a4.egaapps.R;
import com.a4.egaapps.fragment.sinopsis.SinopsisAnime1;
import com.a4.egaapps.fragment.sinopsis.SinopsisDrama1;
import com.a4.egaapps.fragment.sinopsis.SinopsisDrama2;
import com.a4.egaapps.fragment.sinopsis.SinopsisDrama3;
import com.a4.egaapps.fragment.sinopsis.SinopsisDrama4;

public class Tab3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        ImageView imageView = view.findViewById(R.id.romance1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisDrama1.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = view.findViewById(R.id.romance2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisDrama2.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = view.findViewById(R.id.romance3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisDrama3.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 = view.findViewById(R.id.romance4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisDrama4.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void OnToggleClicked() {
    }
}