package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

    public class HomeSettingTab extends android.support.v4.app.Fragment {

    public HomeSettingTab() {
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
        return inflater.inflate(R.layout.activity_home_setting_tab, container, false);
    }

}

/*public class HomeSettingTab extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_setting_tab);
    }

    public static Fragment newInstance() {

        return null;
    }
}*/
