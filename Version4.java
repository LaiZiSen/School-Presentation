
class Message{
    void message(){
        System.out.println("Message function called");
    } 
}

public class Version4{
    public static void main(String args[]){
        Message object = new Message();
        object.message();
    }
}
