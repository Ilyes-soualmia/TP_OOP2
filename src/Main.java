public class Main {
    public static void main(String[] args) {
        new Welcome();
        InfosDB infosDB = new InfosDB();

        SignUp signUp = new SignUp(infosDB.getNameAndPSD());


    }
}