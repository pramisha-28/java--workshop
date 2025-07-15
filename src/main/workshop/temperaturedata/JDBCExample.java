import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) {
        Connection dbConnection = null;
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            dbConnection =DriverManager.getConnection("jdbc:h2:mem:tempdataDB", "sa", null);
        } catch (SQLException sqlException) {
            System.out.println("Error creating table:"+sqlException);
        }       
        OrganizationDAO organizationDAO = new OrganizationDAO();
        organizationDAO.createTable(dbConnection);
        Organization vet = new Organization("VET","Vellar Education Trust:",
        "www.vet.com",
        "contact@vet.com",
        "+91-9234567894",
        1234562345,null);
        organizationDAO.save(dbConnection,vet);
    }
}

        
