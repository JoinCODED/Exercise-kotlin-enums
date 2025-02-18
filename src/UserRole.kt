enum class UserRole(var accessLevel: Int) {
    ADMIN(accessLevel = 25), EDITOR(accessLevel = 10), VIEWER(accessLevel = 0)
}