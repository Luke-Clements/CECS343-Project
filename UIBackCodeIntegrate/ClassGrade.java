package BackCode;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukecjm
 */
public class ClassGrade 
{
    private StringProperty className;
    private StringProperty professorName;
    private StringProperty grade;
    private StringProperty semester;
    private StringProperty schoolName;
    private Assignment assignment;
    
    public ClassGrade()
    {
        //Placeholder Values
        className = new SimpleStringProperty("CECS 343");
        professorName = new SimpleStringProperty("Sharifian");
        grade = new SimpleStringProperty("A");
        semester = new SimpleStringProperty("SPRING18");
        schoolName = new SimpleStringProperty("CSULB");
        assignment = new Assignment();
        
        /*
        className = null;
        professorName = null;
        grade = null;
        semester = null;
        schoolName = null;
        assignment = new Assignment();
        */
    }
    
    //Setters
    public void setName(StringProperty cName){
        className = cName;
    }
    
    public void setProfName(StringProperty pName){
        professorName = pName;
    }
    
    public void setGrade(StringProperty cGrade){
        grade = cGrade;
    }
    
    public void setSemester(StringProperty cSemester){
        semester = cSemester;
    }
    
    public void setSchoolName(StringProperty cSchoolName){
        schoolName = cSchoolName;
    }
    
    //Getters
    public Assignment getAssignment()
    {
        return assignment;
    }
    
    public String getSchoolName()
    {
        return schoolName.get();
    }
    
    public String getSemester()
    {
        return semester.get();
    }
    
    public String getGrade()
    {
        return grade.get();
    }
    
    public String getClassName()
    {
        return className.get();
    }
    
    public String getProfessorName()
    {
        return professorName.get();
    }
}
