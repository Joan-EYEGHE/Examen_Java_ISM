package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Cours;

public class CoursRepository extends Database {
    private final String SQL_INSERT="INSERT INTO `cours` (`date`, `heureDb`, `heureFin`, `module_id`, `professeur_id`) VALUES (?,?,?,?,?)";
    private final String SQL_SELECT_ALL="SELECT * FROM `cours`";

    List<Cours> Listcours=new ArrayList<>();
    public void insert(Cours cours){

    }

    // Probleme de compatibilité avec les formats Local Date et LocalTime <?>

    public void insert_1(Cours cours) {
        openConnexion();
        try {
            initPrepareStatement(SQL_INSERT);
            // conversion
            statement.setObject(1, LocalDate.parse("2024-06-05"));
            statement.setDate(1, cours.getDate()); // <?>
            statement.setTime(2, cours.getHeureDb()); // <?>
            statement.setTime(3, cours.getHeureFin()); // <?>
            int NbreLigne= executeUpdate();
            statement.close();
            closeConnexion();
        } catch (SQLException e) {
            System.out.println("Erreur de  requête : Ajouter une classe.");
	}
    
    
    public List<Cours> selectAllCours(){
        openConnexion();
		initPrepareStatement(SQL_SELECT_ALL);
        try {
            // conversion
            
            ResultSet rs=executeSelect();
            while (rs.next()) {
            Cours cours=new Cours();
            cours.setId(rs.getInt("id_cours"));
            cours.setDate(null); // <?>
            cours.setHeureDb(null); // <?>
            cours.setHeureFin(null); // <?>
            Listcours.add(cours);
            
        } 
        } catch (Exception e) {
            System.out.println("Erreur de  requête : Afficher tous les cours");
        }
        
        return null;
    }



    
}
