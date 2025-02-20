enum class UserRole(val accessLevel: Int) {
    ADMIN(30),
    EDITOR(20),
    VIEWER(0)
}