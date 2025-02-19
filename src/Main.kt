package userRole
fun main() {
    val humoud = UserRole.ADMIN
    val abdullah = UserRole.EDITOR
    val ahmed = UserRole.VIEWER

    fun access(user: UserRole) {
        when(user) {
            UserRole.ADMIN -> println("You're an admin do whatever you want")
            UserRole.EDITOR -> println("You're an editor you have limited privileges ")
            UserRole.VIEWER -> println("You cannot alter anything.")
        }
    }

    access(humoud)
    access(abdullah)
    access(ahmed)

    println("-----")

    // UserRole.values() also works but intellij is recommending entries for iterating enums
    for (role in UserRole.entries) {
        println("${role.name} - ${role.accessLevel}")
    }
}