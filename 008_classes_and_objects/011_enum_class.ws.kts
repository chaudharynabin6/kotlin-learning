enum class Direction {
    NORTH, SOUTH, WEST, EAST
}


Direction.EAST
Direction.WEST


// https://blog.logrocket.com/kotlin-enum-classes-complete-guide/
//enum class Day(val dayOfWeek: Int) {
//    MONDAY(1),
//    TUESDAY(2),
//    WEDNESDAY(3),
//    THURSDAY(4),
//    FRIDAY(5),
//    SATURDAY(6),
//    SUNDAY(7)
//}
//
//for (day in Day.values())
//    println("[${day.ordinal}] -> ${day.name} (${day.dayOfWeek}^ day of the week)")
//
//Day.MONDAY.ordinal


//Using anonymous classes to define enum constants

enum class DAY {
    MONDAY {
        override fun nextDay() = TUESDAY
    },
    TUESDAY {
        override fun nextDay() = WEDNESDAY
    },
    WEDNESDAY {
        override fun nextDay() = THURSDAY
    },
    THURSDAY {
        override fun nextDay() = FRIDAY
    },
    FRIDAY {
        override fun nextDay() = SATURDAY
    },
    SATURDAY {
        override fun nextDay() = SUNDAY
    },
    SUNDAY {
        override fun nextDay() = MONDAY
    };

    abstract fun nextDay(): DAY
}

DAY.FRIDAY.nextDay()



//Enums and when
enum class Day3 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun main (currentDay: Day3) {
    when (currentDay) {
        Day3.MONDAY -> work()
        Day3.TUESDAY -> work()
        Day3.WEDNESDAY -> work()
        Day3.THURSDAY -> work()
        Day3.FRIDAY -> work()
        Day3.SATURDAY -> rest()
        Day3.SUNDAY -> rest()
    }
}

fun work() {
    println("Working")
}

fun rest() {
    println("Resting")
}

main(Day3.MONDAY)