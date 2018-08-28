package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EXAME_LABORATORIAL
 * @generated
 */
@Entity
@Table(name = "\"EXAME_LABORATORIAL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ExameLaboratorial")
public class ExameLaboratorial implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_EXAME_LABORATORIAL", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idExameLaboratorial;

  /**
  * @generated
  */
  @Column(name = "EL_AMOSTRA", nullable = true, unique = false, length=18, insertable=true, updatable=true)
  
  private java.lang.String elAmostra;

  /**
  * @generated
  */
  @Column(name = "EL_CATEGORIA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elCategoria;

  /**
  * @generated
  */
  @Column(name = "EL_COMPOSICAO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elComposicao;

  /**
  * @generated
  */
  @Column(name = "EL_DESC_RESULTADO", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String elDescResultado;

  /**
  * @generated
  */
  @Column(name = "EL_DESC_TITULO", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String elDescTitulo;

  /**
  * @generated
  */
  @Column(name = "EL_DESCRICAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String elDescricao;

  /**
  * @generated
  */
  @Column(name = "EL_DESCRICAO_RESUMIDA", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elDescricaoResumida;

  /**
  * @generated
  */
  @Column(name = "EL_GRUPO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elGrupo;

  /**
  * @generated
  */
  @Column(name = "EL_IMP_REFERENCIA", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String elImpReferencia;

  /**
  * @generated
  */
  @Column(name = "EL_IMP_RESULTADO_ANT", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String elImpResultadoAnt;

  /**
  * @generated
  */
  @Column(name = "EL_IMP_TITULO_SN", nullable = true, unique = false, length=3, insertable=true, updatable=true)
  
  private java.lang.String elImpTituloSn;

  /**
  * @generated
  */
  @Column(name = "EL_METODO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elMetodo;

  /**
  * @generated
  */
  @Column(name = "EL_ORDEM_LAUDO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer elOrdemLaudo;

  /**
  * @generated
  */
  @Column(name = "EL_TIPO_RESULTADO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elTipoResultado;

  /**
  * @generated
  */
  @Column(name = "EL_TITULO_MASTER", nullable = true, unique = false, length=30, insertable=true, updatable=true)
  
  private java.lang.String elTituloMaster;

  /**
  * @generated
  */
  @Column(name = "EL_TITULO_REF_1", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elTituloRef1;

  /**
  * @generated
  */
  @Column(name = "EL_TITULO_REF_2", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String elTituloRef2;

  /**
  * @generated
  */
  @Column(name = "EL_VALOR", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer elValor;

  /**
   * Construtor
   * @generated
   */
  public ExameLaboratorial(){
  }


  /**
   * Obtém elAmostra
   * return elAmostra
   * @generated
   */
  
  public java.lang.String getElAmostra(){
    return this.elAmostra;
  }

  /**
   * Define elAmostra
   * @param elAmostra elAmostra
   * @generated
   */
  public ExameLaboratorial setElAmostra(java.lang.String elAmostra){
    this.elAmostra = elAmostra;
    return this;
  }

  /**
   * Obtém elCategoria
   * return elCategoria
   * @generated
   */
  
  public java.lang.String getElCategoria(){
    return this.elCategoria;
  }

  /**
   * Define elCategoria
   * @param elCategoria elCategoria
   * @generated
   */
  public ExameLaboratorial setElCategoria(java.lang.String elCategoria){
    this.elCategoria = elCategoria;
    return this;
  }

  /**
   * Obtém elComposicao
   * return elComposicao
   * @generated
   */
  
  public java.lang.String getElComposicao(){
    return this.elComposicao;
  }

  /**
   * Define elComposicao
   * @param elComposicao elComposicao
   * @generated
   */
  public ExameLaboratorial setElComposicao(java.lang.String elComposicao){
    this.elComposicao = elComposicao;
    return this;
  }

  /**
   * Obtém elDescResultado
   * return elDescResultado
   * @generated
   */
  
  public java.lang.String getElDescResultado(){
    return this.elDescResultado;
  }

  /**
   * Define elDescResultado
   * @param elDescResultado elDescResultado
   * @generated
   */
  public ExameLaboratorial setElDescResultado(java.lang.String elDescResultado){
    this.elDescResultado = elDescResultado;
    return this;
  }

  /**
   * Obtém elDescTitulo
   * return elDescTitulo
   * @generated
   */
  
  public java.lang.String getElDescTitulo(){
    return this.elDescTitulo;
  }

  /**
   * Define elDescTitulo
   * @param elDescTitulo elDescTitulo
   * @generated
   */
  public ExameLaboratorial setElDescTitulo(java.lang.String elDescTitulo){
    this.elDescTitulo = elDescTitulo;
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
  public ExameLaboratorial setElDescricao(java.lang.String elDescricao){
    this.elDescricao = elDescricao;
    return this;
  }

  /**
   * Obtém elDescricaoResumida
   * return elDescricaoResumida
   * @generated
   */
  
  public java.lang.String getElDescricaoResumida(){
    return this.elDescricaoResumida;
  }

  /**
   * Define elDescricaoResumida
   * @param elDescricaoResumida elDescricaoResumida
   * @generated
   */
  public ExameLaboratorial setElDescricaoResumida(java.lang.String elDescricaoResumida){
    this.elDescricaoResumida = elDescricaoResumida;
    return this;
  }

  /**
   * Obtém elGrupo
   * return elGrupo
   * @generated
   */
  
  public java.lang.String getElGrupo(){
    return this.elGrupo;
  }

  /**
   * Define elGrupo
   * @param elGrupo elGrupo
   * @generated
   */
  public ExameLaboratorial setElGrupo(java.lang.String elGrupo){
    this.elGrupo = elGrupo;
    return this;
  }

  /**
   * Obtém elImpReferencia
   * return elImpReferencia
   * @generated
   */
  
  public java.lang.String getElImpReferencia(){
    return this.elImpReferencia;
  }

  /**
   * Define elImpReferencia
   * @param elImpReferencia elImpReferencia
   * @generated
   */
  public ExameLaboratorial setElImpReferencia(java.lang.String elImpReferencia){
    this.elImpReferencia = elImpReferencia;
    return this;
  }

  /**
   * Obtém elImpResultadoAnt
   * return elImpResultadoAnt
   * @generated
   */
  
  public java.lang.String getElImpResultadoAnt(){
    return this.elImpResultadoAnt;
  }

  /**
   * Define elImpResultadoAnt
   * @param elImpResultadoAnt elImpResultadoAnt
   * @generated
   */
  public ExameLaboratorial setElImpResultadoAnt(java.lang.String elImpResultadoAnt){
    this.elImpResultadoAnt = elImpResultadoAnt;
    return this;
  }

  /**
   * Obtém elImpTituloSn
   * return elImpTituloSn
   * @generated
   */
  
  public java.lang.String getElImpTituloSn(){
    return this.elImpTituloSn;
  }

  /**
   * Define elImpTituloSn
   * @param elImpTituloSn elImpTituloSn
   * @generated
   */
  public ExameLaboratorial setElImpTituloSn(java.lang.String elImpTituloSn){
    this.elImpTituloSn = elImpTituloSn;
    return this;
  }

  /**
   * Obtém elMetodo
   * return elMetodo
   * @generated
   */
  
  public java.lang.String getElMetodo(){
    return this.elMetodo;
  }

  /**
   * Define elMetodo
   * @param elMetodo elMetodo
   * @generated
   */
  public ExameLaboratorial setElMetodo(java.lang.String elMetodo){
    this.elMetodo = elMetodo;
    return this;
  }

  /**
   * Obtém elOrdemLaudo
   * return elOrdemLaudo
   * @generated
   */
  
  public java.lang.Integer getElOrdemLaudo(){
    return this.elOrdemLaudo;
  }

  /**
   * Define elOrdemLaudo
   * @param elOrdemLaudo elOrdemLaudo
   * @generated
   */
  public ExameLaboratorial setElOrdemLaudo(java.lang.Integer elOrdemLaudo){
    this.elOrdemLaudo = elOrdemLaudo;
    return this;
  }

  /**
   * Obtém elTipoResultado
   * return elTipoResultado
   * @generated
   */
  
  public java.lang.String getElTipoResultado(){
    return this.elTipoResultado;
  }

  /**
   * Define elTipoResultado
   * @param elTipoResultado elTipoResultado
   * @generated
   */
  public ExameLaboratorial setElTipoResultado(java.lang.String elTipoResultado){
    this.elTipoResultado = elTipoResultado;
    return this;
  }

  /**
   * Obtém elTituloMaster
   * return elTituloMaster
   * @generated
   */
  
  public java.lang.String getElTituloMaster(){
    return this.elTituloMaster;
  }

  /**
   * Define elTituloMaster
   * @param elTituloMaster elTituloMaster
   * @generated
   */
  public ExameLaboratorial setElTituloMaster(java.lang.String elTituloMaster){
    this.elTituloMaster = elTituloMaster;
    return this;
  }

  /**
   * Obtém elTituloRef1
   * return elTituloRef1
   * @generated
   */
  
  public java.lang.String getElTituloRef1(){
    return this.elTituloRef1;
  }

  /**
   * Define elTituloRef1
   * @param elTituloRef1 elTituloRef1
   * @generated
   */
  public ExameLaboratorial setElTituloRef1(java.lang.String elTituloRef1){
    this.elTituloRef1 = elTituloRef1;
    return this;
  }

  /**
   * Obtém elTituloRef2
   * return elTituloRef2
   * @generated
   */
  
  public java.lang.String getElTituloRef2(){
    return this.elTituloRef2;
  }

  /**
   * Define elTituloRef2
   * @param elTituloRef2 elTituloRef2
   * @generated
   */
  public ExameLaboratorial setElTituloRef2(java.lang.String elTituloRef2){
    this.elTituloRef2 = elTituloRef2;
    return this;
  }

  /**
   * Obtém elValor
   * return elValor
   * @generated
   */
  
  public java.lang.Integer getElValor(){
    return this.elValor;
  }

  /**
   * Define elValor
   * @param elValor elValor
   * @generated
   */
  public ExameLaboratorial setElValor(java.lang.Integer elValor){
    this.elValor = elValor;
    return this;
  }

  /**
   * Obtém idExameLaboratorial
   * return idExameLaboratorial
   * @generated
   */
  
  public java.lang.Integer getIdExameLaboratorial(){
    return this.idExameLaboratorial;
  }

  /**
   * Define idExameLaboratorial
   * @param idExameLaboratorial idExameLaboratorial
   * @generated
   */
  public ExameLaboratorial setIdExameLaboratorial(java.lang.Integer idExameLaboratorial){
    this.idExameLaboratorial = idExameLaboratorial;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ExameLaboratorial object = (ExameLaboratorial)obj;
    if (idExameLaboratorial != null ? !idExameLaboratorial.equals(object.idExameLaboratorial) : object.idExameLaboratorial != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idExameLaboratorial == null) ? 0 : idExameLaboratorial.hashCode());
    return result;
  }

}
