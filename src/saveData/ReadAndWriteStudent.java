package saveData;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    private File file = new File("database/student.txt");
    public void writeData(List<Student> StudentList){
        try {
            String data = "";
            for (Student student : StudentList) {
                data = data + student.getId() + "," + student.getName() + "," + student.getGender() + "," + student.getScore() + "," + student.getConduct() + "\n";
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<Student> readData(){
        List<Student> StudentList = new ArrayList<Student>();
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!=null){
                String[] data = line.split(",");
                Student student = new Student(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),data[3],data[4],Integer.parseInt(data[5]));
                StudentList.add(student);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return StudentList;
    }

}
