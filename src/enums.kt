enum class UserRole(val accessLevel: Int) {
    ADMIN(3),
    EDITOR(2),
    VIEWER(1);

    fun canEdit(): Boolean = this.accessLevel >= 2
}

fun main() {
    val roles = listOf(UserRole.ADMIN, UserRole.EDITOR, UserRole.VIEWER)
    for (role in roles) {
        println("Can you edit?: ${role.canEdit()}")
    }

}