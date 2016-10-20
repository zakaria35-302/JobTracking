package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.Calendar;
import bd.edu.httpdaffodilvarsity.jobtrack.R;


public class EditEmployeeAccount extends AppCompatActivity {

    //private DatePicker datePicker;
    //private Calendar calendar;
    //private TextView dateView;
    //private int year, month, day;

    EditText editTextDateofBirthDialog;
    //Button btn;
    int year_x,month_x,day_x;
    //static final int DIALOG_ID = 0;

    Spinner spinnerEmployeeGender;
    Spinner spinnerEmployeeInstitute;
    Spinner spinnerEmployeeDepartment;
    Spinner spinnerEmployeeMaritalStatus;
    Spinner spinnerEmployeeBloodGroup;
    Spinner spinnerEmployeeReligion;

    ArrayAdapter<CharSequence> empGenderAdapter,empInstituteAdapter,
            empDepartmentAdapter, empMaritelStatusAdapter,empBloodGroupAdapter,empReligionAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_employee_account);

        editTextDateofBirthDialog = (EditText) findViewById(R.id.edit_text_date_of_birth_edit);
        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);


       /* calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);*/
        showDate(year_x, month_x+1, day_x);

        //showDialogOnButtonClick();

        spinnerEmployeeGender = (Spinner) findViewById(R.id.spinner_employee_gender_edit);
        spinnerEmployeeInstitute = (Spinner) findViewById(R.id.spinner_employee_institute_edit);
        spinnerEmployeeDepartment = (Spinner) findViewById(R.id.spinner_employee_department_edit);
        spinnerEmployeeMaritalStatus = (Spinner) findViewById(R.id.spinner_employee_marital_status_edit);
        spinnerEmployeeBloodGroup = (Spinner) findViewById(R.id.spinner_employee_blood_group_edit);
        spinnerEmployeeReligion = (Spinner) findViewById(R.id.spinner_employee_religion_edit);

        // Create an ArrayAdapter using the string array and a default spinner layout
        empGenderAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_gender, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empGenderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeGender.setAdapter(empGenderAdapter);
        spinnerEmployeeGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getBaseContext(), adapterView.getItemAtPosition(i) + " Selected ", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        empInstituteAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_institute, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empInstituteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeInstitute.setAdapter(empInstituteAdapter);

        empDepartmentAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_department, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empDepartmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeDepartment.setAdapter(empDepartmentAdapter);

        empMaritelStatusAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_marital_status, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empMaritelStatusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeMaritalStatus.setAdapter(empMaritelStatusAdapter);


        empBloodGroupAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_blood_group, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empBloodGroupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeBloodGroup.setAdapter(empBloodGroupAdapter);

        empReligionAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_religion, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empReligionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeReligion.setAdapter(empReligionAdapter);

    }

    private void showDate(int year, int month, int day) {
        editTextDateofBirthDialog.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }

    @SuppressWarnings("deprecation")
    public void showDatePicDialog(View view) {
        showDialog(999);
        //Toast.makeText(getApplicationContext(), "ca", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this, myDateListener, year_x,month_x,day_x);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
            /* arg1 = year;
             arg2 = month;
             arg3 = day;*/
            showDate(arg1, arg2+1, arg3);
        }
    };

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            // Do something with the date chosen by the user
        }
    }

   /* public void showDialogOnButtonClick(){
        editTextDateofBirthDialog = (EditText) findViewById(R.id.edit_text_date_of_birth_edit);
        editTextDateofBirthDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });
    }
*/

   /* private DatePickerDialog.OnDateSetListener dpickerlistener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            year_x = year;
            month_x = monthOfYear +1;
            day_x =dayOfMonth;
            Toast.makeText(EditEmployeeAccount.this, year_x + " / " + month_x+ " / " + day_x, Toast.LENGTH_SHORT).show();
        }
    };*/

}
