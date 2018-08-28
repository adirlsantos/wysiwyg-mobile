package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela GUIA_LABORATORIAL_RESULTADO
 * @generated
 */
@Entity
@Table(name = "\"GUIA_LABORATORIAL_RESULTADO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.GuiaLaboratorialResultado")
public class GuiaLaboratorialResultado implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_GUIA_LABORATORIAL_RESULTADO", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idGuiaLaboratorialResultado;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_EXAME_LAUDO", nullable = true, referencedColumnName = "ID_EXAME_LAUDO", insertable=true, updatable=true)
  
  private ExameLaudo exameLaudo;

  /**
  * @generated
  */
  @Column(name = "GR_REFERENCIA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String grReferencia;

  /**
  * @generated
  */
  @Column(name = "GR_REFERENCIA_MEMO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String grReferenciaMemo;

  /**
  * @generated
  */
  @Column(name = "GR_VALOR1", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String grValor1;

  /**
  * @generated
  */
  @Column(name = "GR_VALOR2", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String grValor2;

  /**
  * @generated
  */
  @Column(name = "GR_VALOR3", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String grValor3;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_GUIA_LABORATORIAL_EXAME", nullable = true, referencedColumnName = "ID_GUIA_LABORATORIAL_EXAME", insertable=true, updatable=true)
  
  private GuiaLaboratorialExame guiaLaboratorialExame;

  /**
   * Construtor
   * @generated
   */
  public GuiaLaboratorialResultado(){
  }


  /**
   * Obtém exameLaudo
   * return exameLaudo
   * @generated
   */
  
  public ExameLaudo getExameLaudo(){
    return this.exameLaudo;
  }

  /**
   * Define exameLaudo
   * @param exameLaudo exameLaudo
   * @generated
   */
  public GuiaLaboratorialResultado setExameLaudo(ExameLaudo exameLaudo){
    this.exameLaudo = exameLaudo;
    return this;
  }

  /**
   * Obtém grReferencia
   * return grReferencia
   * @generated
   */
  
  public java.lang.String getGrReferencia(){
    return this.grReferencia;
  }

  /**
   * Define grReferencia
   * @param grReferencia grReferencia
   * @generated
   */
  public GuiaLaboratorialResultado setGrReferencia(java.lang.String grReferencia){
    this.grReferencia = grReferencia;
    return this;
  }

  /**
   * Obtém grReferenciaMemo
   * return grReferenciaMemo
   * @generated
   */
  
  public java.lang.String getGrReferenciaMemo(){
    return this.grReferenciaMemo;
  }

  /**
   * Define grReferenciaMemo
   * @param grReferenciaMemo grReferenciaMemo
   * @generated
   */
  public GuiaLaboratorialResultado setGrReferenciaMemo(java.lang.String grReferenciaMemo){
    this.grReferenciaMemo = grReferenciaMemo;
    return this;
  }

  /**
   * Obtém grValor1
   * return grValor1
   * @generated
   */
  
  public java.lang.String getGrValor1(){
    return this.grValor1;
  }

  /**
   * Define grValor1
   * @param grValor1 grValor1
   * @generated
   */
  public GuiaLaboratorialResultado setGrValor1(java.lang.String grValor1){
    this.grValor1 = grValor1;
    return this;
  }

  /**
   * Obtém grValor2
   * return grValor2
   * @generated
   */
  
  public java.lang.String getGrValor2(){
    return this.grValor2;
  }

  /**
   * Define grValor2
   * @param grValor2 grValor2
   * @generated
   */
  public GuiaLaboratorialResultado setGrValor2(java.lang.String grValor2){
    this.grValor2 = grValor2;
    return this;
  }

  /**
   * Obtém grValor3
   * return grValor3
   * @generated
   */
  
  public java.lang.String getGrValor3(){
    return this.grValor3;
  }

  /**
   * Define grValor3
   * @param grValor3 grValor3
   * @generated
   */
  public GuiaLaboratorialResultado setGrValor3(java.lang.String grValor3){
    this.grValor3 = grValor3;
    return this;
  }

  /**
   * Obtém guiaLaboratorialExame
   * return guiaLaboratorialExame
   * @generated
   */
  
  public GuiaLaboratorialExame getGuiaLaboratorialExame(){
    return this.guiaLaboratorialExame;
  }

  /**
   * Define guiaLaboratorialExame
   * @param guiaLaboratorialExame guiaLaboratorialExame
   * @generated
   */
  public GuiaLaboratorialResultado setGuiaLaboratorialExame(GuiaLaboratorialExame guiaLaboratorialExame){
    this.guiaLaboratorialExame = guiaLaboratorialExame;
    return this;
  }

  /**
   * Obtém idGuiaLaboratorialResultado
   * return idGuiaLaboratorialResultado
   * @generated
   */
  
  public java.lang.Integer getIdGuiaLaboratorialResultado(){
    return this.idGuiaLaboratorialResultado;
  }

  /**
   * Define idGuiaLaboratorialResultado
   * @param idGuiaLaboratorialResultado idGuiaLaboratorialResultado
   * @generated
   */
  public GuiaLaboratorialResultado setIdGuiaLaboratorialResultado(java.lang.Integer idGuiaLaboratorialResultado){
    this.idGuiaLaboratorialResultado = idGuiaLaboratorialResultado;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    GuiaLaboratorialResultado object = (GuiaLaboratorialResultado)obj;
    if (idGuiaLaboratorialResultado != null ? !idGuiaLaboratorialResultado.equals(object.idGuiaLaboratorialResultado) : object.idGuiaLaboratorialResultado != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idGuiaLaboratorialResultado == null) ? 0 : idGuiaLaboratorialResultado.hashCode());
    return result;
  }

}
