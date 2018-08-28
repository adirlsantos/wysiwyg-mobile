package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela GUIA_MEDICA_EXAME
 * @generated
 */
@Entity
@Table(name = "\"GUIA_MEDICA_EXAME\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.GuiaMedicaExame")
public class GuiaMedicaExame implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_GUIA_MEDICA_EXAME", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idGuiaMedicaExame;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_EXAME_CONSULTA", nullable = false, referencedColumnName = "ID_EXAME_CONSULTA", insertable=true, updatable=true)
  
  private ExameConsulta exameConsulta;

  /**
  * @generated
  */
  @Column(name = "GE_VALOR_EXAME", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double geValorExame;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_GUIA_MEDICA", nullable = false, referencedColumnName = "ID_GUIA_MEDICA", insertable=true, updatable=true)
  
  private GuiaMedica guiaMedica;

  /**
   * Construtor
   * @generated
   */
  public GuiaMedicaExame(){
  }


  /**
   * Obtém exameConsulta
   * return exameConsulta
   * @generated
   */
  
  public ExameConsulta getExameConsulta(){
    return this.exameConsulta;
  }

  /**
   * Define exameConsulta
   * @param exameConsulta exameConsulta
   * @generated
   */
  public GuiaMedicaExame setExameConsulta(ExameConsulta exameConsulta){
    this.exameConsulta = exameConsulta;
    return this;
  }

  /**
   * Obtém geValorExame
   * return geValorExame
   * @generated
   */
  
  public java.lang.Double getGeValorExame(){
    return this.geValorExame;
  }

  /**
   * Define geValorExame
   * @param geValorExame geValorExame
   * @generated
   */
  public GuiaMedicaExame setGeValorExame(java.lang.Double geValorExame){
    this.geValorExame = geValorExame;
    return this;
  }

  /**
   * Obtém guiaMedica
   * return guiaMedica
   * @generated
   */
  
  public GuiaMedica getGuiaMedica(){
    return this.guiaMedica;
  }

  /**
   * Define guiaMedica
   * @param guiaMedica guiaMedica
   * @generated
   */
  public GuiaMedicaExame setGuiaMedica(GuiaMedica guiaMedica){
    this.guiaMedica = guiaMedica;
    return this;
  }

  /**
   * Obtém idGuiaMedicaExame
   * return idGuiaMedicaExame
   * @generated
   */
  
  public java.lang.Integer getIdGuiaMedicaExame(){
    return this.idGuiaMedicaExame;
  }

  /**
   * Define idGuiaMedicaExame
   * @param idGuiaMedicaExame idGuiaMedicaExame
   * @generated
   */
  public GuiaMedicaExame setIdGuiaMedicaExame(java.lang.Integer idGuiaMedicaExame){
    this.idGuiaMedicaExame = idGuiaMedicaExame;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    GuiaMedicaExame object = (GuiaMedicaExame)obj;
    if (idGuiaMedicaExame != null ? !idGuiaMedicaExame.equals(object.idGuiaMedicaExame) : object.idGuiaMedicaExame != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGuiaMedicaExame == null) ? 0 : idGuiaMedicaExame.hashCode());
    return result;
  }

}
