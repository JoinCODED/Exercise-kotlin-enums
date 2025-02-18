fun main() {
    val admin = UserRole.ADMIN

    fun checkAccessLevel(role: UserRole) {
        if (role.accessLevel > 20) {
            println("I am an admin")
        } else if (role.accessLevel > 10) {
            println("I am an editor")
        } else {
            println("viewer")
        }
    }

    checkAccessLevel(admin)
    println(UserRole.entries.forEach { println("${it.name} my access level ${it.ordinal}") })
}