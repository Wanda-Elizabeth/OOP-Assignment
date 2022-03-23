fun main(){
  var Lady=Human("wanda",23,50)
    Lady.Eat(20)
    println(Lady.weight)
    Lady.speak("wonder wush yooh!")
    Lady.birthday()
    var person= User("Elizabeth","Wanda","wandawairimu@gmail.com","0792937394","dgdfrwwd")
     println(person.firstname)
    println(person.Email)

}
class Human(var name:String,var age:Int,var weight:Int) {
    fun Eat(foodweight: Int) {
        weight += foodweight
        println("I am eating $foodweight kgs of food")

    }

    fun speak(speech: String) {
        println(speech)
    }

    fun birthday() {
        age += 1
        println(age)

    }
}

  data class User(var firstname:String,var Lastname:String,var Email:String,var Phonenumber:String,var Password:String)


