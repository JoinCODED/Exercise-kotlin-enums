enum class UserRole(val accessLevel: Int) {
    ADMIN(1),
    EDITOR(2),
    VIEWER(3)
}

fun checkUserRole(role: UserRole, level: Int): Boolean {
    return role.accessLevel == level
}

fun main() {
    val bader = UserRole.ADMIN
    println(checkUserRole(bader, 2))

    println("\nAll Roles:")
    for (role in UserRole.entries) {
        println("${role.name} has access level: ${role.accessLevel}")
    }
}
