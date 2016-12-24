package bd.edu.httpdaffodilvarsity.jobtrack.role;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bd.edu.httpdaffodilvarsity.jobtrack.Database.DatabaseHelper;
import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class EmployeeRole extends Activity {

    DatabaseHelper myDB;
    EditText editTextEmployeeRoleId, editTextEmployeeRole;
    Button buttonSaveEmployeeRole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_role);
        myDB = new  DatabaseHelper(this);

       // editTextEmployeeRoleId = (EditText) findViewById(R.id.editTextEmployeeRoleId);
        editTextEmployeeRole = (EditText) findViewById(R.id.editTextEmployeeRole);
        buttonSaveEmployeeRole = (Button) findViewById(R.id.buttonSaveEmployeeRole);

        addRole();
    }

    public void addRole(){
        buttonSaveEmployeeRole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDB.insertHRMRole(editTextEmployeeRole.getText().toString());
                if (isInserted == true)
                    Toast.makeText(EmployeeRole.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(EmployeeRole.this, "Data is not Inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }
/*btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDB.insertHRMDesignation( employeeDesignation.getText().toString());
               *//* boolean isInserted = myDB.insertHRMDesignation(employeeDesignationId.getText().toString(),
                        employeeDesignation.getText().toString(), employeeDesignationViewOrder.getText().toString(),
                        employeeDesignationCreatedBy.getText().toString(), employeeDesignationUpdateBy.getText().toString());*//*
                if (isInserted == true)
                    Toast.makeText(SetDesignation.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(SetDesignation.this, "Data is not Inserted", Toast.LENGTH_SHORT).show();
            }
        });*/
}
