package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Module;

public class ModuleRepository extends Database{
    private final String SQL_INSERT="INSERT INTO `module` (`nom_Module`) VALUES (?)";
    private final String SQL_SELECT_ALL="SELECT * FROM `module`";


    
    public void insert(Module module){
        openConnexion();
        try {
            initPrepareStatement(SQL_INSERT);
            // conversion
            statement.setString(1, module.getNom());			
			int NbreLigne= executeUpdate();
			statement.close();
			closeConnexion();
        } catch (Exception e) {
            System.out.println("Erreur de  requête : Ajouter un module.");
        }
    }

    public List<entities.Module> selectAll(){
	    List<Module> modules=new ArrayList<>();
	
	try {
		openConnexion();
		initPrepareStatement(SQL_SELECT_ALL);
		// conversion
        ResultSet rs=executeSelect();
        while (rs.next()) {
            Module module=new Module();
            module.setId(rs.getInt("id_module"));
			module.setNom(rs.getString("nom_Module"));
            modules.add(module);
        }
		closeConnexion();
	} catch (SQLException e) {
		System.out.println("Erreur de  requête : Afficher les modules");
	}
		
	return modules;
}

}
