fun main() {
    var admin:UserRole = UserRole.ADMIN
    var editor:UserRole = UserRole.EDITOR
    var viewer: UserRole = UserRole.VIEWER




    val requiredLevel = 2

    println("${admin.name} has access: ${hasAccess(admin, requiredLevel)}")
    println("${editor.name} has access: ${hasAccess(editor, requiredLevel)}")
    println("${viewer.name} has access: ${hasAccess(viewer, requiredLevel)}")

    println("\nAll User Roles and Access Levels:")

    for (role in UserRole.values()) {
        println("${role.name} - Access Level: ${role.accessLevel}")
    }


}



fun hasAccess(userRole: UserRole, requiredLevel: Int): Boolean {
    return userRole.accessLevel >= requiredLevel
}
