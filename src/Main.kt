fun main() {

    val viewerUser = UserRole.VIEWER;
    val editerUser = UserRole.EDITOR;
    val adminUser = UserRole.ADMIN;


    println("Viwer user has access? ${checkAccessByAccessLevel(viewerUser)}");
    println("Editor user has access? ${checkAccessByAccessLevel(editerUser)}");
    println("Admin user has access? ${checkAccessByAccessLevel(adminUser)}");

    println("Viwer user has access? ${checkAccessByUserRole(viewerUser)}");
    println("Editor user has access? ${checkAccessByUserRole(editerUser)}");
    println("Admin user has access? ${checkAccessByUserRole(adminUser)}");

}



enum class UserRole(var accessLevel:Int){
    ADMIN(10),
    EDITOR(5),
    VIEWER(0),
}


fun checkAccessByAccessLevel(userRole:UserRole):Boolean{
    return userRole.accessLevel >=5
}

fun checkAccessByUserRole(userRole:UserRole):Boolean{
    return when(userRole){
        UserRole.VIEWER->false
        else -> true
    }
}