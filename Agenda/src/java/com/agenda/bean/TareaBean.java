package com.agenda.bean;

import com.agenda.dao.PersonaDaoImpl;
import com.agenda.dao.TareaDaoImpl;
import com.agenda.model.Persona;
import com.agenda.model.Tarea;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Usuario
 */
@ManagedBean
@ViewScoped
public class TareaBean {

    private String txt6;
    private Tarea tarea;
    private List<Tarea> LTarea;
    private List<Persona> Lpersona;

    @ManagedProperty("#{personaDaoImpl}")
    private PersonaDaoImpl personaDao;
    private Persona persona;

    public TareaBean() {
    }

    public List<Persona> complete(String query){
        personaDao = new PersonaDaoImpl();
        return personaDao.queryByName(query);
    }
    
    public String convertInt(Integer value){
        return String.valueOf(value);
    }
    
    
    //http://www.javabeat.net/primefaces-autocomplete-pojo/
    public PersonaDaoImpl getPersonaDao() {
        return personaDao;
    }

    public void setPersonaDao(PersonaDaoImpl personaDao) {
        this.personaDao = personaDao;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
