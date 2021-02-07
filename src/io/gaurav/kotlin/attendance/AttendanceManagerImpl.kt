package io.gaurav.kotlin.attendance

import io.gaurav.kotlin.attendance.model.Employee
import io.gaurav.kotlin.attendance.model.Record
import java.lang.IllegalArgumentException
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * Implementation that only supports shifts that start and end in a single day.
 */
class AttendanceManagerImpl(val employeeManager: EmployeeManager) : AttendanceManager {

    private val dailyRecord: MutableMap<String, MutableMap<Employee, Record>> = HashMap()

    override fun recordFirstLoginTime(empId: Int, dateTime: LocalDateTime) {
        val employee = employeeManager.getEmployee(empId) ?: throw IllegalArgumentException("No such emp found!")

        val date = getDateString(dateTime.toLocalDate())
        dailyRecord.putIfAbsent(date, HashMap())
        dailyRecord[date]?.put(employee, Record(dateTime, null, dateTime.toLocalDate(), empId))
    }

    override fun recordEndLoginTime(empId: Int, dateTime: LocalDateTime) {
        val employee = employeeManager.getEmployee(empId) ?: throw IllegalArgumentException("No such emp found!")

        val date = getDateString(dateTime.toLocalDate())
        if (dailyRecord.containsKey(date)) {
            dailyRecord[date]?.get(employee)?.lastLogin = dateTime
        } else {
            throw IllegalArgumentException("Emp has not yet logged in!")
        }
    }

    override fun getRecordsForDate(date: LocalDate): MutableMap<Employee, Record>? {
        return dailyRecord[date.toString()]
    }

    override fun getRecordsForDateAndEmployee(date: LocalDate, empId: Int): Record? {
        val employee = employeeManager.getEmployee(empId) ?: throw IllegalArgumentException("No such emp found!")
        return dailyRecord[date.toString()]?.get(employee)
    }

    private fun getDateString(date: LocalDate): String {
        return date.format(DateTimeFormatter.ISO_DATE)
    }
}