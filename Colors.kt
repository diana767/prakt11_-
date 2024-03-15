enum class Colors (val rgb: Int){
    Красный(0xFF0000), Оранжевый(0xFF7F00), Жёлтый(0xFFFF00), Зелёный(0x00FF00), Голубой(0x0000FF), Синий(0x000080), Фиолетовый(0x800080);
    fun NColors(){
        var n: Int;
        while (true){
            println("Введите какой цвет радуги хотите от 1 до 7:")
            n = readln()!!.toInt()
            if(n >= 0 && n <= 7)
            {
                when(n){
                    1 -> println(Colors.Красный)
                    2 -> println(Colors.Оранжевый)
                    3 -> println(Colors.Жёлтый)
                    4 -> println(Colors.Зелёный)
                    5 -> println(Colors.Голубой)
                    6 -> println(Colors.Синий)
                    7 -> println(Colors.Фиолетовый)
                }
                break
            }
        }
    }
    fun CodeColors(){
        var n: String;
        while (true){
            println("Введите какой код радуги ходите?")
            n = readln().toString()
            when(n){
                "Красный" -> {
                    val Color1: Colors = Colors.Красный
                    println(Color1.rgb)
                    break
                }
                "Оранжевый" -> {
                    val Color2: Colors = Colors.Оранжевый
                    println(Color2.rgb)
                    break
                }
                "Жёлтый" -> {
                    val Color3: Colors = Colors.Жёлтый
                    println(Color3.rgb)
                    break
                }
                "Зелёный" -> {
                    val Color4: Colors = Colors.Зелёный
                    println(Color4.rgb)
                    break
                }
                "Голубой" -> {
                    val Color5: Colors = Colors.Голубой
                    println(Color5.rgb)
                    break
                }
                "Синий" -> {
                    val Color6: Colors = Colors.Синий
                    println(Color6.rgb)
                    break
                }
                "Фиолетовый" -> {
                    val Color7: Colors = Colors.Фиолетовый
                    println(Color7.rgb)
                    break
                }
            }
        }
    }
    fun Random():Colors {
        println("Случайный цвет")
        return values().random()
    }
    fun AllColors() : List<Colors>{
        println("Цвета радуги:")
        return values().toList()
    }
}