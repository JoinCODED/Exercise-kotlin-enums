fun main() {
    var hussain = UserRole.ADMIN //1
    var hassan = UserRole.EDITOR //2
    var bader = UserRole.VIEWER //3

    var phone = 555554652


    println("-----------")
    if(checkAccess(bader, 1)){

        println("calling $phone ..")
    }else{
        println("You dont have permission to call $phone!")
    }
    println("-----------")

    println("Printing all roles and their access level..")
    for (role in UserRole.entries) {
        println("${role.name}: Access Level ${role.accessLevel}")
    }
}
    enum class UserRole(val accessLevel: Int){
        ADMIN(1),EDITOR(2), VIEWER(3)
    }

    fun checkAccess(UserRole: UserRole, level: Int): Boolean {
        if (level == UserRole.accessLevel) {
            return true
        }else{
            return false
        }
    }

