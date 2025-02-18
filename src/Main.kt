fun main() {
    val someRandomDude: UserRole = UserRole.VIEWER
    val myBoss: UserRole = UserRole.EDITOR
    val superUser: UserRole = UserRole.ADMIN

    println("Random dudes have perms: ${hasEditPerm(someRandomDude)}")
    println("Editors have perms: ${hasEditPerm(myBoss)}")
    println("Admins have perms: ${hasEditPerm(superUser)}")

    println("Available permissions:")
    UserRole.entries.forEach { println("\t[-] Permission Level: ${it.name} - Access Level ${it.accessLevel}") }
}

enum class UserRole(val accessLevel: Int) {
    ADMIN( 1),
    EDITOR(2),
    VIEWER(3)
}

fun hasEditPerm(role: UserRole): Boolean {
    return when (role) {
        UserRole.VIEWER -> false
        else -> true
    }
}