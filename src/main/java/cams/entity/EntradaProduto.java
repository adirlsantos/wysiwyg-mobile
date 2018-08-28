package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ENTRADA_PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"ENTRADA_PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.EntradaProduto")
public class EntradaProduto implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_ENTRADA_PRODUTO", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idEntradaProduto;

  /**
  * @generated
  */
  @Column(name = "EN_ATUALIZADO_ESTOQUE", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String enAtualizadoEstoque;

  /**
  * @generated
  */
  @Column(name = "EN_CHAVE", nullable = true, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String enChave;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "EN_DATA", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date enData;

  /**
  * @generated
  */
  @Column(name = "EN_DESCONTO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double enDesconto;

  /**
  * @generated
  */
  @Column(name = "EN_NUMERO_NOTA", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer enNumeroNota;

  /**
  * @generated
  */
  @Column(name = "EN_VALOR_ACRESCIMO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double enValorAcrescimo;

  /**
  * @generated
  */
  @Column(name = "EN_VALOR_NOTA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double enValorNota;

  /**
  * @generated
  */
  @Column(name = "EN_VALOR_TOTAL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double enValorTotal;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_FORNECEDOR", nullable = false, referencedColumnName = "ID_FORNECEDOR", insertable=true, updatable=true)
  
  private Fornecedor fornecedor;

  /**
   * Construtor
   * @generated
   */
  public EntradaProduto(){
  }


  /**
   * Obtém enAtualizadoEstoque
   * return enAtualizadoEstoque
   * @generated
   */
  
  public java.lang.String getEnAtualizadoEstoque(){
    return this.enAtualizadoEstoque;
  }

  /**
   * Define enAtualizadoEstoque
   * @param enAtualizadoEstoque enAtualizadoEstoque
   * @generated
   */
  public EntradaProduto setEnAtualizadoEstoque(java.lang.String enAtualizadoEstoque){
    this.enAtualizadoEstoque = enAtualizadoEstoque;
    return this;
  }

  /**
   * Obtém enChave
   * return enChave
   * @generated
   */
  
  public java.lang.String getEnChave(){
    return this.enChave;
  }

  /**
   * Define enChave
   * @param enChave enChave
   * @generated
   */
  public EntradaProduto setEnChave(java.lang.String enChave){
    this.enChave = enChave;
    return this;
  }

  /**
   * Obtém enData
   * return enData
   * @generated
   */
  
  public java.util.Date getEnData(){
    return this.enData;
  }

  /**
   * Define enData
   * @param enData enData
   * @generated
   */
  public EntradaProduto setEnData(java.util.Date enData){
    this.enData = enData;
    return this;
  }

  /**
   * Obtém enDesconto
   * return enDesconto
   * @generated
   */
  
  public java.lang.Double getEnDesconto(){
    return this.enDesconto;
  }

  /**
   * Define enDesconto
   * @param enDesconto enDesconto
   * @generated
   */
  public EntradaProduto setEnDesconto(java.lang.Double enDesconto){
    this.enDesconto = enDesconto;
    return this;
  }

  /**
   * Obtém enNumeroNota
   * return enNumeroNota
   * @generated
   */
  
  public java.lang.Integer getEnNumeroNota(){
    return this.enNumeroNota;
  }

  /**
   * Define enNumeroNota
   * @param enNumeroNota enNumeroNota
   * @generated
   */
  public EntradaProduto setEnNumeroNota(java.lang.Integer enNumeroNota){
    this.enNumeroNota = enNumeroNota;
    return this;
  }

  /**
   * Obtém enValorAcrescimo
   * return enValorAcrescimo
   * @generated
   */
  
  public java.lang.Double getEnValorAcrescimo(){
    return this.enValorAcrescimo;
  }

  /**
   * Define enValorAcrescimo
   * @param enValorAcrescimo enValorAcrescimo
   * @generated
   */
  public EntradaProduto setEnValorAcrescimo(java.lang.Double enValorAcrescimo){
    this.enValorAcrescimo = enValorAcrescimo;
    return this;
  }

  /**
   * Obtém enValorNota
   * return enValorNota
   * @generated
   */
  
  public java.lang.Double getEnValorNota(){
    return this.enValorNota;
  }

  /**
   * Define enValorNota
   * @param enValorNota enValorNota
   * @generated
   */
  public EntradaProduto setEnValorNota(java.lang.Double enValorNota){
    this.enValorNota = enValorNota;
    return this;
  }

  /**
   * Obtém enValorTotal
   * return enValorTotal
   * @generated
   */
  
  public java.lang.Double getEnValorTotal(){
    return this.enValorTotal;
  }

  /**
   * Define enValorTotal
   * @param enValorTotal enValorTotal
   * @generated
   */
  public EntradaProduto setEnValorTotal(java.lang.Double enValorTotal){
    this.enValorTotal = enValorTotal;
    return this;
  }

  /**
   * Obtém fornecedor
   * return fornecedor
   * @generated
   */
  
  public Fornecedor getFornecedor(){
    return this.fornecedor;
  }

  /**
   * Define fornecedor
   * @param fornecedor fornecedor
   * @generated
   */
  public EntradaProduto setFornecedor(Fornecedor fornecedor){
    this.fornecedor = fornecedor;
    return this;
  }

  /**
   * Obtém idEntradaProduto
   * return idEntradaProduto
   * @generated
   */
  
  public java.lang.Integer getIdEntradaProduto(){
    return this.idEntradaProduto;
  }

  /**
   * Define idEntradaProduto
   * @param idEntradaProduto idEntradaProduto
   * @generated
   */
  public EntradaProduto setIdEntradaProduto(java.lang.Integer idEntradaProduto){
    this.idEntradaProduto = idEntradaProduto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    EntradaProduto object = (EntradaProduto)obj;
    if (idEntradaProduto != null ? !idEntradaProduto.equals(object.idEntradaProduto) : object.idEntradaProduto != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idEntradaProduto == null) ? 0 : idEntradaProduto.hashCode());
    return result;
  }

}
