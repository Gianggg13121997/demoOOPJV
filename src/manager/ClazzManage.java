package manager;

import model.Clazz;
import saveData.ReadAndWriteClazz;


import java.util.List;

public class ClazzManage extends Clazz implements IManager<Clazz> {
    private List<Clazz> clazzList;
    ReadAndWriteClazz readAndWriteClazz = new ReadAndWriteClazz();



    public void add(Clazz clazz) {
        clazzList.add(clazz);
        readAndWriteClazz.writeData(clazzList);

    }


    @Override
    public void update(int id, Clazz clazzManage) {
        int index = clazzList.indexOf(clazzManage);
        clazzList.set(index, clazzList.get(index));
        readAndWriteClazz.writeData(clazzList);

    }

    @Override
    public void delete(int id) {
        int index = clazzList.indexOf(clazzList.get(id));
        clazzList.remove(index);
        readAndWriteClazz.writeData(clazzList);

    }

    @Override
    public List<Clazz> getAll() {
        this.clazzList = readAndWriteClazz.readData();
        return clazzList;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < clazzList.size(); i++) {
            if (clazzList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
