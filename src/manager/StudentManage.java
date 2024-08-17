package manager;

import model.Student;
import saveData.ReadAndWriteStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements IManager <Student>{
    private List<Student> students;
    ReadAndWriteStudent readAndWriteStudent = new ReadAndWriteStudent();
    public StudentManage() {
        this.students = this.readAndWriteStudent.readData();
    }


    @Override
    public void add(Student student) {
        this.students.add(student);
        readAndWriteStudent.writeData(this.students);

    }

    @Override
    public void update(int id, Student student) {
        int index = this.students.indexOf(student);
      this.students.set(index, student);
      readAndWriteStudent.writeData(this.students);
    }

    @Override
    public void delete(int id) {
        int index = this.students.indexOf(id);
        this.students.remove(index);
        readAndWriteStudent.writeData(this.students);
    }

    @Override
    public List<Student> getAll() {
        this.students = this.readAndWriteStudent.readData();
        return this.students;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
