package service;

import dao.SmartphoneDao;
import entity.Smartphone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SmartphoneService {

    @Autowired(required = false)
    private List<SmartphoneDao> smartphoneList = new ArrayList<SmartphoneDao>();

    public void save(Smartphone smartphone) {
        if(smartphoneList.isEmpty())
            return;
        for(SmartphoneDao smart: smartphoneList)
            smart.save(smartphone);
    }
}