import java.util.List;
import java.util.Scanner;
import entities.*;
import entities.Module;
import services.CoursService;
import services.ModuleService;
import services.ProfesseurService;

public class View {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int choix;
        ProfesseurService profService=new ProfesseurService();
        CoursService coursService=new CoursService();
        ModuleService moduleService=new ModuleService();
                
        do {
            System.out.println("-----------------MENU-----------------");
            System.out.println("1-  Créer un Module");
            System.out.println("2-  Lister toutes les modules");
            System.out.println("3-  Créer un cours");
            System.out.println("4-  Lister tous les cours");
            System.out.println("5-  Lister les  les cours  d’un module et d’un professeur");
            System.out.println("6-  Quitter");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    Module module=new Module();
                    System.out.println("Entrer le nom du module : ");
                    String nom_module=sc.nextLine();
                    module.setNom(nom_module);
                    moduleService.ajouterModule(module);                   
                    break;
                case 2:
                    List<Module> modules= moduleService.listerModules();
                    for (Module m : modules) {
                        System.out.println("nom : "+ m.getNom());
                        System.out.println("===========================");
                    }
                    break;
                case 3:
                    Cours cours=new Cours();
                    // Date 
                    // Heure debut 
                    // Heure Fin                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            
                default:
                System.out.println("Fais un bon choix");
                    break;
            }
            
        } while (choix!=6);
        
    }
}
