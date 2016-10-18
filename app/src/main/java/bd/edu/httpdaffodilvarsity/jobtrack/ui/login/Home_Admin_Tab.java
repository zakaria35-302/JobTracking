package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.TextView;

import bd.edu.httpdaffodilvarsity.jobtrack.R;


public class Home_Admin_Tab extends android.support.v4.app.Fragment {
    TextView tvEmployeeDepartment;
    TextView tvEmployeeDesignation;
    TextView tvEmployeeJobMigration;
    TextView tvEmployeeTaskMigration;
    TextView tvEmployeeSuperior;

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
        View rootView = inflater.inflate(R.layout.activity_home__admin__tab, container, false);

        tvEmployeeDepartment = (TextView) rootView.findViewById(R.id.textViewAdminSetDepartment);
        tvEmployeeDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Admin_Tab.this.getActivity(), SetDepartment.class);
                Home_Admin_Tab.this.startActivity(intent);
            }
        });

        tvEmployeeDesignation = (TextView) rootView.findViewById(R.id.textViewAdminSetDesignation);
        tvEmployeeDesignation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Admin_Tab.this.getActivity(), SetDesignation.class);
                Home_Admin_Tab.this.startActivity(intent);
            }
        });

        tvEmployeeJobMigration = (TextView) rootView.findViewById(R.id.textViewAdminJobMigration);
        tvEmployeeJobMigration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Admin_Tab.this.getActivity(), JobMigration.class);
                Home_Admin_Tab.this.startActivity(intent);
            }
        });

        tvEmployeeTaskMigration = (TextView) rootView.findViewById(R.id.textViewAdminTaskMigration);
        tvEmployeeTaskMigration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Admin_Tab.this.getActivity(), TaskMigration.class);
                Home_Admin_Tab.this.startActivity(intent);
            }
        });

        tvEmployeeSuperior = (TextView) rootView.findViewById(R.id.textViewAdminSetSuparior);
        tvEmployeeSuperior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_Admin_Tab.this.getActivity(), SuperiorSettingActivity.class);
                Home_Admin_Tab.this.startActivity(intent);
            }
        });
        return rootView;

        //return inflater.inflate(R.layout.activity_home__admin__tab, container, false);
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
