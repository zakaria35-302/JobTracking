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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_account);

        spinnerEmployeeGender = (Spinner) findViewById(R.id.spinner_employee_gender);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.employee_gender, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // Apply the adapter to the spinner
        spinnerEmployeeGender.setAdapter(adapter);
    }

    public  void  GoToLoginActivity(View v){
        Intent in = new Intent(CreateUserAccount.this, LoginActivity.class);
        startActivity(in);
    }
}
