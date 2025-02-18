enum class UserRole(val accessLevel: Int) {
    ADMIN(3), EDITOR(2), VIEWER(1)
}

fun main() {
    UserRole.values().forEach {
        println("${it.name} , Access level: ${it.accessLevel}")
    }
}
