import java.util.HashMap;

public class InfosDB {
    private HashMap <String,String> name_and_password = new HashMap<>();

    public HashMap<String,String> getNameAndPSD(){
        return name_and_password;
    }
    public void setNameAndPSD(HashMap<String,String> name_and_password){
        this.name_and_password = name_and_password;
    }
}
