package InterfaceLearning.hspInterface;

public class Interface03 {
    public static void main(String[] args) {
        MySqlDB mysqlDB = new MySqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}
