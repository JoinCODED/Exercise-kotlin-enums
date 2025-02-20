fun main() {

    val adminRole = UserRole.ADMIN
    val editorRole = UserRole.EDITOR
    val viewerRole = UserRole.VIEWER

    println("Role: ${adminRole}")
    println("Role: ${editorRole}")
    println("Role: ${viewerRole}")

    println("\nAll roles and their access levels:")
    for (role in UserRole.values()) {
        println("${role.name}: Access Level = ${role.accessLevel}")
    }

}
enum class UserRole (val accessLevel:Int) {
    ADMIN(1),
    EDITOR(2),
    VIEWER(3)
}
fun checkAccessLevel(userRole: UserRole, requiredAccessLevel: Int): Boolean {
    return userRole.accessLevel >= requiredAccessLevel


}