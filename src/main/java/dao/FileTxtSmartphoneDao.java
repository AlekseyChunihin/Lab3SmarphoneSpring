package dao;

import dao.SmartphoneDao;
import java.io.*;
import java.util.Map;

import entity.Smartphone;
import org.springframework.stereotype.Component;

@Component
public class FileTxtSmartphoneDao implements SmartphoneDao {

    @Override
    public void save(Smartphone smartphone) {
        try(FileWriter writer = new FileWriter("smartphones.txt", false))
        {
            writer.write("Модель: "+smartphone.getModel()+"\n");
            writer.write("Название: "+smartphone.getName()+"\n");
            writer.write("Процессор: "+smartphone.getProcessor()+"\n");
            writer.write("Версия прог. обеспечения: "+smartphone.getVersionOS()+"\n");
            writer.write("Память: "+smartphone.getMemory()+"\n");
            writer.write("Диагональ: "+smartphone.getDiagonal()+"\n");
            writer.write("Стоимость: "+smartphone.getPrice()+"\n");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}