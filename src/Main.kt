fun main() {
    println("Hello World!")
    val adminUserRole = UserRole.ADMIN
    val userRoleViewer = UserRole.VIEWER

//    var dataBaseActions = mutableListOf(1,2,3)
    println(checkByUserRole(userRoleViewer))
    println(checkByUserRole(adminUserRole))
    println("Can you view this document: ${checkAccessByAccessLevel(userRoleViewer)}")
    println("Can you view this document: ${checkAccessByAccessLevel(adminUserRole)} the user is ${adminUserRole.name.toString().lowercase()}")

//    println(editDB.get(0))
//    if (editDB.get(0) == 1 && checkAccessLevel(adminUserRole)){
//        println("You can edit the DB")
//    }



}

fun checkByUserRole( userRole: UserRole): Boolean{
    return when(userRole){
        UserRole.VIEWER -> false
        else -> true
    }
}

fun checkAccessByAccessLevel(userRole:UserRole):Boolean{
    return userRole.accessLevel >=5
}
