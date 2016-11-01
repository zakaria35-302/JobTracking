package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import bd.edu.httpdaffodilvarsity.jobtrack.R;


public class ProfileViewActivity extends Activity {

    Button btnEmployeeProfileEdit;

    public ProfileViewActivity() {
        // Required empty public constructor
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_view);
        //GoToEditUser();

        btnEmployeeProfileEdit = (Button) findViewById(R.id.buttonEditPersonalProfile);
        btnEmployeeProfileEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileViewActivity.this, EditEmployeeAccount.class);
                ProfileViewActivity.this.startActivity(intent);
            }
        });
    }

    /*private void GoToEditUser() {
        Intent in = new Intent(ProfileViewActivity.this.getActivity(), EditEmployeeAccount.class);
        startActivity(in);
    }*/
/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_profile_view, container, false);
        btnEmployeeProfileEdit = (Button) rootView.findViewById(R.id.buttonEditPersonalProfile);
        btnEmployeeProfileEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileViewActivity.this.getActivity(), EditEmployeeAccount.class);
                ProfileViewActivity.this.startActivity(intent);
            }
        });
        //return inflater.inflate(R.layout.activity_profile_view, container, false);
        return rootView;

    }*/

    /*public  void  GoToEditUser(View v){
        Intent in = new Intent(ProfileViewActivity.this.getActivity(), EditEmployeeAccount.class);
        startActivity(in);
    }*/
}
/*
public class ProfileViewActivity extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_profile_view);
    }

    public static ProfileViewActivity newInstance(int position) {
        ProfileViewActivity myFragment = new ProfileViewActivity();
        Bundle args = new Bundle();
        args.putInt("position", position);
        myFragment.setArguments(args);
        return myFragment;
        //return ProfileViewActivity;
    }*/

    /*public static class MyFragment extends Fragment {
        private TextView textView;

        public static MyFragment getInstance(int position) {
            MyFragment myFragment = new MyFragment();
            Bundle args = new Bundle();
            args.putInt("position", position);
            myFragment.setArguments(args);
            return myFragment;*/
       // }

//}

