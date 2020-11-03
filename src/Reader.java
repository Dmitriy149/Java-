public class Reader {

    private String fullName;
    private int cardNumber;
    private String faculty;
    private String date;
    private String phoneNumber;


    public  Reader(){

}
    public Reader(String fullName,int cardNumber,String faculty,String  date,String phoneNumber){
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.date = date;
        this.phoneNumber = phoneNumber;


    }
    public void Reader(){
        System.out.println("Ф.И.О.:"+fullName +"; "+"Номер читательского билета:"+cardNumber+"; "+
                "Факультет:"+ faculty+"; "+"Дата рождения:"+ date+"; "+"Номер телефона:"+phoneNumber);
    }


   public  void takeBook(String fullName) {

       System.out.println(fullName + " взял 3 книги.");
    }
    public void takeBook(String fullName, String nameBook) {

        System.out.println(fullName + " взял книги: " + nameBook);
    }
    public void takeBook(String fullName, String nameBook, String authorBook) {

        System.out.println(fullName + " взял 3 книги: " + nameBook + " автора " + authorBook);
    }

   public void returnBook(String fullName){
        System.out.println(fullName + " вернул 3 книги.");
    }
    public void returnBook(String fullName, String nameBook){
        System.out.println(fullName + " вернул книги: " + nameBook);
    }
    public void returnBook(String fullName, String nameBook, String authorBook){
        System.out.println(fullName + " вернул 3 книги: " + nameBook + " автора " + authorBook);
    }

}
