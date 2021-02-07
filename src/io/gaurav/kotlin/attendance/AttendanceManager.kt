package io.gaurav.kotlin.attendance

import io.gaurav.kotlin.attendance.model.Employee
import io.gaurav.kotlin.attendance.model.Record
import java.time.LocalDate
import java.time.LocalDateTime

interface AttendanceManager {

    fun recordFirstLoginTime(empId: Int, dateTime: LocalDateTime)

    fun recordEndLoginTime(empId: Int, dateTime: LocalDateTime)

    fun getRecordsForDate(date: LocalDate) : MutableMap<Employee, Record>?

    fun getRecordsForDateAndEmployee(date: LocalDate, empId: Int) : Record?

}