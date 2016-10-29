package bd.edu.httpdaffodilvarsity.jobtrack.taskManagement;

    /**
     * Created by mahmud on 10/27/16.
     */
    public class ListViewMostUsedTasKDetailsClass {

        private String employeeMostUsedTaskDetailName;
        private String employeeMostUsedTaskDetailTittle;
        private String employeeMostUsedTaskDetailCommentCreateTime;
        private String employeeMostUsedTaskDetailComment;
        private String employeeMostUsedTaskDetailCommentAttachment;

        public ListViewMostUsedTasKDetailsClass(String employeeMostUsedTaskDetailName, String employeeMostUsedTaskDetailTittle,
                                                String employeeMostUsedTaskDetailCommentCreateTime, String employeeMostUsedTaskDetailComment,
                                                String employeeMostUsedTaskDetailCommentAttachment) {
            this.employeeMostUsedTaskDetailName = employeeMostUsedTaskDetailName;
            this.employeeMostUsedTaskDetailTittle = employeeMostUsedTaskDetailTittle;
            this.employeeMostUsedTaskDetailCommentCreateTime = employeeMostUsedTaskDetailCommentCreateTime;
            this.employeeMostUsedTaskDetailComment = employeeMostUsedTaskDetailComment;
            this.employeeMostUsedTaskDetailCommentAttachment = employeeMostUsedTaskDetailCommentAttachment;
        }

        public String getEmployeeMostUsedTaskDetailName() {
            return employeeMostUsedTaskDetailName;
        }

        public void setEmployeeMostUsedTaskDetailName(String employeeMostUsedTaskDetailName) {
            this.employeeMostUsedTaskDetailName = employeeMostUsedTaskDetailName;
        }

        public String getEmployeeMostUsedTaskDetailTittle() {
            return employeeMostUsedTaskDetailTittle;
        }

        public void setEmployeeMostUsedTaskDetailTittle(String employeeMostUsedTaskDetailTittle) {
            this.employeeMostUsedTaskDetailTittle = employeeMostUsedTaskDetailTittle;
        }

        public String getEmployeeMostUsedTaskDetailCommentCreateTime() {
            return employeeMostUsedTaskDetailCommentCreateTime;
        }

        public void setEmployeeMostUsedTaskDetailCommentCreateTime(String employeeMostUsedTaskDetailCommentCreateTime) {
            this.employeeMostUsedTaskDetailCommentCreateTime = employeeMostUsedTaskDetailCommentCreateTime;
        }

        public String getEmployeeMostUsedTaskDetailComment() {
            return employeeMostUsedTaskDetailComment;
        }

        public void setEmployeeMostUsedTaskDetailComment(String employeeMostUsedTaskDetailComment) {
            this.employeeMostUsedTaskDetailComment = employeeMostUsedTaskDetailComment;
        }

        public String getEmployeeMostUsedTaskDetailCommentAttachment() {
            return employeeMostUsedTaskDetailCommentAttachment;
        }

        public void setEmployeeMostUsedTaskDetailCommentAttachment(String employeeMostUsedTaskDetailCommentAttachment) {
            this.employeeMostUsedTaskDetailCommentAttachment = employeeMostUsedTaskDetailCommentAttachment;
        }
    }

