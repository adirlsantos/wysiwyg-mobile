package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EXAME_LAUDO
 * @generated
 */
@Entity
@Table(name = "\"EXAME_LAUDO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ExameLaudo")
public class ExameLaudo implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_EXAME_LAUDO", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idExameLaudo;

  /**
  * @generated
  */
  @Column(name = "EL_CODIGO_AMB", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elCodigoAmb;

  /**
  * @generated
  */
  @Column(name = "EL_DESCRICAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String elDescricao;

  /**
  * @generated
  */
  @Column(name = "EL_DESCRICAO_FICHA", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String elDescricaoFicha;

  /**
  * @generated
  */
  @Column(name = "EL_POSICAO_RESULTADO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String elPosicaoResultado;

  /**
  * @generated
  */
  @Column(name = "EL_REFERENCIA_CRIANCA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String elReferenciaCrianca;

  /**
  * @generated
  */
  @Column(name = "EL_REFERENCIA_HOMEM", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String elReferenciaHomem;

  /**
  * @generated
  */
  @Column(name = "EL_REFERENCIA_MULHER", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String elReferenciaMulher;

  /**
  * @generated
  */
  @Column(name = "EL_UNIDADE_MEDIDA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elUnidadeMedida;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_EXAME_LABORATORIAL", nullable = false, referencedColumnName = "ID_EXAME_LABORATORIAL", insertable=true, updatable=true)
  
  private ExameLaboratorial exameLaboratorial;

  /**
   * Construtor
   * @generated
   */
  public ExameLaudo(){
  }


  /**
   * Obtém elCodigoAmb
   * return elCodigoAmb
   * @generated
   */
  
  public java.lang.String getElCodigoAmb(){
    return this.elCodigoAmb;
  }

  /**
   * Define elCodigoAmb
   * @param elCodigoAmb elCodigoAmb
   * @generated
   */
  public ExameLaudo setElCodigoAmb(java.lang.String elCodigoAmb){
    this.elCodigoAmb = elCodigoAmb;
    return this;
  }

  /**
   * Obtém elDescricao
   * return elDescricao
   * @generated
   */
  
  public java.lang.String getElDescricao(){
    return this.elDescricao;
  }

  /**
   * Define elDescricao
   * @param elDescricao elDescricao
   * @generated
   */
  public ExameLaudo setElDescricao(java.lang.String elDescricao){
    this.elDescricao = elDescricao;
    return this;
  }

  /**
   * Obtém elDescricaoFicha
   * return elDescricaoFicha
   * @generated
   */
  
  public java.lang.String getElDescricaoFicha(){
    return this.elDescricaoFicha;
  }

  /**
   * Define elDescricaoFicha
   * @param elDescricaoFicha elDescricaoFicha
   * @generated
   */
  public ExameLaudo setElDescricaoFicha(java.lang.String elDescricaoFicha){
    this.elDescricaoFicha = elDescricaoFicha;
    return this;
  }

  /**
   * Obtém elPosicaoResultado
   * return elPosicaoResultado
   * @generated
   */
  
  public java.lang.String getElPosicaoResultado(){
    return this.elPosicaoResultado;
  }

  /**
   * Define elPosicaoResultado
   * @param elPosicaoResultado elPosicaoResultado
   * @generated
   */
  public ExameLaudo setElPosicaoResultado(java.lang.String elPosicaoResultado){
    this.elPosicaoResultado = elPosicaoResultado;
    return this;
  }

  /**
   * Obtém elReferenciaCrianca
   * return elReferenciaCrianca
   * @generated
   */
  
  public java.lang.String getElReferenciaCrianca(){
    return this.elReferenciaCrianca;
  }

  /**
   * Define elReferenciaCrianca
   * @param elReferenciaCrianca elReferenciaCrianca
   * @generated
   */
  public ExameLaudo setElReferenciaCrianca(java.lang.String elReferenciaCrianca){
    this.elReferenciaCrianca = elReferenciaCrianca;
    return this;
  }

  /**
   * Obtém elReferenciaHomem
   * return elReferenciaHomem
   * @generated
   */
  
  public java.lang.String getElReferenciaHomem(){
    return this.elReferenciaHomem;
  }

  /**
   * Define elReferenciaHomem
   * @param elReferenciaHomem elReferenciaHomem
   * @generated
   */
  public ExameLaudo setElReferenciaHomem(java.lang.String elReferenciaHomem){
    this.elReferenciaHomem = elReferenciaHomem;
    return this;
  }

  /**
   * Obtém elReferenciaMulher
   * return elReferenciaMulher
   * @generated
   */
  
  public java.lang.String getElReferenciaMulher(){
    return this.elReferenciaMulher;
  }

  /**
   * Define elReferenciaMulher
   * @param elReferenciaMulher elReferenciaMulher
   * @generated
   */
  public ExameLaudo setElReferenciaMulher(java.lang.String elReferenciaMulher){
    this.elReferenciaMulher = elReferenciaMulher;
    return this;
  }

  /**
   * Obtém elUnidadeMedida
   * return elUnidadeMedida
   * @generated
   */
  
  public java.lang.String getElUnidadeMedida(){
    return this.elUnidadeMedida;
  }

  /**
   * Define elUnidadeMedida
   * @param elUnidadeMedida elUnidadeMedida
   * @generated
   */
  public ExameLaudo setElUnidadeMedida(java.lang.String elUnidadeMedida){
    this.elUnidadeMedida = elUnidadeMedida;
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
  public ExameLaudo setExameLaboratorial(ExameLaboratorial exameLaboratorial){
    this.exameLaboratorial = exameLaboratorial;
    return this;
  }

  /**
   * Obtém idExameLaudo
   * return idExameLaudo
   * @generated
   */
  
  public java.lang.Integer getIdExameLaudo(){
    return this.idExameLaudo;
  }

  /**
   * Define idExameLaudo
   * @param idExameLaudo idExameLaudo
   * @generated
   */
  public ExameLaudo setIdExameLaudo(java.lang.Integer idExameLaudo){
    this.idExameLaudo = idExameLaudo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ExameLaudo object = (ExameLaudo)obj;
    if (idExameLaudo != null ? !idExameLaudo.equals(object.idExameLaudo) : object.idExameLaudo != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idExameLaudo == null) ? 0 : idExameLaudo.hashCode());
    return result;
  }

}
