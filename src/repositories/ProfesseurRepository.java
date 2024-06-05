package repositories;

public class ProfesseurRepository extends Database{
    private final String SQL_SELECT_BY_NOM="SELECT * FROM `professeur` WHERE `nom_prof` LIKE ?";   

}
