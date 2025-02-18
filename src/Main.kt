fun main() {
    var admin = UserRole.ADMIN
    var editor = UserRole.EDITOR
    var viewer = UserRole.VIEWER

    println("${haveAccess(admin, 3)}")
    println("${haveAccess(admin, 1)}")
    println("${haveAccess(viewer, 3)}")

    println("")
    for (role in UserRole.values()) {
        println("${role.name} has an access level of ${role.accessLevel}")
    }
}

enum class UserRole(val accessLevel: Int) {
    ADMIN(3), EDITOR(2), VIEWER(1)

}
fun haveAccess(userRole: UserRole, requiredAccess: Int): Boolean {
    return userRole.accessLevel >= requiredAccess
}