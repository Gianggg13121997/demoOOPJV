package saveData;

import model.Clazz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteClazz {
    private File file = new File("database/clazz.csv");

    public void writeData(List<Clazz> clazzList) {
        try {
            String data = "";
            for (Clazz clazz : clazzList) {
                data += clazz.getId() + "," + clazz.getName() + "," + clazz.getGrade();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Clazz> readData() {
        List<Clazz> clazzList = new ArrayList<Clazz>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                Clazz clazz = new Clazz(Integer.parseInt(str[0]), str[1], str[2]);
                clazzList.add(clazz);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clazzList;
    }
}
