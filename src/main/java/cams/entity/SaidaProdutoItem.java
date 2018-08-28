package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SAIDA_PRODUTO_ITEM
 * @generated
 */
@Entity
@Table(name = "\"SAIDA_PRODUTO_ITEM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.SaidaProdutoItem")
public class SaidaProdutoItem implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_SAIDA_PRODUTO_ITEM", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idSaidaProdutoItem;

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
  @Column(name = "IT_VALOR_TOTAL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double itValorTotal;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_PRODUTO", nullable = false, referencedColumnName = "ID_PRODUTO", insertable=true, updatable=true)
  
  private Produto produto;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SAIDA_PRODUTO", nullable = false, referencedColumnName = "ID_SAIDA_PRODUTO", insertable=true, updatable=true)
  
  private SaidaProduto saidaProduto;

  /**
   * Construtor
   * @generated
   */
  public SaidaProdutoItem(){
  }


  /**
   * Obtém idSaidaProdutoItem
   * return idSaidaProdutoItem
   * @generated
   */
  
  public java.lang.Integer getIdSaidaProdutoItem(){
    return this.idSaidaProdutoItem;
  }

  /**
   * Define idSaidaProdutoItem
   * @param idSaidaProdutoItem idSaidaProdutoItem
   * @generated
   */
  public SaidaProdutoItem setIdSaidaProdutoItem(java.lang.Integer idSaidaProdutoItem){
    this.idSaidaProdutoItem = idSaidaProdutoItem;
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
  public SaidaProdutoItem setItQuantidade(java.lang.Double itQuantidade){
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
  public SaidaProdutoItem setItValor(java.lang.Double itValor){
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
  public SaidaProdutoItem setItValorTotal(java.lang.Double itValorTotal){
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
  public SaidaProdutoItem setProduto(Produto produto){
    this.produto = produto;
    return this;
  }

  /**
   * Obtém saidaProduto
   * return saidaProduto
   * @generated
   */
  
  public SaidaProduto getSaidaProduto(){
    return this.saidaProduto;
  }

  /**
   * Define saidaProduto
   * @param saidaProduto saidaProduto
   * @generated
   */
  public SaidaProdutoItem setSaidaProduto(SaidaProduto saidaProduto){
    this.saidaProduto = saidaProduto;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    SaidaProdutoItem object = (SaidaProdutoItem)obj;
    if (idSaidaProdutoItem != null ? !idSaidaProdutoItem.equals(object.idSaidaProdutoItem) : object.idSaidaProdutoItem != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idSaidaProdutoItem == null) ? 0 : idSaidaProdutoItem.hashCode());
    return result;
  }

}
