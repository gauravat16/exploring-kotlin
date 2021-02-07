package io.gaurav.kotlin.attendance

import io.gaurav.kotlin.attendance.model.Employee

interface EmployeeManager {

    fun recordEmployee(employee: Employee)

    fun getEmployee(empId: Int): Employee?
}