package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela MOVIMENTACAO_BANCARIA
 * @generated
 */
@Entity
@Table(name = "\"MOVIMENTACAO_BANCARIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.MovimentacaoBancaria")
public class MovimentacaoBancaria implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_LANCAMENTO", nullable = false, length=40, insertable=true, updatable=true)
  private java.lang.Integer idLancamento;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_CONTA_CORRENTE", nullable = false, referencedColumnName = "ID_CONTA_CORRENTE", insertable=true, updatable=true)
  
  private ContaCorrente contaCorrente;

  /**
  * @generated
  */
  @Column(name = "MB_CHEQUE", nullable = true, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mbCheque;

  /**
  * @generated
  */
  @Column(name = "MB_CONCILIADO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String mbConciliado;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "MB_DATA", nullable = false, unique = false, length=400, insertable=true, updatable=true)
  
  private java.util.Date mbData;

  /**
  * @generated
  */
  @Column(name = "MB_HISTORICO", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String mbHistorico;

  /**
  * @generated
  */
  @Column(name = "MB_OPERACAO", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.String mbOperacao;

  /**
  * @generated
  */
  @Column(name = "MB_VALOR", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double mbValor;

  /**
   * Construtor
   * @generated
   */
  public MovimentacaoBancaria(){
  }


  /**
   * Obtém contaCorrente
   * return contaCorrente
   * @generated
   */
  
  public ContaCorrente getContaCorrente(){
    return this.contaCorrente;
  }

  /**
   * Define contaCorrente
   * @param contaCorrente contaCorrente
   * @generated
   */
  public MovimentacaoBancaria setContaCorrente(ContaCorrente contaCorrente){
    this.contaCorrente = contaCorrente;
    return this;
  }

  /**
   * Obtém idLancamento
   * return idLancamento
   * @generated
   */
  
  public java.lang.Integer getIdLancamento(){
    return this.idLancamento;
  }

  /**
   * Define idLancamento
   * @param idLancamento idLancamento
   * @generated
   */
  public MovimentacaoBancaria setIdLancamento(java.lang.Integer idLancamento){
    this.idLancamento = idLancamento;
    return this;
  }

  /**
   * Obtém mbCheque
   * return mbCheque
   * @generated
   */
  
  public java.lang.String getMbCheque(){
    return this.mbCheque;
  }

  /**
   * Define mbCheque
   * @param mbCheque mbCheque
   * @generated
   */
  public MovimentacaoBancaria setMbCheque(java.lang.String mbCheque){
    this.mbCheque = mbCheque;
    return this;
  }

  /**
   * Obtém mbConciliado
   * return mbConciliado
   * @generated
   */
  
  public java.lang.String getMbConciliado(){
    return this.mbConciliado;
  }

  /**
   * Define mbConciliado
   * @param mbConciliado mbConciliado
   * @generated
   */
  public MovimentacaoBancaria setMbConciliado(java.lang.String mbConciliado){
    this.mbConciliado = mbConciliado;
    return this;
  }

  /**
   * Obtém mbData
   * return mbData
   * @generated
   */
  
  public java.util.Date getMbData(){
    return this.mbData;
  }

  /**
   * Define mbData
   * @param mbData mbData
   * @generated
   */
  public MovimentacaoBancaria setMbData(java.util.Date mbData){
    this.mbData = mbData;
    return this;
  }

  /**
   * Obtém mbHistorico
   * return mbHistorico
   * @generated
   */
  
  public java.lang.String getMbHistorico(){
    return this.mbHistorico;
  }

  /**
   * Define mbHistorico
   * @param mbHistorico mbHistorico
   * @generated
   */
  public MovimentacaoBancaria setMbHistorico(java.lang.String mbHistorico){
    this.mbHistorico = mbHistorico;
    return this;
  }

  /**
   * Obtém mbOperacao
   * return mbOperacao
   * @generated
   */
  
  public java.lang.String getMbOperacao(){
    return this.mbOperacao;
  }

  /**
   * Define mbOperacao
   * @param mbOperacao mbOperacao
   * @generated
   */
  public MovimentacaoBancaria setMbOperacao(java.lang.String mbOperacao){
    this.mbOperacao = mbOperacao;
    return this;
  }

  /**
   * Obtém mbValor
   * return mbValor
   * @generated
   */
  
  public java.lang.Double getMbValor(){
    return this.mbValor;
  }

  /**
   * Define mbValor
   * @param mbValor mbValor
   * @generated
   */
  public MovimentacaoBancaria setMbValor(java.lang.Double mbValor){
    this.mbValor = mbValor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    MovimentacaoBancaria object = (MovimentacaoBancaria)obj;
    if (idLancamento != null ? !idLancamento.equals(object.idLancamento) : object.idLancamento != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idLancamento == null) ? 0 : idLancamento.hashCode());
    return result;
  }

}
