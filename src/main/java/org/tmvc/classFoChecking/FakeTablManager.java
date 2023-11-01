package org.tmvc.classFoChecking;

import com.mchange.v1.cachedstore.CachedStore;
import org.tmvc.entity.Manager;
import org.tmvc.entity.enums.ManagerStatus;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FakeTablManager {
    private Map<Integer,Manager> fake = new HashMap<>();

    public FakeTablManager() {

        Manager manager1 = new Manager().builder().id(1).firstName("Aron").lastName("Galpern").status(ManagerStatus.ACTIVE)
                .createdAt(LocalDate.of(1998, 7, 7).atStartOfDay())
                .updatedAt(LocalDate.of(2023, 10, 27).atStartOfDay()).build();
        fake.put(1, manager1);
        Manager manager2 = new Manager().builder().id(2).firstName("Iakir").lastName("Voiser").status(ManagerStatus.ACTIVE)
                .createdAt(LocalDate.of(1998, 7, 7).atStartOfDay())
                .build();
        fake.put(2, manager2);
        Manager manager3 = new Manager().builder().id(3).firstName("Iakir").lastName("Voiser").status(ManagerStatus.NOT_ACTIVE)
                .createdAt(LocalDate.of(1998, 7, 7).atStartOfDay())
                .updatedAt(LocalDate.of(2023, 10, 27).atStartOfDay()).build();
        fake.put(3, manager3);
        Manager manager4 = new Manager().builder().id(4).firstName("Iakir").lastName("Voiser").status(ManagerStatus.BUSINESS_TRIP)
                .createdAt(LocalDate.of(1920, 01, 20).atStartOfDay()).build();
        fake.put(4, manager4);
        Manager manager5 = new Manager().builder().id(5).firstName("Iakir").lastName("Voiser").status(ManagerStatus.BUSINESS_TRIP)
                .createdAt(LocalDate.of(1998, 7, 7).atStartOfDay())
                .updatedAt(LocalDate.of(2023, 10, 27).atStartOfDay()).build();
        fake.put(5, manager5);
        Manager manager6 = new Manager().builder().id(6).firstName("Iakir").lastName("Voiser").status(ManagerStatus.PENSION)
                .createdAt(LocalDate.of(1998, 7, 7).atStartOfDay())
                .updatedAt(LocalDate.of(2023, 10, 27).atStartOfDay()).build();
        fake.put(6, manager6);
    }



    public  Manager getManajerById(int id){
        Manager result = fake.get(id);
        return  result;
    }

//    public list<Manager>

}
