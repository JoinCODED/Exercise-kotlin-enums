enum class UserRole(val accessLevel:Int) {
    ADMIN(1),
    EDITOR(2),
    VIEWER(3)


}

fun main(){

    fun taskAccess(user: UserRole){
        when(user){
            UserRole.ADMIN -> println("Admin have the access to the task.")
            UserRole.EDITOR -> println("Editor have the access to the task.")
            UserRole.VIEWER -> println("Viewer doesn't have the access to the task.")

        }
    }

    taskAccess(UserRole.ADMIN)
    taskAccess(UserRole.VIEWER)
    taskAccess(UserRole.EDITOR)

    // iterate over all roles
    for (role in UserRole.values()){
        println("Role: ${role.name}, Access leve: ${role.accessLevel}")
    }

}