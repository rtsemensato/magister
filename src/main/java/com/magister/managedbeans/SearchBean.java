package com.magister.managedbeans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author fernando
 */
@ManagedBean
@SessionScoped
public class SearchBean implements Serializable {

    private String search;

    public SearchBean() {
        search = "";
    }
    
    public String doSearch() {
        System.out.println("Buscando por " + search);
        return "";
    }
    
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

}
