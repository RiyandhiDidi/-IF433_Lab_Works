package oop_68383_RiyandhiAdrianDarmawan.week08

class NotificationService {

    fun sendEmail(user: UserProfile) {
        if (user.email != null) {
            println("Sending email to ${user.email}")
        } else {
            println("Email not available")
        }
    }
}