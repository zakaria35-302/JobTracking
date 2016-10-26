package bd.edu.httpdaffodilvarsity.jobtrack.superior;

/**
 * Created by mahmud on 10/25/16.
 */

public class SuperiorClass{

    private int image_resource;
    private String superior_name;
    private String superior_set;
    private String superior_id;
    private String superior_department;
    private String superior_designation;
    private String set_subordinate;

    public SuperiorClass(int image_resource, String superior_name, String superior_set, String superior_id,
                         String superior_department, String superior_designation, String set_subordinate) {
        this.image_resource = image_resource;
        this.superior_name = superior_name;
        this.superior_set = superior_set;
        this.superior_id = superior_id;
        this.superior_department = superior_department;
        this.superior_designation = superior_designation;
        this.set_subordinate = set_subordinate;
    }

    public int getImage_resource() {
        return image_resource;
    }

    public void setImage_resource(int image_resource) {
        this.image_resource = image_resource;
    }

    public String getSuperior_name() {
        return superior_name;
    }

    public void setSuperior_name(String superior_name) {
        this.superior_name = superior_name;
    }

    public String getSuperior_set() {
        return superior_set;
    }

    public void setSuperior_set(String superior_set) {
        this.superior_set = superior_set;
    }

    public String getSuperior_id() {
        return superior_id;
    }

    public void setSuperior_id(String superior_id) {
        this.superior_id = superior_id;
    }

    public String getSuperior_department() {
        return superior_department;
    }

    public void setSuperior_department(String superior_department) {
        this.superior_department = superior_department;
    }

    public String getSuperior_designation() {
        return superior_designation;
    }

    public void setSuperior_designation(String superior_designation) {
        this.superior_designation = superior_designation;
    }

    public String getSet_subordinate() {
        return set_subordinate;
    }

    public void setSet_subordinate(String set_subordinate) {
        this.set_subordinate = set_subordinate;
    }
}
