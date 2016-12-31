package bd.edu.httpdaffodilvarsity.jobtrack.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Zakaria on 05-Dec-16.
 */

public class DatabaseHelper  extends SQLiteOpenHelper{

    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    static  final int DATABASE_VERSION=3;
    static  final String DATABASE_NAME="jobtrack.db";

    //common column
    static final String COL_EMPLOYEE_ID="employee_id";
    static final String COL_READ_FLAG="read_flag";
    static final String COL_MEM_STATUS="mem_status";
    static final String COL_EMAIL_WANT="email_want";
    static final String COL_VISIBLE="visible";
    static final String COL_CREATED_BY="created_by";
    static final String COL_CREATED_TIME="created_time";
    static final String COL_TASK_ID="task_id";
    static final String COL_STATUS="status";
    static final String COL_ROLE="role";
    static final String COL_JOB_ID="COL_JOB_ID";
    static final String COL_UPDATE_BY="COL_UPDCOL_UPDATED_TIME";

    // Table  `hrm_designation`

    static final String TABLE_HRM_DESIGNATION="hrm_designation";
    static final String COL_DESIGNATION_ID="desig_id";
    static final String COL_DESIGNATION="designation";
    static final String COL_VIEW_ORDER="view_order";
    static final String COL_DESIG_CREATED_BY="created_by";
    static final String COL_DESIG_CREATED_TIME="created_time";
    static final String COL_DESIG_MODIFIED_BY="modified_by";
    static final String COL_DESIG_MODIFIED_TIME="modified_time";


    String CREATE_TABLE_HRM_DESIGNATION=" CREATE TABLE IF NOT EXISTS " + TABLE_HRM_DESIGNATION + " ( "
            + COL_DESIGNATION_ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_DESIGNATION +" TEXT ,"
            + COL_VIEW_ORDER +" INTEGER,"
            + COL_DESIG_CREATED_BY +" TEXT,"
            + COL_DESIG_CREATED_TIME +" DATETIME,"
            + COL_DESIG_MODIFIED_BY +" TEXT,"
            + COL_DESIG_MODIFIED_TIME+" DATETIME);";


    public boolean insertHRMDesignation( String designation){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(COL_DESIGNATION_ID,desig_id);
        contentValues.put(COL_DESIGNATION,designation);
        //contentValues.put(COL_VIEW_ORDER,view_order);
        //contentValues.put(COL_DESIG_CREATED_BY, created_by);
       // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //contentValues.put("created_time", dateFormat.format(created_time));
        //contentValues.put(COL_DESIG_MODIFIED_BY,modified_by);
        //contentValues.put("modified_time", dateFormat.format(modified_time));
        //contentValues.put(COL_DESIG_MODIFIED_TIME, modified_time);

        long result = db.insert(TABLE_HRM_DESIGNATION,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }

    /*public Cursor getALLData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_HRM_DESIGNATION,null);
        return res;
    }
*/

    static final String TABLE_DEPARTMENT_INFO="department_info";
    static final String COL_DEPARTMETN_ID="dept_id";
    static final String COL_DEPARTMETN_NAME="dept_name";


    String CREATE_TABLE_DEPARTMENT_INFO=" CREATE TABLE IF NOT EXISTS " + TABLE_DEPARTMENT_INFO + " ( "
            + COL_DEPARTMETN_ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COL_DEPARTMETN_NAME +" TEXT UNIQUE);";


    public boolean insertHRMDepartment( String designation){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(COL_DESIGNATION_ID,desig_id);
        contentValues.put(COL_DESIGNATION,designation);
        //contentValues.put(COL_VIEW_ORDER,view_order);
        //contentValues.put(COL_DESIG_CREATED_BY, created_by);
        // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //contentValues.put("created_time", dateFormat.format(created_time));
        //contentValues.put(COL_DESIG_MODIFIED_BY,modified_by);
        //contentValues.put("modified_time", dateFormat.format(modified_time));
        //contentValues.put(COL_DESIG_MODIFIED_TIME, modified_time);

        long result = db.insert(TABLE_DEPARTMENT_INFO,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }

    // TABLE_HRM_EMPLOYEE

    static  final String TABLE_PERSON_INFO="person_info";
    static final String COL_ID="id";
    //static final String COL_EMPLOYEE_ID="employee_id";
    static final String COL_EMP_NAME="emp_name";
    //static final String COL_DESIGNATION_ID="designation_id";
    static final String COL_EMP_EMAIL="emp_email";
    static final String COL_CURRENT_DEPT_ID="current_dept_id";
    static final String COL_CURRENT_BRANCH="current_branch";
    static final String COL_REPORTS_TO="reports_to";
    static final String COL_ACTIVE="active";
    //static final String COL_EMP_CREATED_BY="created_by";
    //static final String COL_EMP_CREATED_TIME="created_time";
    static final String COL_MODIFIED_BY="modified_by";
    static final String COL_MODIFIED_TIME="modified_time";
    static final String COL_USER_GROUP_ID="user_group_id";
    static final String COL_PASSWORD="password";
    static final String COL_AUTHENTICATE_CODE="authenticate_code";
    static final String COL_CURRENT_STATUS="current_status";
    static final String COL_STATUS_UPDATE_TIME="status_update_time";


    String CREATE_TABLE_PERSON_INFO =" CREATE TABLE IF NOT EXISTS " + TABLE_PERSON_INFO + " ( "
            + COL_ID +" INTEGER PRIMARY KEY,"
            + COL_EMPLOYEE_ID +" TEXT ,"
            + COL_EMP_NAME +" TEXT,"
            + COL_EMP_EMAIL +" TEXT,"
            + COL_DESIGNATION_ID +" INTEGER,"
            + COL_CURRENT_DEPT_ID +" INTEGER,"
            + COL_CURRENT_BRANCH +" INTEGER,"
            + COL_REPORTS_TO +" TEXT,"
            + COL_ACTIVE +" TEXT,"
            + COL_CREATED_BY +" TEXT,"
            + COL_CREATED_TIME +" DATETIME,"
            + COL_MODIFIED_BY +" TEXT,"
            + COL_MODIFIED_TIME +" DATETIME,"
            + COL_USER_GROUP_ID +" INTEGER,"
            + COL_PASSWORD +" TEXT,"
            + COL_AUTHENTICATE_CODE +" TEXT,"
            + COL_CURRENT_STATUS +" TEXT,"
            + COL_STATUS_UPDATE_TIME+" DATETIME, "
            + " FOREIGN KEY ("+COL_CURRENT_DEPT_ID+") REFERENCES "+TABLE_DEPARTMENT_INFO+"("+COL_DEPARTMENT_ID+")"
            + " FOREIGN KEY ("+COL_DESIGNATION_ID+") REFERENCES "+TABLE_HRM_DESIGNATION+"("+COL_DESIGNATION_ID+"));";



    public boolean insertHRMPersonInfo(String employee_id, String emp_name, String emp_email,
                                         String current_dept_id){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(COL_ID,id);
        contentValues.put(COL_EMPLOYEE_ID,employee_id);
        contentValues.put(COL_EMP_NAME, emp_name);
        contentValues.put(COL_EMP_EMAIL, emp_email);
        //contentValues.put(COL_DEPARTMENT_ID,designation_id);
        contentValues.put(COL_CURRENT_DEPT_ID,current_dept_id);
        //contentValues.put(COL_CURRENT_BRANCH, current_branch);
        /*contentValues.put(COL_REPORTS_TO,reports_to);
        contentValues.put(COL_ACTIVE,active);
        contentValues.put(COL_CREATED_BY, created_by);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        contentValues.put("created_time", dateFormat.format(created_time));
        contentValues.put(COL_DESIG_MODIFIED_BY,modified_by);
        contentValues.put("modified_time", dateFormat.format(modified_time));
        contentValues.put(COL_USER_GROUP_ID,user_group_id);
        contentValues.put(COL_PASSWORD,password);
        contentValues.put(COL_AUTHENTICATE_CODE, authenticate_code);
        contentValues.put(COL_CURRENT_STATUS,current_status);
        contentValues.put("status_update_time", dateFormat.format(status_update_time));*/

        long result = db.insert(TABLE_PERSON_INFO,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }

    //TABLE_HRM_ORG_JOB_MEMBER
    static  final String TABLE_HRM_ORG_JOB_MEMBER="hrm_org_job_member";
    //static final String COL_JOB_ID="job_id";
    //static final String COL_EMPLOYEE_ID="employee_id";
    //static final String COL_ROLE="role";
    //static final String COL_READ_FLAG="read_flag";
    //static final String COL_MEM_STATUS="mem_status";
    //static final String COL_EMAIL_WANT="email_want";
    //static final String COL_VISIBLE="visible";


    String CREATE_TABLE_HRM_ORG_JOB_MEMBER =" CREATE TABLE IF NOT EXISTS " + TABLE_HRM_ORG_JOB_MEMBER + " ( "
            + COL_JOB_ID +" INTEGER,"
            + COL_EMPLOYEE_ID+" INTEGER,"
            + COL_ROLE +" TEXT,"
            + COL_READ_FLAG +" boolean,"
            + COL_MEM_STATUS +" INTEGER,"
            + COL_EMAIL_WANT +" boolean,"
            + COL_VISIBLE+" boolean, "
            + " PRIMARY KEY ("+COL_JOB_ID+","+COL_EMPLOYEE_ID+"), "
            + " FOREIGN KEY ("+COL_ROLE+") REFERENCES "+TABLE_HRM_ROLE+"("+COL_ROLE+"));";

  /*  "CREATE TABLE IF NOT EXISTS " + TABLE_ATTENDEE +
            " (" + COLUMN_Att_Event_ID + " TEXT," +
    COLUMN_Att_Email + " TEXT, PRIMARY KEY(" + COLUMN_Att_Event_ID + "," + COLUMN_Att_Email + "))"
    */
    public boolean insertHRMJobMember(int job_id, int employee_id, String role, boolean read_flag, int mem_status,
                                      boolean email_want, boolean visible){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_JOB_ID,job_id);
        contentValues.put(COL_EMPLOYEE_ID,employee_id);
        contentValues.put(COL_ROLE, role);
        contentValues.put(COL_READ_FLAG,read_flag);
        contentValues.put(COL_MEM_STATUS, mem_status);
        contentValues.put(COL_EMAIL_WANT, email_want);
        contentValues.put(COL_VISIBLE, visible);

        long result = db.insert(TABLE_HRM_ORG_JOB_MEMBER,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;
    }


    //TABLE_HRM_ORG_JOB_TRACKER
    static  final String TABLE_HRM_ORG_JOB_TRACKER="hrm_org_job_tracker";
    static final String COL_WHO="who";
    static final String COL_WHOM="whom";
    //static final String COL_READ_FLAG="read_flag";
    //static final String COL_EMAIL_WANT="email_want";
    //static final String COL_VISIBLE="visible";
    //static final String COL_CREATED_BY="created_by";
    //static final String COL_CREATED_TIME="created_time";


    String CREATE_TABLE_HRM_ORG_JOB_TRACKER=" CREATE TABLE IF NOT EXISTS " + TABLE_HRM_ORG_JOB_TRACKER + " ( "
            + COL_WHO +" INTEGER ,"
            + COL_WHOM +" INTEGER ,"
            + COL_READ_FLAG +" TEXT,"
            + COL_EMAIL_WANT +" boolean,"
            + COL_VISIBLE +" boolean,"
            + COL_CREATED_BY +" TEXT,"
            + COL_CREATED_TIME+" DATETIME, "
         + " PRIMARY KEY (" + COL_WHO + "," + COL_WHOM + "));";

    public boolean insertHRMOrgJobTracker(int who, int whom, int read_flag, boolean email_want, boolean visible,
                                          String created_by, Date created_time){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_WHO,who);
        contentValues.put(COL_WHOM,whom);
        contentValues.put(COL_READ_FLAG,read_flag);
        contentValues.put(COL_EMAIL_WANT,email_want);
        contentValues.put(COL_VISIBLE,visible);
        contentValues.put(COL_CREATED_BY, created_by);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        contentValues.put("created_time", dateFormat.format(created_time));

        long result = db.insert(TABLE_HRM_ORG_JOB_TRACKER,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }

    //TABLE_HRM_ORG_PRIORITY
    static final String TABLE_HRM_ORG_PRIORITY="hrm_org_priority";
    static final String COL_PRIORITY_NO="priority_no";
    static final String COL_PRIORITY_NAME="priority_name";


    String CREATE_TABLE_HRM_ORG_PRIORITY=" CREATE TABLE IF NOT EXISTS " + TABLE_HRM_ORG_PRIORITY + " ( "
            + COL_PRIORITY_NO +" INTEGER PRIMARY KEY,"
            + COL_PRIORITY_NAME+" TEXT);";

    public boolean insertHRMOrgPriority(int priority_no, String priority_name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_PRIORITY_NO,priority_no);
        contentValues.put(COL_PRIORITY_NAME,priority_name);

        long result = db.insert(TABLE_HRM_ORG_PRIORITY,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }


   //TABLE_HRM_ORG_TASK
    static final String TABLE_HRM_ORG_TASK="hrm_org_task";

    //static final String COL_TASK_ID="task_id";
    static final String COL_TASK_TITLE="task_title";
    static final String COL_TASK_DESCRIPTION="task_description";
    static final String COL_START_DATE="startdate";
    static final String COL_ESTIMATED_DATE="estimated_date";
    static final String COL_ACTUAL_ENDDATE="actual_enddate";
    //static final String COL_STATUS="status";
    static final String COL_PERCENT_DONE="percent_done";
    static final String COL_PRIORITY="priority";
    static final String COL_OWNER_COMMENTS="owner_comments";
    static final String COL_INCHARGE_COMMENTS="incharge_comments";
    static final String COL_TASK_OWNER_ID="task_owner_id";
    //static final String COL_JOB_ID="job_id";
    static final String COL_ACCESIBILITY="accesibility";
    static final String COL_PREV_OWNER_ID="prev_owner_id";
    //static final String COL_CREATED_BY="created_by";
    //static final String COL_CREATED_TIME="created_time";
    //static final String COL_UPDATE_BY="update_by";
    //static final String COL_UPDATE_TIME="updated_time";


    String CREATE_TABLE_HRM_ORG_TASK=" CREATE TABLE IF NOT EXISTS " + TABLE_HRM_ORG_TASK + " ( "
            + COL_TASK_ID +" INTEGER PRIMARY KEY,"
            + COL_TASK_TITLE +" TEXT,"
            + COL_TASK_DESCRIPTION +" TEXT,"
            + COL_START_DATE +" DATETIME,"
            + COL_ESTIMATED_DATE +" DATETIME,"
            + COL_ACTUAL_ENDDATE +" DATETIME,"
            + COL_STATUS +" TEXT,"
            + COL_PERCENT_DONE +" TEXT,"
            + COL_PRIORITY +" TEXT,"
            + COL_OWNER_COMMENTS +" TEXT,"
            + COL_INCHARGE_COMMENTS +" TEXT,"
            + COL_TASK_OWNER_ID +" TEXT,"
            + COL_JOB_ID +" TEXT,"
            + COL_ACCESIBILITY +" TEXT,"
            + COL_PREV_OWNER_ID +" TEXT,"
            + COL_CREATED_BY +" TEXT,"
            + COL_CREATED_TIME +" DATETIME,"
            + COL_UPDATE_BY +" TEXT,"
            + COL_UPDATE_TIME+" DATETIME, "
            + " FOREIGN KEY ("+COL_STATUS+") REFERENCES "+TABLE_HRM_ORG_TASK_STATUS+"("+COL_STATUS+")"
            + " FOREIGN KEY ("+COL_PRIORITY+") REFERENCES "+TABLE_HRM_ORG_PRIORITY+"("+COL_PRIORITY+")"
            + " FOREIGN KEY ("+COL_JOB_ID+") REFERENCES "+TABLE_JOB_MANAGEMENT+"("+COL_JOB_ID+"));";


    public boolean insertHRMOrgTask(int task_id, String task_title, String task_description, Date startdate, Date estimated_date,
                                    Date actual_enddate, String status, int percent_done, int priority, String owner_comments,
                                    String incharge_comments, int task_owner_id, int job_id, int accesibility, int prev_owner_id, int created_by,
                                    Date created_time, int update_by, Date updated_time){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_TASK_ID,task_id);
        contentValues.put(COL_TASK_TITLE,task_title);
        contentValues.put(COL_TASK_DESCRIPTION,task_description);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        contentValues.put("startdate", dateFormat.format(startdate));
        contentValues.put("estimated_date", dateFormat.format(estimated_date));
        contentValues.put("actual_enddate", dateFormat.format(actual_enddate));
        contentValues.put(COL_STATUS,status);
        contentValues.put(COL_PERCENT_DONE,percent_done);
        contentValues.put(COL_PRIORITY,priority);
        contentValues.put(COL_OWNER_COMMENTS,owner_comments);
        contentValues.put(COL_INCHARGE_COMMENTS,incharge_comments);
        contentValues.put(COL_TASK_OWNER_ID,task_owner_id);
        contentValues.put(COL_JOB_ID,job_id);
        contentValues.put(COL_ACCESIBILITY,accesibility);
        contentValues.put(COL_PREV_OWNER_ID,prev_owner_id);
        contentValues.put(COL_CREATED_BY, created_by);
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        contentValues.put("created_time", dateFormat.format(created_time));

        contentValues.put(COL_UPDATE_BY, update_by);
        contentValues.put("updated_time", dateFormat.format(updated_time));

        long result = db.insert(TABLE_HRM_ORG_TASK,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;
    }

    //TABLE_HRM_ORG_TASK_ACTIVITIES

    static final String TABLE_HRM_ORG_TASK_ACTIVITIES="hrm_org_task_activities";
    static final String COL_ACTIVITY_ID="activity_id";
    //static final String COL_TASK_ID="task_id";
    static final String COL_DATE="date";
    static final String COL_ACTIVITY_DESC="activity_desc";
    static final String COL_ACTIVITY_GRADE="activity_grade";
    static final String COL_ACTIVITY_GRADE_BY="activity_grade_by";
    static final String COL_COMMENTATOR_ID="commentator_id";
    static final String COL_PERFORMED_BY="performed_by";
    static final String COL_APP="app";
    static final String COL_CLIENT_IP="client_ip";
    static final String COL_READERS="readers";
    static final String COL_PREV_COMMENTATOR_ID="prev_commentator_id";
    static final String COL_PREV_PERFORMED_BY="prev_performed_by";


    String CREATE_TABLE_HRM_ORG_TASK_ACTIVITIES=" CREATE TABLE  IF NOT EXISTS " + TABLE_HRM_ORG_TASK_ACTIVITIES + " ( "
            + COL_ACTIVITY_ID +" INTEGER PRIMARY KEY,"
            + COL_TASK_ID +" INTEGER,"
            + COL_DATE +" DATETIME,"
            + COL_ACTIVITY_DESC +" TEXT,"
            + COL_ACTIVITY_GRADE +" TEXT,"
            + COL_ACTIVITY_GRADE_BY +" TEXT,"
            + COL_COMMENTATOR_ID +" INTEGER,"
            + COL_PERFORMED_BY +" TEXT,"
            + COL_APP +" TEXT,"
            + COL_CLIENT_IP +" TEXT,"
            + COL_READERS +" TEXT,"
            + COL_PREV_COMMENTATOR_ID +" TEXT,"
            + COL_PREV_PERFORMED_BY +" TEXT, "
        + " FOREIGN KEY ("+COL_TASK_ID+") REFERENCES "+TABLE_HRM_ORG_TASK+"("+COL_TASK_ID+"));";

    public boolean insertHRMOrgTaskActivities(int activity_id, int task_id, Date date, String activity_desc, int activity_grade,
                                              String activity_grade_by, int commentator_id, int performed_by, String app,
                                              String client_ip, String readers, int prev_commentator_id, int prev_performed_by){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_ACTIVITY_ID,activity_id);
        contentValues.put(COL_TASK_ID,task_id);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        contentValues.put("date", dateFormat.format(date));
        contentValues.put(COL_ACTIVITY_DESC,activity_desc);
        contentValues.put(COL_ACTIVITY_GRADE,activity_grade);
        contentValues.put(COL_ACTIVITY_GRADE_BY, activity_grade_by);
        contentValues.put(COL_COMMENTATOR_ID,commentator_id);
        contentValues.put(COL_PERFORMED_BY,performed_by);
        contentValues.put(COL_APP,app);
        contentValues.put(COL_CLIENT_IP,client_ip);
        contentValues.put(COL_READERS,readers);
        contentValues.put(COL_PREV_COMMENTATOR_ID, prev_commentator_id);
        contentValues.put(COL_PREV_PERFORMED_BY,prev_performed_by);

        long result = db.insert(TABLE_HRM_ORG_TASK_ACTIVITIES,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }


   //TABLE_HRM_ORG_TASK_STATUS

    static  final String TABLE_HRM_ORG_TASK_STATUS="hrm_org_task_status";
    //static final String COL_STATUS="status";
    static final String COL_STATUS_ID="status_id";



    String CREATE_TABLE_HRM_ORG_TASK_STATUS=" CREATE TABLE IF NOT EXISTS " + TABLE_HRM_ORG_TASK_STATUS + " ( "
            +COL_STATUS +" TEXT PRIMARY KEY);";
            /*+COL_STATUS_ID +" INTEGER );";*/


    public boolean insertHRMOrgTaskStatus(int status_id, String status){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_STATUS_ID,status_id);
        contentValues.put(COL_STATUS,status);

        long result = db.insert(TABLE_HRM_ORG_TASK_STATUS,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }

    //TABLE_HRM_ORG_TASK_TRACKER
    static final String TABLE_HRM_ORG_TASK_TRACKER="hrm_org_task_tracker";
    //static final String COL_TASK_ID="task_id";
    //static final String COL_EMPLOYEE_ID="employee_id";
    //static final String COL_ROLE="role";
    //static final String COL_READ_FLAG="read_flag";
    //static final String COL_MEM_STATUS="mem_status";
    //static final String COL_EMAIL_WANT="email_want";
    //static final String COL_VISIBLE="visible";


    String CREATE_TABLE_HRM_ORG_TASK_TRACKER=" CREATE TABLE IF NOT EXISTS " + TABLE_HRM_ORG_TASK_TRACKER + " ( "
            + COL_TASK_ID +" INTEGER,"
            + COL_EMPLOYEE_ID +" INTEGER ,"
            + COL_ROLE +" TEXT,"
            + COL_READ_FLAG +" TEXT,"
            + COL_MEM_STATUS +" TEXT,"
            + COL_EMAIL_WANT +" TEXT,"
            + COL_VISIBLE+" TEXT ,"
           + " PRIMARY KEY (" + COL_TASK_ID + "," + COL_EMPLOYEE_ID + "));";




    public boolean insertHRMOrgTaskTracker(int task_id, int employee_id, String role, int read_flag, int mem_status, boolean email_want,
                                           boolean visible){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_TASK_ID,task_id);
        contentValues.put(COL_EMPLOYEE_ID,employee_id);
        contentValues.put(COL_ROLE,role);
        contentValues.put(COL_READ_FLAG,read_flag);
        contentValues.put(COL_MEM_STATUS,mem_status);
        contentValues.put(COL_EMAIL_WANT, email_want);
        contentValues.put(COL_VISIBLE, visible);

        long result = db.insert(TABLE_HRM_ORG_TASK_TRACKER,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }


    //TABLE_HRM_ROLE

    static  final String TABLE_HRM_ROLE="hrm_role";
    //static final String COL_ROLE="role";
    //static final String COL_ROLE_ID="role_id";



    String CREATE_TABLE_HRM_ROLE=" CREATE TABLE IF NOT EXISTS " + TABLE_HRM_ROLE + " ( "
            /*+ COL_ROLE_ID +" INTEGER PRIMARY KEY AUTOINCREMENT,"*/
            + COL_ROLE +" TEXT PRIMARY KEY);";



    public boolean insertHRMRole(String role){
        //public boolean insertHRMRole(int role_id, String role){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(COL_ROLE_ID,role_id);
        contentValues.put(COL_ROLE,role);

        long result = db.insert(TABLE_HRM_ROLE,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;

    }

// TABLE_JOB_MANAGEMENT
    static final String TABLE_JOB_MANAGEMENT="job_management";
    //static final String COL_JOB_ID="job_id";
    static final String COL_JOB_TITLE="job_title";
    static final String COL_JOB_DESCRIPTION="job_description";
    static final String COL_JOB_HAS_DEADLINE="job_has_deadline_";
    static final String COL_JOB_STARTDATE="job_startdate";
    static final String COL_JOB_ENDDATE="col_job_enddate";
    static final String COL_JOB_PROGRESS="col_job_progress";
    static final String COL_JOB_PRIORITY="job_priority";
    static final String COL_JOB_STATUS="job_status";
    static final String COL_DEPARTMENT_ID ="department_id";
    //static final String COL_CREATED_BY="created_by";
    //static final String COL_CREATED_TIME="created_time";
    //static final String COL_UPDATE_BY="update_by";
    static final String COL_UPDATE_TIME="update_time";
    static final String COL_JOB_OWNER="job_owner";


    String CREATE_TABLE_JOB_MANAGEMENT=" CREATE TABLE IF NOT EXISTS " + TABLE_JOB_MANAGEMENT + " ( "
            + COL_JOB_ID +" INTEGER PRIMARY KEY,"
            + COL_JOB_TITLE +" TEXT,"
            + COL_JOB_DESCRIPTION +" TEXT,"
            + COL_JOB_HAS_DEADLINE +" INTEGER,"
            + COL_JOB_STARTDATE +" DATETIME DEFAULT CURRENT_TIMESTAMP,"
            + COL_JOB_ENDDATE +" DATETIME ,"
            + COL_JOB_PROGRESS +" TEXT,"
            + COL_JOB_PRIORITY +" TEXT,"
            + COL_JOB_STATUS +" TEXT,"
            + COL_DEPARTMENT_ID +" INTEGER,"
            + COL_CREATED_BY +" TEXT,"
            + COL_CREATED_TIME +" DATETIME,"
            + COL_UPDATE_BY +" TEXT,"
            + COL_UPDATE_TIME +" DATETIME,"
            + COL_JOB_OWNER +" TEXT,"
        + " FOREIGN KEY ("+COL_DEPARTMENT_ID+") REFERENCES "+TABLE_DEPARTMENT_INFO+"("+COL_DEPARTMENT_ID+"));";



    /*public boolean insertJobManagement(int job_id, String job_title, String job_description, int job_has_deadline,
                                       Date job_startdate, Date job_enddate, int job_progress, int job_priority, String job_status,
                                       int department_id, int created_by, Date created_time, int update_by, Date update_time,
                                       int job_owner){*/

    public boolean insertJobManagement(String job_title, String job_description, int job_has_deadline, Date job_enddate,
                                       int job_progress, int job_priority, String job_status,
                                       int department_id, int job_owner){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(COL_JOB_ID, job_id);
        contentValues.put(COL_JOB_TITLE, job_title);
        contentValues.put(COL_JOB_DESCRIPTION,job_description);
        contentValues.put(COL_JOB_HAS_DEADLINE, job_has_deadline);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //contentValues.put("job_startdate", dateFormat.format(job_startdate));
        //contentValues.put(COL_JOB_STARTDATE, job_startdate);
        contentValues.put("job_enddate", dateFormat.format(job_enddate));
        //contentValues.put(COL_JOB_ENDDATE, job_enddate);
        contentValues.put(COL_JOB_PROGRESS, job_progress);
        contentValues.put(COL_JOB_PRIORITY, job_priority);
        contentValues.put(COL_JOB_STATUS,job_status);
        contentValues.put(COL_DEPARTMENT_ID, department_id);
        //contentValues.put(COL_CREATED_BY, created_by);
        //contentValues.put("created_time", dateFormat.format(created_time));
        //contentValues.put(COL_JOB_ENDDATE, created_time);
        //contentValues.put(COL_JOB_ID, update_by);
        //contentValues.put("update_time", dateFormat.format(update_time));
        //contentValues.put(COL_JOB_TITLE, update_time);
        contentValues.put(COL_JOB_OWNER,job_owner);

        long result = db.insert(TABLE_JOB_MANAGEMENT,null,contentValues);
        if(result ==-1)
            return false;
        else
            return true;
    }

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_TABLE_HRM_DESIGNATION);
        db.execSQL(CREATE_TABLE_DEPARTMENT_INFO);
        db.execSQL(CREATE_TABLE_PERSON_INFO);
        db.execSQL(CREATE_TABLE_HRM_ORG_JOB_MEMBER);
        db.execSQL(CREATE_TABLE_HRM_ORG_JOB_TRACKER);
        db.execSQL(CREATE_TABLE_HRM_ORG_PRIORITY);
        db.execSQL(CREATE_TABLE_HRM_ORG_TASK);
        db.execSQL(CREATE_TABLE_HRM_ORG_TASK_ACTIVITIES);
        db.execSQL(CREATE_TABLE_HRM_ORG_TASK_STATUS);
        db.execSQL(CREATE_TABLE_HRM_ORG_TASK_TRACKER);
        db.execSQL(CREATE_TABLE_HRM_ROLE);
        db.execSQL(CREATE_TABLE_JOB_MANAGEMENT);
    };

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_DESIGNATION);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DEPARTMENT_INFO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PERSON_INFO);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_ORG_JOB_MEMBER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_ORG_JOB_TRACKER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_ORG_PRIORITY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_ORG_TASK);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_ORG_TASK_ACTIVITIES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_ORG_TASK_STATUS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_ORG_TASK_TRACKER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HRM_ROLE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_JOB_MANAGEMENT);
        onCreate(db);
    }


}


