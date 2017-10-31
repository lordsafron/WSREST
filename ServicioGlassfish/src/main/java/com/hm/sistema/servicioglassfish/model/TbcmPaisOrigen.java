/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.sistema.servicioglassfish.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HugoM
 */
@Entity
@Table(name = "tbcm_pais_origen")
@XmlRootElement(name = "tbcmPaisOrigen")
public class TbcmPaisOrigen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "pais")
    private String pais;

    public TbcmPaisOrigen() {
    }

    public TbcmPaisOrigen(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pais != null ? pais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbcmPaisOrigen)) {
            return false;
        }
        TbcmPaisOrigen other = (TbcmPaisOrigen) object;
        if ((this.pais == null && other.pais != null) || (this.pais != null && !this.pais.equals(other.pais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hm.sistema.servicioglassfish.model.TbcmPaisOrigen[ pais=" + pais + " ]";
    }
    
}
