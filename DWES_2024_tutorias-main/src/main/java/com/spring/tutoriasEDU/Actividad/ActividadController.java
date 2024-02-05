package com.spring.tutoriasEDU.Actividad;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.spring.tutoriasEDU.planes.Plan;


@Controller
public class ActividadController {
	
	@Autowired
	ActividadDAO actividadDAO;
	

	

	@GetMapping("/actividad")
	public ModelAndView getActividades() {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("actividades");
		List<Actividad> actividades = (List<Actividad>)actividadDAO.findAll();
		
		model.addObject("actividades", actividades);
		
		return model;
	}
	
	
	@GetMapping("/actividad/{id}")
	public ModelAndView getActividad(@PathVariable long id) {
		
		ModelAndView model = new ModelAndView();
		model.setViewName("actividad");
		model.addObject("actividad", actividadDAO.findById(id).get());
		
		return model;
	}
	
	
	@GetMapping("/actividad/borrar/{id}")
	public String BorrarActividad(@PathVariable long id) {

	    actividadDAO.deleteById(id);

	    return "redirect:/actividad";
	}

	
// Falta hacer el editar
	
//	@GetMapping("/actividad/editar/{id}")
//	public ModelAndView EditarActividad(@PathVariable long id) {
//
//ModelAndView model = new ModelAndView();
//	
//	Optional<Actividad> actividadN = actividadDAO.findById(id);
//	if(actividadN.isPresent()) {
//		
//		model.addObject("plan", actividadN.get());
//
//	
//		model.setViewName("formActividad");
//	}
//	else model.setViewName("redirect:/actividad");	
//	
//	return model;
//
//
//	}
	
	
}
