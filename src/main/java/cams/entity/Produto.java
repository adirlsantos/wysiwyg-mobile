package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.Produto")
public class Produto implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_PRODUTO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idProduto;

  /**
  * @generated
  */
  @Column(name = "PR_CODIGO_BEN", nullable = true, unique = false, length=20, insertable=true, updatable=true)
  
  private java.lang.String prCodigoBen;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "PR_DATA_ENTRADA", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date prDataEntrada;

  /**
  * @generated
  */
  @Column(name = "PR_ENTRADAS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double prEntradas;

  /**
  * @generated
  */
  @Column(name = "PR_NOME", nullable = false, unique = false, length=100, insertable=true, updatable=true)
  
  private java.lang.String prNome;

  /**
  * @generated
  */
  @Column(name = "PR_PRECO_MEDIO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double prPrecoMedio;

  /**
  * @generated
  */
  @Column(name = "PR_SAIDAS", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double prSaidas;

  /**
  * @generated
  */
  @Column(name = "PR_SALDO_ANTERIOR", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double prSaldoAnterior;

  /**
  * @generated
  */
  @Column(name = "PR_TIPO", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String prTipo;

  /**
  * @generated
  */
  @Column(name = "PR_ULTIMO_PRECO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double prUltimoPreco;

  /**
   * Construtor
   * @generated
   */
  public Produto(){
  }


  /**
   * Obtém idProduto
   * return idProduto
   * @generated
   */
  
  public java.lang.Integer getIdProduto(){
    return this.idProduto;
  }

  /**
   * Define idProduto
   * @param idProduto idProduto
   * @generated
   */
  public Produto setIdProduto(java.lang.Integer idProduto){
    this.idProduto = idProduto;
    return this;
  }

  /**
   * Obtém prCodigoBen
   * return prCodigoBen
   * @generated
   */
  
  public java.lang.String getPrCodigoBen(){
    return this.prCodigoBen;
  }

  /**
   * Define prCodigoBen
   * @param prCodigoBen prCodigoBen
   * @generated
   */
  public Produto setPrCodigoBen(java.lang.String prCodigoBen){
    this.prCodigoBen = prCodigoBen;
    return this;
  }

  /**
   * Obtém prDataEntrada
   * return prDataEntrada
   * @generated
   */
  
  public java.util.Date getPrDataEntrada(){
    return this.prDataEntrada;
  }

  /**
   * Define prDataEntrada
   * @param prDataEntrada prDataEntrada
   * @generated
   */
  public Produto setPrDataEntrada(java.util.Date prDataEntrada){
    this.prDataEntrada = prDataEntrada;
    return this;
  }

  /**
   * Obtém prEntradas
   * return prEntradas
   * @generated
   */
  
  public java.lang.Double getPrEntradas(){
    return this.prEntradas;
  }

  /**
   * Define prEntradas
   * @param prEntradas prEntradas
   * @generated
   */
  public Produto setPrEntradas(java.lang.Double prEntradas){
    this.prEntradas = prEntradas;
    return this;
  }

  /**
   * Obtém prNome
   * return prNome
   * @generated
   */
  
  public java.lang.String getPrNome(){
    return this.prNome;
  }

  /**
   * Define prNome
   * @param prNome prNome
   * @generated
   */
  public Produto setPrNome(java.lang.String prNome){
    this.prNome = prNome;
    return this;
  }

  /**
   * Obtém prPrecoMedio
   * return prPrecoMedio
   * @generated
   */
  
  public java.lang.Double getPrPrecoMedio(){
    return this.prPrecoMedio;
  }

  /**
   * Define prPrecoMedio
   * @param prPrecoMedio prPrecoMedio
   * @generated
   */
  public Produto setPrPrecoMedio(java.lang.Double prPrecoMedio){
    this.prPrecoMedio = prPrecoMedio;
    return this;
  }

  /**
   * Obtém prSaidas
   * return prSaidas
   * @generated
   */
  
  public java.lang.Double getPrSaidas(){
    return this.prSaidas;
  }

  /**
   * Define prSaidas
   * @param prSaidas prSaidas
   * @generated
   */
  public Produto setPrSaidas(java.lang.Double prSaidas){
    this.prSaidas = prSaidas;
    return this;
  }

  /**
   * Obtém prSaldoAnterior
   * return prSaldoAnterior
   * @generated
   */
  
  public java.lang.Double getPrSaldoAnterior(){
    return this.prSaldoAnterior;
  }

  /**
   * Define prSaldoAnterior
   * @param prSaldoAnterior prSaldoAnterior
   * @generated
   */
  public Produto setPrSaldoAnterior(java.lang.Double prSaldoAnterior){
    this.prSaldoAnterior = prSaldoAnterior;
    return this;
  }

  /**
   * Obtém prTipo
   * return prTipo
   * @generated
   */
  
  public java.lang.String getPrTipo(){
    return this.prTipo;
  }

  /**
   * Define prTipo
   * @param prTipo prTipo
   * @generated
   */
  public Produto setPrTipo(java.lang.String prTipo){
    this.prTipo = prTipo;
    return this;
  }

  /**
   * Obtém prUltimoPreco
   * return prUltimoPreco
   * @generated
   */
  
  public java.lang.Double getPrUltimoPreco(){
    return this.prUltimoPreco;
  }

  /**
   * Define prUltimoPreco
   * @param prUltimoPreco prUltimoPreco
   * @generated
   */
  public Produto setPrUltimoPreco(java.lang.Double prUltimoPreco){
    this.prUltimoPreco = prUltimoPreco;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produto object = (Produto)obj;
    if (idProduto != null ? !idProduto.equals(object.idProduto) : object.idProduto != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idProduto == null) ? 0 : idProduto.hashCode());
    return result;
  }

}
