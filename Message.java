public class Message {
    String text;

    Message(String text){
        this.text = text;
    }

   void setMessage (String text){
       this.text = text;
   }

   void displayText(){
       System.out.println(text);
   }

   public String toString(){
    return text; }
}

 class SMS extends Message{
                String recipientContactNO ;

                SMS( String text, String recipientContactNO){
                    super(text);
                    this.recipientContactNO=recipientContactNO; }

//
//     void mutator(){
//
//     }
//
//     public String Accesor(){
//                    return recipientContactNO;
//     }

                void displaytext(){
;                    System.out.println(super.text);
                    System.out.println(this.recipientContactNO);
                }

     public String toString(){
         return " text " + text + " Recipient Contact Number = " +  recipientContactNO ; }

            }


class Email extends Message{
                   String sender;
                   String Reciever;
                   String subject;

                   Email(String text, String sender, String Reciever, String subject){
                       super(text);
                       this.sender=sender;
                       this.Reciever=Reciever;
                       this.subject=subject;
                   }

                   void displaytext(){
                       System.out.println(super.text);
                       System.out.println(this.sender);
                       System.out.println(this.Reciever);
                       System.out.println(this.subject);
                   }

    public String toString(){
        return " text " + text + "Sender " +  sender + " Reciever " + Reciever + " Subject " + subject ; }

               }



class main3 {
    public static void main (String [] args ){
        SMS object = new SMS (" Hello ", "003265");
        object.displaytext();

        Email object2 = new Email (" Good Morning " , " Bisma ", " Dear Mimi ", " Wishing ");
        object2.displaytext();
    }
}





