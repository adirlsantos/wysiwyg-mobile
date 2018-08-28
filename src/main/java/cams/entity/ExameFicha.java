package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EXAME_FICHA
 * @generated
 */
@Entity
@Table(name = "\"EXAME_FICHA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ExameFicha")
public class ExameFicha implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_EXAME_FICHA", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idExameFicha;

  /**
  * @generated
  */
  @Column(name = "EF_DESCRICAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String efDescricao;

  /**
  * @generated
  */
  @Column(name = "EF_REFERENCIA_CRIANCA", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String efReferenciaCrianca;

  /**
  * @generated
  */
  @Column(name = "EF_REFERENCIA_HOMEM", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String efReferenciaHomem;

  /**
  * @generated
  */
  @Column(name = "EF_REFERENCIA_MULHER", nullable = true, unique = false, length=50, insertable=true, updatable=true)
  
  private java.lang.String efReferenciaMulher;

  /**
  * @generated
  */
  @Column(name = "EF_UNIDADE_MEDIDA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String efUnidadeMedida;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_EXAME_LABORATORIAL", nullable = true, referencedColumnName = "ID_EXAME_LABORATORIAL", insertable=true, updatable=true)
  
  private ExameLaboratorial exameLaboratorial;

  /**
   * Construtor
   * @generated
   */
  public ExameFicha(){
  }


  /**
   * Obtém efDescricao
   * return efDescricao
   * @generated
   */
  
  public java.lang.String getEfDescricao(){
    return this.efDescricao;
  }

  /**
   * Define efDescricao
   * @param efDescricao efDescricao
   * @generated
   */
  public ExameFicha setEfDescricao(java.lang.String efDescricao){
    this.efDescricao = efDescricao;
    return this;
  }

  /**
   * Obtém efReferenciaCrianca
   * return efReferenciaCrianca
   * @generated
   */
  
  public java.lang.String getEfReferenciaCrianca(){
    return this.efReferenciaCrianca;
  }

  /**
   * Define efReferenciaCrianca
   * @param efReferenciaCrianca efReferenciaCrianca
   * @generated
   */
  public ExameFicha setEfReferenciaCrianca(java.lang.String efReferenciaCrianca){
    this.efReferenciaCrianca = efReferenciaCrianca;
    return this;
  }

  /**
   * Obtém efReferenciaHomem
   * return efReferenciaHomem
   * @generated
   */
  
  public java.lang.String getEfReferenciaHomem(){
    return this.efReferenciaHomem;
  }

  /**
   * Define efReferenciaHomem
   * @param efReferenciaHomem efReferenciaHomem
   * @generated
   */
  public ExameFicha setEfReferenciaHomem(java.lang.String efReferenciaHomem){
    this.efReferenciaHomem = efReferenciaHomem;
    return this;
  }

  /**
   * Obtém efReferenciaMulher
   * return efReferenciaMulher
   * @generated
   */
  
  public java.lang.String getEfReferenciaMulher(){
    return this.efReferenciaMulher;
  }

  /**
   * Define efReferenciaMulher
   * @param efReferenciaMulher efReferenciaMulher
   * @generated
   */
  public ExameFicha setEfReferenciaMulher(java.lang.String efReferenciaMulher){
    this.efReferenciaMulher = efReferenciaMulher;
    return this;
  }

  /**
   * Obtém efUnidadeMedida
   * return efUnidadeMedida
   * @generated
   */
  
  public java.lang.String getEfUnidadeMedida(){
    return this.efUnidadeMedida;
  }

  /**
   * Define efUnidadeMedida
   * @param efUnidadeMedida efUnidadeMedida
   * @generated
   */
  public ExameFicha setEfUnidadeMedida(java.lang.String efUnidadeMedida){
    this.efUnidadeMedida = efUnidadeMedida;
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
  public ExameFicha setExameLaboratorial(ExameLaboratorial exameLaboratorial){
    this.exameLaboratorial = exameLaboratorial;
    return this;
  }

  /**
   * Obtém idExameFicha
   * return idExameFicha
   * @generated
   */
  
  public java.lang.Integer getIdExameFicha(){
    return this.idExameFicha;
  }

  /**
   * Define idExameFicha
   * @param idExameFicha idExameFicha
   * @generated
   */
  public ExameFicha setIdExameFicha(java.lang.Integer idExameFicha){
    this.idExameFicha = idExameFicha;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ExameFicha object = (ExameFicha)obj;
    if (idExameFicha != null ? !idExameFicha.equals(object.idExameFicha) : object.idExameFicha != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idExameFicha == null) ? 0 : idExameFicha.hashCode());
    return result;
  }

}
