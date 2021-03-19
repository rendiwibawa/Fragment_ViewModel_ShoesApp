package com.rendi.fragmentviewmodel;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
//import com.fragmentcommunicationexample.R;
import com.google.android.material.textfield.TextInputEditText;
public class FirstFragment extends Fragment {
    private PageViewModel pageViewModel;
    public Button button;
    public FirstFragment() {
        // Required empty public constructor
    }
    /**
     * Create a new instance of this fragment
     * @return A new instance of fragment FirstFragment.
     */
    public static FirstFragment newInstance() {
        return new FirstFragment();
    }
    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // init ViewModel
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.first_fragment, container, false);

    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextInputEditText nameEditText = view.findViewById(R.id.textInputTextName);
        // Add Text Watcher on name input text
        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setName(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        TextInputEditText nameAlamatText = view.findViewById(R.id.textInputTextAlamat);
        // Add Text Watcher on name input text
        nameAlamatText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setAlamat(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        TextInputEditText nameEditTlp = view.findViewById(R.id.textInputTextTlp);
        // Add Text Watcher on name input text
        nameEditTlp.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setTlp(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });

        TextInputEditText nameEditSize = view.findViewById(R.id.textInputTextSize);
        // Add Text Watcher on name input text
        nameEditSize.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pageViewModel.setSize(charSequence.toString());
            }
            @Override public void afterTextChanged(Editable editable) {
            }
        });
    }
}