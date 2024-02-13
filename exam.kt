import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class Exam {
    var name=""
    var lesson=""
    var date= LocalDateTime.of(1,1,1,1,1)
    var points=0
    var grade=0
    var army=""

    fun Input(ex: Exam){
        println("Name")
        name=readln()
        println("lesson")
        lesson=readln()
        println("date/time(yyyy MM dd)")
        val formatter = DateTimeFormatter.ofPattern("yyyy MM dd")
        date = LocalDate.parse(readln(), formatter).atStartOfDay()
        println("Введите полученные баллы")
        points= readln()!!.toInt()
    }
    fun Grade_mm(){
        when{
            points>80->grade=5
            points<=80&&points>60->grade=4
            points<=60&&points>40->grade=3
            points<=40->grade=2;
        }

    }

    fun Passed():Boolean{
        return points>=60
    }

    fun improveGrade(){
        println("Ходил ли он на доп занятия?1-yes 2-no")
        if(readln()!!.toInt()==1)
        points+=5
    }


    fun output(){
        println("$name\n$lesson\n$date\n$grade")
        if(grade==2){
            army="yes"
            println("Army:$army")
        }
        else{
            army="no"
            println("Army:$army")
        }
    }
}