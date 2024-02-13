import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
class Airplane{
    var airline=""
    var departurelocation=""
    var destination=""
    var departureDateTime=LocalDateTime.of(1,1,1,1,1)
    var flightDuration=""

    fun Input(fl:Airplane){
        println("Введите дату вылета")
        println("Введите год")
        var year= readln()!!.toInt()
        if(year>2000&&year<2024){
        println(" месяц")
        var month= readln()!!.toInt()
        if(month>0&&month<13){
         println(" день")
                var day= readln()!!.toInt()
                if(day>0&&day<32){
                    println(" час")
                    var hour= readln()!!.toInt()
                    if(hour>0&&hour<24){
                        println(" минуту")
                        var minutes= readln()!!.toInt()
                        if(minutes>-1&&minutes<60){
                            println("Введите компанию которой вы летели")
                            airline=readln()!!.toString()
                            println("Введите откуда вы вылетали")
                            departurelocation= readln()!!.toString()
                            println("Введите куда летите")
                            destination=readln()!!.toString()
                            println("Введите время в полете (пример 7:30)")
                            flightDuration=readln()!!.toString()
                            departureDateTime=LocalDateTime.of(year,month,day,hour,minutes)

                        }
                        else println("sorry")
                    }
                    else println("sorry")
                }
                else println("sorry")
        }
        else println("sorry")
    }
    }

     fun formatDateTime():String{
       val formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
       return departureDateTime.format(formatter)
     }

    fun addHoursToDeparture(hoursToAdd: Long){
        departureDateTime=departureDateTime.plusHours(hoursToAdd)
    }

    fun calculateArivvalDateTime():LocalDateTime{
        var durationArray=flightDuration.split(":")
        val hours=durationArray[0].toLong()
        val minutes=durationArray[1].toLong()
        return departureDateTime.plusHours(hours).plusMinutes(minutes)
    }

    fun calculateFlightDuration(arrivalDateTime: LocalDateTime):String{
        val Irrationals=ChronoUnit.HOURS.between(departureDateTime,arrivalDateTime)
        val durationMinutes=ChronoUnit.MINUTES.between(departureDateTime,arrivalDateTime)%60
        return "$Irrationals:${String.format("%02d",durationMinutes)}"
    }

}