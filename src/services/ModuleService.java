package services;

import java.util.List;

import entities.Module;
import repositories.ModuleRepository;

public class ModuleService {
    ModuleRepository moduleRepository=new ModuleRepository();
    
    public void ajouterModule(Module module){
        moduleRepository.insert(module);
    }
    
	public List<Module> listerModules(){
		return moduleRepository.selectAll();
	}




}
