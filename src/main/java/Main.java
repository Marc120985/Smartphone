import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Friend newFriend = new Friend("Hans", "0915");
        Friend newFriend1 = new Friend("Dennis", "0815");
        Contact newFriend2 = new Friend("Christian","1234");
        ArrayList<Contact> friendlist = new ArrayList<>(List.of(newFriend,newFriend1,newFriend2));
//        System.out.println(newFriend);
//        System.out.println(newFriend1.getName());

        Smartphone myPhone = new Smartphone("13.2","Iphone", friendlist);

        System.out.println("Mein Smartphone: " + myPhone);
        System.out.println(myPhone.startRadio());
        System.out.println(myPhone.stopRadio());
        System.out.println("GPS Position: " + myPhone.getPosition());



    }


}
