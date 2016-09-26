package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import bd.edu.httpdaffodilvarsity.jobtrack.R;

public class CreateUserAccount extends Activity {

    Spinner spinnerEmployeeGender;
    Spinner spinnerEmployeeInstitute;
    Spinner spinnerEmployeeDepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_account);

        spinnerEmployeeGender = (Spinner) findViewById(R.id.spinner_employee_gender);
        spinnerEmployeeInstitute = (Spinner) findViewById(R.id.spinner_employee_institute);
        spinnerEmployeeDepartment = (Spinner) findViewById(R.id.spinner_employee_department);


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.employee_gender, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // Apply the adapter to the spinner
        spinnerEmployeeGender.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.employee_institute, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeInstitute.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.employee_department, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeDepartment.setAdapter(adapter3);
    }

    public  void  GoToLoginActivity(View v){
        Intent in = new Intent(CreateUserAccount.this, LoginActivity.class);
        startActivity(in);
    }
}
