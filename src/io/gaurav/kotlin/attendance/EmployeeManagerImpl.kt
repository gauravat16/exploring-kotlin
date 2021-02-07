package io.gaurav.kotlin.attendance

import io.gaurav.kotlin.attendance.model.Employee

class EmployeeManagerImpl : EmployeeManager {

    private val empRecords: MutableMap<Int, Employee> = HashMap()

    override fun recordEmployee(employee: Employee) {
        empRecords.putIfAbsent(employee.id, employee)
    }

    override fun getEmployee(empId: Int): Employee? {
        return empRecords[empId]
    }
}