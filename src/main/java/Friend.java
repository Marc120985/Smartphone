public class Friend extends Contact{
    String phoneNumber;


    public Friend(){}
    public Friend(String name, String phoneNumber) {

        super.contactName = name;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String getName() {
        return contactName;
    }


    @Override
    public String toString() {
        return "\nFriend:" +
                "\nName: " + contactName +
                "\nTelefonnummer :" + phoneNumber
                ;
    }


}
