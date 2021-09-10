fun TestSetAndListMethods() {
    val attendedAndroidCourse: List<String> = listOf("Alex", "Fran", "Gui", "Jessica")
    val attendedJavaCourse: List<String> = listOf("Alex", "Jessica", "bruno'")

    println(attendedJavaCourse[0])

    val attendedAboth = mutableListOf<String>()

    attendedAboth.addAll(attendedAndroidCourse)
    attendedAboth.addAll(attendedJavaCourse)

    println(attendedAboth)

    val listTestWithSum: Set<String> = (attendedAndroidCourse + attendedJavaCourse).toSet()

    println(listTestWithSum)


    val fruits = mutableSetOf<String>("maça", "pessego", "uva", "laranja")
    val fruits2 = mutableSetOf<String>("kiwi", "manga", "uva", "laranja", "graviola")

    val testSet = fruits + fruits2
    testSet.forEach() {
        println(it)
    }
    println(fruits + fruits2)
    println(fruits union fruits2)

    println(fruits - fruits2)
    println(fruits subtract fruits2)

    println(fruits intersect fruits2)
}