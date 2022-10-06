public class Friend extends Contact{
    String phoneNumber;


    public Friend(){}
    public Friend(String name, String phoneNumber) {

        super.contactName = name;
        this.phoneNumber = phoneNumber;
    }

// Was macht diese Methode hier?
    @Override
    public String getName() {
        return null;
    }


    @Override
    public String toString() {
        return "Friend:" +
                "\nName: " + contactName +
                "\nTelefonnummer :" + phoneNumber
                ;
    }


}
