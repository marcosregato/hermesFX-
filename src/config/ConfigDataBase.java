package config;

public class ConfigDataBase {

    private static boolean  CONNETION = false;

    public void connectionAPI(){

    }

    public Boolean connectionDataBaseLocation(String connectioDB){

       Boolean dbConnection =Boolean.parseBoolean(connectioDB);
        if(!dbConnection){
            return dbConnection;
        }else{
            return CONNETION;
        }

    }

    public void connectionDataBasePortable(){

    }
}
