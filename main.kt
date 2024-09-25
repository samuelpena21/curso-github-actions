

fun main() {
    val name = System.getenv("USERNAME")
    val favouriteLanguage = System.getenv("LANGUAGE")



    when {
        name != null && favouriteLanguage != null -> {
            println("Hello, $name! Your favourite language is $favouriteLanguage")
        }
        name != null -> {
            println("Hello, $name!")
        }
        else -> {
            println("Hello, World!")
        }
    }
}
