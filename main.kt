

fun main() {
    val name = System.getenv("USERNAME")
    val favouriteLanguage = System.getenv("LANGUAGE")



    when {
        name.isNotEmpty() && favouriteLanguage.isNotEmpty() -> {
            println("Hello, $name! Your favourite language is $favouriteLanguage")
        }
        name.isNotEmpty() -> {
            println("Hello, $name!")
        }
        else -> {
            println("Hello, World!")
        }
    }
}
