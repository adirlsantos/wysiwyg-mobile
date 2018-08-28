package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CONTRIBUICAO_MENSAL_VIUVA
 * @generated
 */
@Entity
@Table(name = "\"CONTRIBUICAO_MENSAL_VIUVA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.ContribuicaoMensalViuva")
public class ContribuicaoMensalViuva implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_CONTRIBUICAO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idContribuicao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "CM_DATA_PAGAMENTO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date cmDataPagamento;

  /**
  * @generated
  */
  @Column(name = "CM_EXERCICIO", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String cmExercicio;

  /**
  * @generated
  */
  @Column(name = "CM_LOTE_ENVIO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer cmLoteEnvio;

  /**
  * @generated
  */
  @Column(name = "CM_OBSERVACAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String cmObservacao;

  /**
  * @generated
  */
  @Column(name = "CM_REFERENCIA", nullable = true, unique = false, length=6, insertable=true, updatable=true)
  
  private java.lang.String cmReferencia;

  /**
  * @generated
  */
  @Column(name = "CM_VALOR_ACRESCIMO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double cmValorAcrescimo;

  /**
  * @generated
  */
  @Column(name = "CM_VALOR_DESCONTO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double cmValorDesconto;

  /**
  * @generated
  */
  @Column(name = "CM_VALOR_DEVIDO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double cmValorDevido;

  /**
  * @generated
  */
  @Column(name = "CM_VALOR_PAGO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double cmValorPago;

  /**
  * @generated
  */
  @Column(name = "ID_AGENCIA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idAgencia;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_VIUVA", nullable = false, referencedColumnName = "ID_VIUVA", insertable=true, updatable=true)
  
  private Viuva viuva;

  /**
   * Construtor
   * @generated
   */
  public ContribuicaoMensalViuva(){
  }


  /**
   * Obtém cmDataPagamento
   * return cmDataPagamento
   * @generated
   */
  
  public java.util.Date getCmDataPagamento(){
    return this.cmDataPagamento;
  }

  /**
   * Define cmDataPagamento
   * @param cmDataPagamento cmDataPagamento
   * @generated
   */
  public ContribuicaoMensalViuva setCmDataPagamento(java.util.Date cmDataPagamento){
    this.cmDataPagamento = cmDataPagamento;
    return this;
  }

  /**
   * Obtém cmExercicio
   * return cmExercicio
   * @generated
   */
  
  public java.lang.String getCmExercicio(){
    return this.cmExercicio;
  }

  /**
   * Define cmExercicio
   * @param cmExercicio cmExercicio
   * @generated
   */
  public ContribuicaoMensalViuva setCmExercicio(java.lang.String cmExercicio){
    this.cmExercicio = cmExercicio;
    return this;
  }

  /**
   * Obtém cmLoteEnvio
   * return cmLoteEnvio
   * @generated
   */
  
  public java.lang.Integer getCmLoteEnvio(){
    return this.cmLoteEnvio;
  }

  /**
   * Define cmLoteEnvio
   * @param cmLoteEnvio cmLoteEnvio
   * @generated
   */
  public ContribuicaoMensalViuva setCmLoteEnvio(java.lang.Integer cmLoteEnvio){
    this.cmLoteEnvio = cmLoteEnvio;
    return this;
  }

  /**
   * Obtém cmObservacao
   * return cmObservacao
   * @generated
   */
  
  public java.lang.String getCmObservacao(){
    return this.cmObservacao;
  }

  /**
   * Define cmObservacao
   * @param cmObservacao cmObservacao
   * @generated
   */
  public ContribuicaoMensalViuva setCmObservacao(java.lang.String cmObservacao){
    this.cmObservacao = cmObservacao;
    return this;
  }

  /**
   * Obtém cmReferencia
   * return cmReferencia
   * @generated
   */
  
  public java.lang.String getCmReferencia(){
    return this.cmReferencia;
  }

  /**
   * Define cmReferencia
   * @param cmReferencia cmReferencia
   * @generated
   */
  public ContribuicaoMensalViuva setCmReferencia(java.lang.String cmReferencia){
    this.cmReferencia = cmReferencia;
    return this;
  }

  /**
   * Obtém cmValorAcrescimo
   * return cmValorAcrescimo
   * @generated
   */
  
  public java.lang.Double getCmValorAcrescimo(){
    return this.cmValorAcrescimo;
  }

  /**
   * Define cmValorAcrescimo
   * @param cmValorAcrescimo cmValorAcrescimo
   * @generated
   */
  public ContribuicaoMensalViuva setCmValorAcrescimo(java.lang.Double cmValorAcrescimo){
    this.cmValorAcrescimo = cmValorAcrescimo;
    return this;
  }

  /**
   * Obtém cmValorDesconto
   * return cmValorDesconto
   * @generated
   */
  
  public java.lang.Double getCmValorDesconto(){
    return this.cmValorDesconto;
  }

  /**
   * Define cmValorDesconto
   * @param cmValorDesconto cmValorDesconto
   * @generated
   */
  public ContribuicaoMensalViuva setCmValorDesconto(java.lang.Double cmValorDesconto){
    this.cmValorDesconto = cmValorDesconto;
    return this;
  }

  /**
   * Obtém cmValorDevido
   * return cmValorDevido
   * @generated
   */
  
  public java.lang.Double getCmValorDevido(){
    return this.cmValorDevido;
  }

  /**
   * Define cmValorDevido
   * @param cmValorDevido cmValorDevido
   * @generated
   */
  public ContribuicaoMensalViuva setCmValorDevido(java.lang.Double cmValorDevido){
    this.cmValorDevido = cmValorDevido;
    return this;
  }

  /**
   * Obtém cmValorPago
   * return cmValorPago
   * @generated
   */
  
  public java.lang.Double getCmValorPago(){
    return this.cmValorPago;
  }

  /**
   * Define cmValorPago
   * @param cmValorPago cmValorPago
   * @generated
   */
  public ContribuicaoMensalViuva setCmValorPago(java.lang.Double cmValorPago){
    this.cmValorPago = cmValorPago;
    return this;
  }

  /**
   * Obtém idAgencia
   * return idAgencia
   * @generated
   */
  
  public java.lang.Integer getIdAgencia(){
    return this.idAgencia;
  }

  /**
   * Define idAgencia
   * @param idAgencia idAgencia
   * @generated
   */
  public ContribuicaoMensalViuva setIdAgencia(java.lang.Integer idAgencia){
    this.idAgencia = idAgencia;
    return this;
  }

  /**
   * Obtém idContribuicao
   * return idContribuicao
   * @generated
   */
  
  public java.lang.Integer getIdContribuicao(){
    return this.idContribuicao;
  }

  /**
   * Define idContribuicao
   * @param idContribuicao idContribuicao
   * @generated
   */
  public ContribuicaoMensalViuva setIdContribuicao(java.lang.Integer idContribuicao){
    this.idContribuicao = idContribuicao;
    return this;
  }

  /**
   * Obtém viuva
   * return viuva
   * @generated
   */
  
  public Viuva getViuva(){
    return this.viuva;
  }

  /**
   * Define viuva
   * @param viuva viuva
   * @generated
   */
  public ContribuicaoMensalViuva setViuva(Viuva viuva){
    this.viuva = viuva;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ContribuicaoMensalViuva object = (ContribuicaoMensalViuva)obj;
    if (idContribuicao != null ? !idContribuicao.equals(object.idContribuicao) : object.idContribuicao != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idContribuicao == null) ? 0 : idContribuicao.hashCode());
    return result;
  }

}
