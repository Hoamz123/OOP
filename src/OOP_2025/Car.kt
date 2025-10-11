package OOP_2025

class Car(private val name : String,private val type : Int){

    public fun check() = type > 100

    override fun toString(): String {
        return "$name $type"
    }

}