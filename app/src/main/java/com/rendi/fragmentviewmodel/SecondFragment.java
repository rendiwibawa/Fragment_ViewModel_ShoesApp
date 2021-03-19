package com.rendi.fragmentviewmodel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
//import com.fragmentcommunicationexample.R;
public class SecondFragment extends Fragment {
    private PageViewModel pageViewModel;

    private TextView txtName;
    private TextView txtAlamat;
    private TextView txtTlp;
    private TextView txtSize;
    //public ≈() {
        // Required empty public constructor
  //  }
    /**
     * Use this factory method to create a new instance of this fragment.
     *
     * @return A new instance of fragment SecondFragment.
     */
    public static SecondFragment newInstance() {
        return new SecondFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialise ViewModel here
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.second_fragment, container, false);
    }
    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtAlamat = view.findViewById(R.id.textViewAlamat);
        txtTlp = view.findViewById(R.id.textViewTlp);
        txtSize = view.findViewById(R.id.textViewSize);

        pageViewModel.getName().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtName.setText(s);
            }
        });
        pageViewModel.getAlamat().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtAlamat.setText(s);
            }
        });
        pageViewModel.getTlp().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtTlp.setText(s);

            }
        });
        pageViewModel.getSize().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtSize.setText(s);

            }
        });
    }
}