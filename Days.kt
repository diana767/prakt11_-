enum class Days {
    Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье;
    fun NumberDays(){
        var n: Int
        while(true) {
            println("введите номер дня недели")
            n = readln()!!.toInt()
            if(n>=1 && n<=7)break
        }
        when (n){
            1-> println(Days.Понедельник)
            2-> println(Days.Вторник)
            3-> println(Days.Среда)
            4-> println(Days.Четверг)
            5-> println(Days.Пятница)
            6-> println(Days.Суббота)
            7-> println(Days.Воскресенье)
            else->println("error")

        }
    }
    fun Random() : Days{
        println("Случайный день недели")
        return values().random()
    }
    fun PastDay(){
        var day:String
        println("введи день недели")
        while(true){
            try {
                day=Days.valueOf(readln()!!).toString()
                break
            }
            catch (e: Exception){
                println("ошибка введи заново")
            }
        }
        val days=Days.values().toList()
        for (i in 0..6){
            if(day=="понедельник"){
                println("предыдущий день воскресенье")
            }
            else if(day==days[i].toString()){
                println("предыдущий день ${days[i-1]}")
                break
            }
        }
    }
    fun WeekWorks(){
        var n: Int
        while(true){
            println("Введите номер дня недели")
            n = readln()!!.toInt()
            if(n>=1 && n<=7){
                break
            }
        }
        when(n){
            1->println("${Days.Понедельник} - Рабочий день")
            2->println("${Days.Вторник} - Рабочий день")
            3->println("${Days.Среда} - Рабочий день")
            4->println("${Days.Четверг} - Рабочий день")
            5->println("${Days.Пятница} - Рабочий день")
            6->println("${Days.Суббота} - Выходной день")
            7->println("${Days.Воскресенье} - Выходной день")
        }
    }
}