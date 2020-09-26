package com.example.ravindraramdhanie_ceng319lab1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link aiactivity#newInstance} factory method to
 * create an instance of this fragment.
 */
public class aiactivity extends ListFragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public aiactivity() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment aiactivity.
     */
    // TODO: Rename and change types and number of parameters




        public static aiactivity newInstance(String param1, String param2) {
            aiactivity fragment = new aiactivity();
            Bundle args = new Bundle();
            args.putString(ARG_PARAM1, param1);
            args.putString(ARG_PARAM2, param2);
            fragment.setArguments(args);
            return fragment;
        }
    public class AiFragment extends aiactivity {
        //
        String[] aiActivity = new String[]
                {
                        "AIActivity",
                        "VRActivity"};
        //
        String[] vrActivity = new String[]
                {"Open source software stack",
                        "Weclome to AIActivity",
                        "Welcome to VRactivity"};

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            if (getArguments() != null) {
                mParam1 = getArguments().getString(ARG_PARAM1);
                mParam2 = getArguments().getString(ARG_PARAM2);


            }
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.ai_activity, container, false);
            //ArrayAdapter creates a view for each array item
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                    android.R.layout.simple_list_item_1, aiActivity);
            //bind the list view with array adapter
            setListAdapter(adapter);


            return view;
        }

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            vractivity fragment = (vractivity) getFragmentManager().findFragmentById(R.id.vrfragment1);
            fragment.display(aiActivity[position], "Welcome to : " + vrActivity[position]);
            getListView().setSelector(android.R.color.holo_blue_dark);
        }
    }
}