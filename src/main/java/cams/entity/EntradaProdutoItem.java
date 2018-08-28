package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ENTRADA_PRODUTO_ITEM
 * @generated
 */
@Entity
@Table(name = "\"ENTRADA_PRODUTO_ITEM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.EntradaProdutoItem")
public class EntradaProdutoItem implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_ENTRADA_PRODUTO_ITEM", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idEntradaProdutoItem;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_ENTRADA_PRODUTO", nullable = false, referencedColumnName = "ID_ENTRADA_PRODUTO", insertable=true, updatable=true)
  
  private EntradaProduto entradaProduto;

  /**
  * @generated
  */
  @Column(name = "IT_QUANTIDADE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double itQuantidade;

  /**
  * @generated
  */
  @Column(name = "IT_VALOR", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double itValor;

  /**
  * @generated
  */
  @Column(name = "IT_VALOR_TOTAL", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double itValorTotal;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_PRODUTO", nullable = false, referencedColumnName = "ID_PRODUTO", insertable=true, updatable=true)
  
  private Produto produto;

  /**
   * Construtor
   * @generated
   */
  public EntradaProdutoItem(){
  }


  /**
   * Obtém entradaProduto
   * return entradaProduto
   * @generated
   */
  
  public EntradaProduto getEntradaProduto(){
    return this.entradaProduto;
  }

  /**
   * Define entradaProduto
   * @param entradaProduto entradaProduto
   * @generated
   */
  public EntradaProdutoItem setEntradaProduto(EntradaProduto entradaProduto){
    this.entradaProduto = entradaProduto;
    return this;
  }

  /**
   * Obtém idEntradaProdutoItem
   * return idEntradaProdutoItem
   * @generated
   */
  
  public java.lang.Integer getIdEntradaProdutoItem(){
    return this.idEntradaProdutoItem;
  }

  /**
   * Define idEntradaProdutoItem
   * @param idEntradaProdutoItem idEntradaProdutoItem
   * @generated
   */
  public EntradaProdutoItem setIdEntradaProdutoItem(java.lang.Integer idEntradaProdutoItem){
    this.idEntradaProdutoItem = idEntradaProdutoItem;
    return this;
  }

  /**
   * Obtém itQuantidade
   * return itQuantidade
   * @generated
   */
  
  public java.lang.Double getItQuantidade(){
    return this.itQuantidade;
  }

  /**
   * Define itQuantidade
   * @param itQuantidade itQuantidade
   * @generated
   */
  public EntradaProdutoItem setItQuantidade(java.lang.Double itQuantidade){
    this.itQuantidade = itQuantidade;
    return this;
  }

  /**
   * Obtém itValor
   * return itValor
   * @generated
   */
  
  public java.lang.Double getItValor(){
    return this.itValor;
  }

  /**
   * Define itValor
   * @param itValor itValor
   * @generated
   */
  public EntradaProdutoItem setItValor(java.lang.Double itValor){
    this.itValor = itValor;
    return this;
  }

  /**
   * Obtém itValorTotal
   * return itValorTotal
   * @generated
   */
  
  public java.lang.Double getItValorTotal(){
    return this.itValorTotal;
  }

  /**
   * Define itValorTotal
   * @param itValorTotal itValorTotal
   * @generated
   */
  public EntradaProdutoItem setItValorTotal(java.lang.Double itValorTotal){
    this.itValorTotal = itValorTotal;
    return this;
  }

  /**
   * Obtém produto
   * return produto
   * @generated
   */
  
  public Produto getProduto(){
    return this.produto;
  }

  /**
   * Define produto
   * @param produto produto
   * @generated
   */
  public EntradaProdutoItem setProduto(Produto produto){
    this.produto = produto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    EntradaProdutoItem object = (EntradaProdutoItem)obj;
    if (idEntradaProdutoItem != null ? !idEntradaProdutoItem.equals(object.idEntradaProdutoItem) : object.idEntradaProdutoItem != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idEntradaProdutoItem == null) ? 0 : idEntradaProdutoItem.hashCode());
    return result;
  }

}
