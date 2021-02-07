package io.gaurav.kotlin.attendance.model

import java.time.LocalDate
import java.time.LocalDateTime

data class Record(val firstLogin: LocalDateTime, var lastLogin: LocalDateTime?, val date: LocalDate, val empId: Int) {
}