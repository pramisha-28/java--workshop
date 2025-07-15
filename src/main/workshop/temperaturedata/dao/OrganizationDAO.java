
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.h2.jdbcx.JdbcDataSource;

public class OrganizationDAO {

    public void createTable(Connection dbConnection) {                                       
        try(Statement Statement = dbConnection.createStatement()){
              statement.execute("""
                create table organization(
                id int AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(100),
                WEBSITE VARCHAR(100),
                EMAIL VARCHAR(100),
                CONTACT_NUMBER VARCHAR(100),
                REGISTRATION_NO INT,
                ADDRESS VARCHAR(567))
                """);
        } catch (SQLException SqlException){
        System.out.println("Error creating table"+SqlException);

        }
                              
    }
    public int save(Connection dbConnection,Organization vet) {
        try (PreparedStatement preparedStatement = dbConnection.prepareStament("""
            insert into organization(name, website, email, contact_number,
            registration_no,descripition) values(?,?,?,?,?,?)
            """)) {
                preparedStatement.setString(1,vet.name()); 
                preparedStatement.setString(2, vet.website());
                preparedStatement.setString(3, vet.email());
                preparedStatement.setString(4, vet.contactnumber());
                preparedStatement.setLong(5, vet.registrationNumber());
                preparedStatement.setString(6,vet.descripition());
                preparedStatement.executeUpdate();
            }catch (SQLException sqlException) {
                System.out.println("Error inserting into table:"+sqlException);
            }
            return 0;
        }
}