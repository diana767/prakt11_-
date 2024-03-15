fun main(args: Array<String>) {
    var answer: String
    while(true){
        println("выберите класс с которым хотите работать: День или Цвет?")
        answer = readln().toString()
        if(answer == "Цвет" || answer == "День") break
    }
    when(answer){
        "Цвет" ->{
            var Color: Colors = Colors.Голубой
            println(Color.AllColors())
            Color.NColors()
            println(Color.Random())
            Color.CodeColors()
        }
        "День" ->{
            var Day: Days = Days.Пятница
            Day.NumberDays()
            Day.WeekWorks()
            println(Day.PastDay())
            println(Day.Random())
        }
    }
}