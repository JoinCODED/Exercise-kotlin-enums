fun main() {
    var user = UserRole.VIEWER
    checkAccessLevel(user)
    for (user in UserRole.values()) {
        println("userName: ${user.name}, accessLevel: ${user.accessLevel}")
    }
}
enum class UserRole(val accessLevel: Int) {
    ADMIN(3), EDITOR(2), VIEWER(1)
}

fun checkAccessLevel(userRole: UserRole) {
    if (userRole.accessLevel == 3) println("User has the required access level") else println("User does not have the required access level")
}