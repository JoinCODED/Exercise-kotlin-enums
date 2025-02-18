enum class UserRole(val accessLevel: Int) {
    ADMIN(2), EDITOR(3), VIEWER(1)
}
    fun UserRole.checkAccess(user: UserRole): Int{
        return user.accessLevel
    }
