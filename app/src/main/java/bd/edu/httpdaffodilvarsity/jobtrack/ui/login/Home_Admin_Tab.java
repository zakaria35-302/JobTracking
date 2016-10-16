package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import bd.edu.httpdaffodilvarsity.jobtrack.R;


public class Home_Admin_Tab extends android.support.v4.app.Fragment {

    public Home_Admin_Tab() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_home__admin__tab, container, false);
    }

}
/*
public class Home_Admin_Tab extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
        //setContentView(R.layout.activity_home__admin__tab);
    }

    public static Home_Admin_Tab newInstance() {
        Home_Admin_Tab fragment = new Home_Admin_Tab();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
        //return null;
    }
*/
//}
