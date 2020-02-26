package day44.Sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    protected String status;
    protected String name ;
    int adminId;

    public SlackAdminUser(String status, String name, int adminId) {
        this.status = status;
        this.name = name;
        this.adminId = adminId;
    }
    public static void main(String[] args) {



        SlackAdminUser user1 = new SlackAdminUser("Admin", "Ayse", 101);
        // --- inherited methods we are calling
        user1.sendMessage();
        user1.addEmoji();
        user1.callSomeone();
        // --- our own methods we are calling
        user1.sendAtChannelMessage();
        user1.addChannel();
        user1.deleteMessage();
        System.out.println("user1 = " + user1);


    }
    public void sendAtChannelMessage(){
        System.out.println(name + " sending message");
    }
    public void deleteMessage(){
        System.out.println(name + " delete message");
    }
    public void addChannel(){
        System.out.println(name + " adding new channel");
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }



}
