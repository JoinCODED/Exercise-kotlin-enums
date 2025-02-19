fun main() {
    val user1 = UserRole.ADMIN;
    val user2 = UserRole.EDITOR;
    val user3 = UserRole.VIEWER;

    println("you are an/a ${user1}: ${checkAccess(user1)}, Access Level: ${user1.accessLevel}");
    println("you are an/a ${user2}: ${checkAccess(user2)}, Access Level: ${user2.accessLevel}");
    println("you are an/a ${user3}: ${checkAccess(user3)}, Access Level: ${user3.accessLevel}");

}

enum class UserRole(var accessLevel: Int) {
    ADMIN(101), EDITOR(202), VIEWER(303)
}

fun checkAccess(role: UserRole): String {
    return when (role) {
        UserRole.ADMIN -> "ACCESS GRANTED";
        UserRole.EDITOR -> "ACCESS GRANTED";
        UserRole.VIEWER -> "ACCESS DENIED";
    }
}