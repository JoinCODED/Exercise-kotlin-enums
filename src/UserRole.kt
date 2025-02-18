enum class UserRole(var level :Int) {
    ADMIN(1), EDITOR(2), VIEWER(3)
}

fun isSufficientLevel(userRole :UserRole , accessLevel :Int ):Boolean
{

    when {
      return  accessLevel == userRole.level -> true
        else -> false
    }
}