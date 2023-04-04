package com.zaporozhskyi.micronautdemo.employee;

import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class EmployeeServiceImpl implements EmployeeService {

    private Map<Long, EmployeeDto> dummyDataStore;

    @Override
    public EmployeeDto findEmployee(long id) {
        return dummyDataStore.get(id);
    }

    @PostConstruct
    void initDataStore() {
        dummyDataStore = new HashMap<>();
        dummyDataStore.put(1L, EmployeeDto.builder().name("Artem").build());
        dummyDataStore.put(2L, EmployeeDto.builder().name("Jens").build());
        dummyDataStore.put(3L, EmployeeDto.builder().name("Mats").build());
        dummyDataStore.put(4L, EmployeeDto.builder().name("Marko").build());
        dummyDataStore.put(5L, EmployeeDto.builder().name("David").build());
    }
}
