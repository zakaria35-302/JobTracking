package bd.edu.httpdaffodilvarsity.jobtrack.home_tab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.ChangePassword;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.EditEmployeeAccount;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.ProfileViewActivity;

public class HomeProfileTab extends android.support.v4.app.Fragment {

    public HomeProfileTab() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home_profile_tab);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_home_profile_tab, container, false);
        /*btnEmployeeProfileEdit = (Button) rootView.findViewById(R.id.buttonEditPersonalProfile);
        btnEmployeeProfileEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeProfileTab.this.getActivity(), EditEmployeeAccount.class);
                HomeProfileTab.this.startActivity(intent);
            }
        });*/
        //return inflater.inflate(R.layout.activity_profile_view, container, false);
        TextView text_view_profile_view = (TextView) rootView.findViewById(R.id.textViewProfileViewActivity);
        text_view_profile_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeProfileTab.this.getActivity(), ProfileViewActivity.class);
                HomeProfileTab.this.startActivity(intent);
            }
        });

        TextView text_view_change_password = (TextView) rootView.findViewById(R.id.textViewChangePassword);
        text_view_change_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeProfileTab.this.getActivity(), ChangePassword.class);
                HomeProfileTab.this.startActivity(intent);
            }
        });
        return rootView;



    }
    public void goToProfileView(View view){
        Intent intent = new Intent(HomeProfileTab.this.getActivity(), ProfileViewActivity.class);
        startActivity(intent);
    }
}
