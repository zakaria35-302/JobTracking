package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import bd.edu.httpdaffodilvarsity.jobtrack.JobManagement.JobManagement;
import bd.edu.httpdaffodilvarsity.jobtrack.R;


public class HomeTaskManagement extends android.support.v4.app.Fragment {

    Button btnEmployeeJobManagement;
    Button btnEmployeeTaskManagement;

    public HomeTaskManagement() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // taskManagement();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootViewEmployeeTaskManagement = inflater.inflate(R.layout.activity_home_task_management, container, false);
        btnEmployeeTaskManagement = (Button) rootViewEmployeeTaskManagement.findViewById(R.id.btnTaskManagement);
        btnEmployeeTaskManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeTaskManagement.this.getActivity(), TaskManagement.class);
                HomeTaskManagement.this.startActivity(intent);
            }
        });
        //return inflater.inflate(R.layout.activity_profile_view, container, false);
        //return rootViewEmployeeTaskManagement;
        //return inflater.inflate(R.layout.activity_home_task_management, container, false);


        //View rootViewEmployeeJobManagement = inflater.inflate(R.layout.activity_home_task_management, container, false);
        btnEmployeeJobManagement = (Button) rootViewEmployeeTaskManagement.findViewById(R.id.btnJobManagement);
        btnEmployeeJobManagement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeTaskManagement.this.getActivity(), JobManagement.class);
                HomeTaskManagement.this.startActivity(intent);
            }
        });
        //return inflater.inflate(R.layout.activity_profile_view, container, false);
        return rootViewEmployeeTaskManagement;
        //return inflater.inflate(R.layout.activity_home_task_management, container, false);


    }

    /*private void taskManagement() {
        Intent in = new Intent(HomeTaskManagement.this.getActivity(), EditEmployeeAccount.class);
        startActivity(in);
    }*/

}


/*
public class HomeTaskManagement extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_task_management);
    }
}*/
