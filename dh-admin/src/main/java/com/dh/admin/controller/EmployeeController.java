package com.dh.admin.controller;

import com.dh.admin.audit.Audit;
import com.dh.admin.service.EmployeeService;
import com.dh.common.api.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    @Audit(description = "list users", operationType = "ListUsers")
    public CommonResult listUsers() {
        return CommonResult.success(employeeService.listEmployee());
    }

    @GetMapping("/test")
    public void test() {
        employeeService.testAsyncTask();
    }

    @GetMapping("/local")
    public CommonResult local() {
        return CommonResult.success("test");
    }
}
