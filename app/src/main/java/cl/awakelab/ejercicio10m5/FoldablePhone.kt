package cl.awakelab.ejercicio10m5

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {
    var isFoldable: Boolean = false
    override fun switchOn() {
        if (!isFoldable) {
            isScreenLightOn = true
        }
    }
    fun abrir(){
        isFoldable = true
    }
    fun cerrar(){
        isFoldable = false
    }
}

fun main(){
    val foldable = FoldablePhone()
    println(foldable.isFoldable)
    foldable.abrir()
    println(foldable.isFoldable)
}
