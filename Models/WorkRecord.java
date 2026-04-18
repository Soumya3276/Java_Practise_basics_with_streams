package Models;

import java.util.Arrays;
import java.util.List;

public class WorkRecord {
    private String empName;
    private String dept;
    
    public WorkRecord(String empName, String dept) {
        this.empName = empName;
        this.dept = dept;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    public static List<WorkRecord> workRecList(){
        List<WorkRecord> workRecs = Arrays.asList(
            // John Smith working in multiple departments
            new WorkRecord("John Smith", "IT"),
            new WorkRecord("John Smith", "HR"),
            new WorkRecord("John Smith", "Management"),
            new WorkRecord("John Smith", "Sales"),
            
            // Sarah Johnson working in multiple departments
            new WorkRecord("Sarah Johnson", "Sales"),
            new WorkRecord("Sarah Johnson", "Marketing"),
            new WorkRecord("Sarah Johnson", "Business Development"),
            new WorkRecord("Sarah Johnson", "HR"),
            
            // Mike Davis working in multiple departments
            new WorkRecord("Mike Davis", "Finance"),
            new WorkRecord("Mike Davis", "Operations"),
            
            // Emily Brown working in multiple departments
            new WorkRecord("Emily Brown", "Quality Assurance"),
            new WorkRecord("Emily Brown", "Testing"),
            new WorkRecord("Emily Brown", "Process Improvement"),
            
            // David Wilson working in multiple departments
            new WorkRecord("David Wilson", "Operations"),
            new WorkRecord("David Wilson", "Logistics")
        );
        return workRecs;
    }
}
