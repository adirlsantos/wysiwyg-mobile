package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela GUIA_LABORATORIAL_EXAME
 * @generated
 */
@Entity
@Table(name = "\"GUIA_LABORATORIAL_EXAME\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.GuiaLaboratorialExame")
public class GuiaLaboratorialExame implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_GUIA_LABORATORIAL_EXAME", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idGuiaLaboratorialExame;

  /**
  * @generated
  */
  @Column(name = "EL_OBSERVACAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String elObservacao;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_EXAME_LABORATORIAL", nullable = true, referencedColumnName = "ID_EXAME_LABORATORIAL", insertable=true, updatable=true)
  
  private ExameLaboratorial exameLaboratorial;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_GUIA_LABORATORIO", nullable = true, referencedColumnName = "ID_GUIA_LABORATORIO", insertable=true, updatable=true)
  
  private GuiaLaboratorial guiaLaboratorial;

  /**
   * Construtor
   * @generated
   */
  public GuiaLaboratorialExame(){
  }


  /**
   * Obtém elObservacao
   * return elObservacao
   * @generated
   */
  
  public java.lang.String getElObservacao(){
    return this.elObservacao;
  }

  /**
   * Define elObservacao
   * @param elObservacao elObservacao
   * @generated
   */
  public GuiaLaboratorialExame setElObservacao(java.lang.String elObservacao){
    this.elObservacao = elObservacao;
    return this;
  }

  /**
   * Obtém exameLaboratorial
   * return exameLaboratorial
   * @generated
   */
  
  public ExameLaboratorial getExameLaboratorial(){
    return this.exameLaboratorial;
  }

  /**
   * Define exameLaboratorial
   * @param exameLaboratorial exameLaboratorial
   * @generated
   */
  public GuiaLaboratorialExame setExameLaboratorial(ExameLaboratorial exameLaboratorial){
    this.exameLaboratorial = exameLaboratorial;
    return this;
  }

  /**
   * Obtém guiaLaboratorial
   * return guiaLaboratorial
   * @generated
   */
  
  public GuiaLaboratorial getGuiaLaboratorial(){
    return this.guiaLaboratorial;
  }

  /**
   * Define guiaLaboratorial
   * @param guiaLaboratorial guiaLaboratorial
   * @generated
   */
  public GuiaLaboratorialExame setGuiaLaboratorial(GuiaLaboratorial guiaLaboratorial){
    this.guiaLaboratorial = guiaLaboratorial;
    return this;
  }

  /**
   * Obtém idGuiaLaboratorialExame
   * return idGuiaLaboratorialExame
   * @generated
   */
  
  public java.lang.Integer getIdGuiaLaboratorialExame(){
    return this.idGuiaLaboratorialExame;
  }

  /**
   * Define idGuiaLaboratorialExame
   * @param idGuiaLaboratorialExame idGuiaLaboratorialExame
   * @generated
   */
  public GuiaLaboratorialExame setIdGuiaLaboratorialExame(java.lang.Integer idGuiaLaboratorialExame){
    this.idGuiaLaboratorialExame = idGuiaLaboratorialExame;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    GuiaLaboratorialExame object = (GuiaLaboratorialExame)obj;
    if (idGuiaLaboratorialExame != null ? !idGuiaLaboratorialExame.equals(object.idGuiaLaboratorialExame) : object.idGuiaLaboratorialExame != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGuiaLaboratorialExame == null) ? 0 : idGuiaLaboratorialExame.hashCode());
    return result;
  }

}
