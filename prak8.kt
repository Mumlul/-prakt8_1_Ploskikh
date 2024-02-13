import java.time.LocalDateTime
fun main() = try{
var fl=Airplane();
    fl.Input(fl)
    println("Авиакомпания:${fl.airline}\nМесто отбытия:${fl.departurelocation}\nМесто прыбытия:${fl.destination}")
    var formattedDateTime=fl.formatDateTime()
    println("Дата и время :$formattedDateTime ")
    println("Была ли у вас задержка самолета? 1-да 2-нет")
    if(readln()!!.toInt()==1){
        println("как долго у вас была задержка в часаха")
        var kk=readln()!!.toLong()
        if(kk>0&&kk<30){
            fl.addHoursToDeparture(kk)
        }
        else println("sorry")
    }
    else println("OK")
    var hdp=fl.calculateArivvalDateTime()
    println("Время прибытия:$hdp")
}catch (e: Exception){
    println("${e.message}")
}
