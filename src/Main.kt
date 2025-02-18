
fun main() {
    val adminRole = UserRole.ADMIN
    val editorRole = UserRole.EDITOR
    val viewerRole = UserRole.VIEWER

    // Test with the hasAccess function
    println("Admin has access (level 1): ${checkAccess(adminRole, 1)}")
    println("Editor has access (level 2): ${checkAccess(editorRole, 3)}") //Added wrong level to see the output
    println("Viewer has access (level 3): ${checkAccess(viewerRole, 3)}")

    listAllRoles()
}

enum class UserRole(val accessLevel: Int) {
    ADMIN(1),
    EDITOR(2),
    VIEWER(3)
}

fun checkAccess(userRole: UserRole, requiredLevel: Int): Boolean {
    return userRole.accessLevel >= requiredLevel
}

// List All Roles
fun listAllRoles() {
    // Iterate over all values in UserRole enum
    for (role in UserRole.values()) {
        println("Role: ${role.name}, Access Level: ${role.accessLevel}")
    }
}
