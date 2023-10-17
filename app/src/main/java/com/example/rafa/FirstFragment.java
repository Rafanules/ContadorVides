package com.example.rafa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.rafa.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    int vida1=25, vida2=25;
    int veneno1=0, veneno2=0;

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.f1.setOnClickListener(view1 -> {
            vida1++;
            binding.cont1.setText(""+vida1+"/"+veneno1);
        });

        binding.f2.setOnClickListener(view1 -> {
            vida1--;
            binding.cont1.setText(""+vida1+"/"+veneno1);
        });

        binding.button4.setOnClickListener(view1 -> {
            veneno1++;
            binding.cont1.setText(""+vida1+"/"+veneno1);
        });

        binding.button6.setOnClickListener(view1 -> {
            veneno1--;
            binding.cont1.setText(""+vida1+"/"+veneno1);
        });

        binding.f3.setOnClickListener(view1 -> {
            vida2++;
            binding.textView4.setText(""+vida2+"/"+veneno2);
        });

        binding.imageView3.setOnClickListener(view1 -> {
            vida2--;
            binding.textView4.setText(""+vida2+"/"+veneno2);
        });

        binding.button2.setOnClickListener(view1 -> {
            veneno2++;
            binding.textView4.setText(""+vida2+"/"+veneno2);
        });

        binding.button3.setOnClickListener(view1 -> {
            veneno2--;
            binding.textView4.setText(""+vida2+"/"+veneno2);
        });

        binding.imageView4.setOnClickListener(view1 -> {
            vida1++;
            vida2--;
            binding.cont1.setText(""+vida1+"/"+veneno1);
            binding.textView4.setText(""+vida2+"/"+veneno2);
        });

        binding.imageView5.setOnClickListener(view1 -> {
            vida2++;
            vida1--;
            binding.textView4.setText(""+vida2+"/"+veneno2);
            binding.cont1.setText(""+vida1+"/"+veneno1);
        });

        binding.button.setOnClickListener(view1 -> {
            vida1=25;
            veneno1=0;
            vida2=25;
            veneno2=0;

            binding.cont1.setText(""+vida1+"/"+veneno1);
            binding.textView4.setText(""+vida2+"/"+veneno2);

        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}