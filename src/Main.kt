import UserRole

fun checkAccessLevel(user: UserRole){
    if (user.accessLevel==0){
        println("You are an admin. You have the highest access level.")
    }

    if (user.accessLevel==1){
        println("You are an editor. You have access to edit stuff (idk).")
    }

    if (user.accessLevel==2){
        println("you are a viewer. You have basic access level.")
    }
}

fun main() {

    var admin: UserRole = UserRole.ADMIN
    var editor: UserRole = UserRole.EDITOR
    var viewer: UserRole = UserRole.VIEWER

    checkAccessLevel(admin)

    for (user in UserRole.entries){
        println(user)
    }
}