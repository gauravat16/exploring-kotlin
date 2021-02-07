package io.gaurav.kotlin.attendance

import io.gaurav.kotlin.attendance.model.Employee
import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val employeeManager = EmployeeManagerImpl()
    val attendanceManager = AttendanceManagerImpl(employeeManager)

    employeeManager.recordEmployee(Employee("Gaurav", "Sharma", 1))
    employeeManager.recordEmployee(Employee("Sheetal", "Sharma", 2))
    employeeManager.recordEmployee(Employee("Devesh", "Dubey", 3))


    attendanceManager.recordFirstLoginTime(1, LocalDateTime.of(2021, 1, 22, 7, 0))
    attendanceManager.recordEndLoginTime(1, LocalDateTime.of(2021, 1, 22, 17, 0))

    attendanceManager.recordFirstLoginTime(2, LocalDateTime.of(2021, 1, 22, 8, 0))
    attendanceManager.recordEndLoginTime(2, LocalDateTime.of(2021, 1, 22, 18, 0))

    println(attendanceManager.getRecordsForDate(LocalDate.of(2021, 1, 22)))
    println(attendanceManager.getRecordsForDateAndEmployee(LocalDate.of(2021, 1, 22), 1))


    attendanceManager.recordEndLoginTime(3, LocalDateTime.now());


}