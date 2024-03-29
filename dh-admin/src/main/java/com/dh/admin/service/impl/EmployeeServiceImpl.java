package com.dh.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dh.admin.config.AsyncTaskExecutorConfig;
import com.dh.admin.entity.Employee;
import com.dh.admin.mapper.EmployeeMapper;
import com.dh.admin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> listEmployee() {
        return employeeMapper.selectList(null);
    }

    @Async(value = AsyncTaskExecutorConfig.EXECUTOR_SERVICE)
    @Override
    public void testAsyncTask() {
        System.out.println("This is async task and thread name is " + Thread.currentThread().getName());
    }
}
