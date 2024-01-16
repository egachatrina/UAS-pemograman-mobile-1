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
import com.a4.egaapps.fragment.sinopsis.SinopsisAnime2;
import com.a4.egaapps.fragment.sinopsis.SinopsisAnime3;
import com.a4.egaapps.fragment.sinopsis.SinopsisAnime4;

public class Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        ImageView imageView = view.findViewById(R.id.anime1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAnime1.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = view.findViewById(R.id.anime2);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAnime2.class);
                startActivity(intent);

            }
        });

        ImageView imageView2 = view.findViewById(R.id.anime3);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAnime3.class);
                startActivity(intent);

            }
        });

        ImageView imageView3 = view.findViewById(R.id.anime4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAnime4.class);
                startActivity(intent);

            }
        });

        return view;
    }
    private void OnToggleClicked() {
    }
}

