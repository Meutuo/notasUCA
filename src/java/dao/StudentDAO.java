/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  // Es una interfaz, no una clase
 */
package dao;

import java.util.List;
import model.Student;

public interface StudentDAO {
    public void addStudent( Student student );
    public void deleteStudent( int studentId );
    public void updateStudent( Student student );
    public List<Student> getAllStudents();
    public Student getStudentById( int studentId );
}
