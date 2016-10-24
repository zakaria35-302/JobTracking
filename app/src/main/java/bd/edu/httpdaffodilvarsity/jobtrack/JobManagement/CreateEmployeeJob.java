package bd.edu.httpdaffodilvarsity.jobtrack.JobManagement;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Calendar;

import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.ui.login.TaskManagement;

public class CreateEmployeeJob extends AppCompatActivity {


    EditText editTextJobDeadCreate;

    //Button btn;
    int year_x,month_x,day_x;

    Spinner spinnerEmployeeJobAccessibility, spinnerEmployeeJobProgress, spinnerEmployeeJobPriority,
            spinnerEmployeeJobStatus, spinnerEmployeejobDepartment, getSpinnerEmployeeJobRole ;
    ArrayAdapter<CharSequence> empJobAccessibilityAdapter, empJobProgressAdapter, empJobPriorityAdapter,
            empJobStatusAdapter, empJobDepartmentAdapter, empJobRoleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_employee_job);


        editTextJobDeadCreate = (EditText) findViewById(R.id.edit_text_job_dead_create);
        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);

        /* calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);*/
        showDate(year_x, month_x+1, day_x);

        spinnerEmployeeJobAccessibility = (Spinner) findViewById(R.id.spinner_job_Accesibility_create);
        empJobAccessibilityAdapter = ArrayAdapter.createFromResource(this,
                R.array.employee_task_accessability, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        empJobAccessibilityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerEmployeeJobAccessibility.setAdapter(empJobAccessibilityAdapter);

        spinnerEmployeeJobProgress = (Spinner) findViewById(R.id.spinner_job_progress_create);
        empJobProgressAdapter = ArrayAdapter.createFromResource(this, R.array.employee_task_progress,
                android.R.layout.simple_spinner_item);
        empJobProgressAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmployeeJobProgress.setAdapter(empJobProgressAdapter);

        spinnerEmployeeJobPriority = (Spinner) findViewById(R.id.spinner_job_priority_create);
        empJobPriorityAdapter = ArrayAdapter.createFromResource(this, R.array.employee_task_priority,
                android.R.layout.simple_spinner_item);
        empJobPriorityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmployeeJobPriority.setAdapter(empJobPriorityAdapter);

        spinnerEmployeeJobStatus = (Spinner) findViewById(R.id.spinner_job_status_create);
        empJobStatusAdapter = ArrayAdapter.createFromResource(this, R.array.employee_task_status,
                android.R.layout.simple_spinner_item);
        empJobStatusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmployeeJobStatus.setAdapter(empJobStatusAdapter);

        spinnerEmployeejobDepartment = (Spinner) findViewById(R.id.spinner_job_department_create);
        empJobDepartmentAdapter = ArrayAdapter.createFromResource(this, R.array.employee_department,
                android.R.layout.simple_spinner_item);
        empJobDepartmentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmployeejobDepartment.setAdapter(empJobDepartmentAdapter);

        getSpinnerEmployeeJobRole = (Spinner) findViewById(R.id.spinner_job_role_create);
        empJobRoleAdapter = ArrayAdapter.createFromResource(this, R.array.employee_task_role,
                android.R.layout.simple_spinner_item);
        empJobRoleAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getSpinnerEmployeeJobRole.setAdapter(empJobRoleAdapter);

    }

    private void showDate(int year, int month, int day) {
        editTextJobDeadCreate.setText(new StringBuilder().append(day).append("/")
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
    public void jobBack(View view){
        Intent taskBack = new Intent(CreateEmployeeJob.this, TaskManagement.class);
        startActivity(taskBack);
    }
}
