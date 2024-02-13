fun main(){
    try{
        var ex=Exam()
        ex.Input(ex)
        ex.improveGrade()
        ex.Grade_mm()
        ex.output()
        println("Сдал:${ex.Passed()}")
    }catch(e:Exception){
        println("sorry")
    }

}
