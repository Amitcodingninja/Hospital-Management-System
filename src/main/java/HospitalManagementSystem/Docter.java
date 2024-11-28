package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Docter {
    private Connection connection;

    Docter(Connection connection) {
        this.connection = connection;
    }

    public void viewDocters() {
        String query = "SELECT * FROM doctors";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Table header
            System.out.println("------------------------------------------------");
            System.out.printf("| %-10s | %-20s | %-20s |\n", "Doctor ID", "Name", "Specialization");
            System.out.println("------------------------------------------------");

            // Table rows
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialization = resultSet.getString("specialization");
                System.out.printf("| %-10d | %-20s | %-20s |\n", id, name, specialization);
            }

            System.out.println("------------------------------------------------");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean getDocterById(int id) {
        String query = "SELECT * FROM doctors WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next(); // True if doctor exists, false otherwise
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
