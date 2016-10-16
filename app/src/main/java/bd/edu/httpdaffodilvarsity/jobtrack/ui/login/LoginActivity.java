package bd.edu.httpdaffodilvarsity.jobtrack.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bd.edu.httpdaffodilvarsity.jobtrack.R;
import bd.edu.httpdaffodilvarsity.jobtrack.TabedActivity;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       /* CreateUserAccount();
        EmployeeFogetPassword();*/
    }

    public void CreateUserAccount(View v){
        Intent in = new Intent(LoginActivity.this, CreateUserAccount.class);
        startActivity(in);
    }
    public void onSignInPressed(View v){
        Intent in = new Intent(LoginActivity.this, HomeTabActivity.class);
        startActivity(in);
    }

    public void EmployeeFogetPassword(View v){
        Intent in = new Intent(LoginActivity.this, ChangePassword.class);
        startActivity(in);
    }

    public void EmployeeSetPassword(View v){
        Intent in = new Intent(LoginActivity.this, SetPassword.class);
        startActivity(in);
    }
}
