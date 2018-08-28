package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela SAIDA_PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"SAIDA_PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.SaidaProduto")
public class SaidaProduto implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_SAIDA_PRODUTO", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idSaidaProduto;

  /**
  * @generated
  */
  @Column(name = "EN_ATUALIZADO_ESTOQUE", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.String enAtualizadoEstoque;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "EN_SAIDA", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date enSaida;

  /**
  * @generated
  */
  @Column(name = "EN_VALOR_TOTAL", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Double enValorTotal;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_FUNCIONARIO", nullable = true, referencedColumnName = "ID_FUNCIONARIO", insertable=true, updatable=true)
  
  private Funcionario funcionario;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_SETOR", nullable = false, referencedColumnName = "ID_SETOR", insertable=true, updatable=true)
  
  private Setor setor;

  /**
   * Construtor
   * @generated
   */
  public SaidaProduto(){
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
  public SaidaProduto setEnAtualizadoEstoque(java.lang.String enAtualizadoEstoque){
    this.enAtualizadoEstoque = enAtualizadoEstoque;
    return this;
  }

  /**
   * Obtém enSaida
   * return enSaida
   * @generated
   */
  
  public java.util.Date getEnSaida(){
    return this.enSaida;
  }

  /**
   * Define enSaida
   * @param enSaida enSaida
   * @generated
   */
  public SaidaProduto setEnSaida(java.util.Date enSaida){
    this.enSaida = enSaida;
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
  public SaidaProduto setEnValorTotal(java.lang.Double enValorTotal){
    this.enValorTotal = enValorTotal;
    return this;
  }

  /**
   * Obtém funcionario
   * return funcionario
   * @generated
   */
  
  public Funcionario getFuncionario(){
    return this.funcionario;
  }

  /**
   * Define funcionario
   * @param funcionario funcionario
   * @generated
   */
  public SaidaProduto setFuncionario(Funcionario funcionario){
    this.funcionario = funcionario;
    return this;
  }

  /**
   * Obtém idSaidaProduto
   * return idSaidaProduto
   * @generated
   */
  
  public java.lang.Integer getIdSaidaProduto(){
    return this.idSaidaProduto;
  }

  /**
   * Define idSaidaProduto
   * @param idSaidaProduto idSaidaProduto
   * @generated
   */
  public SaidaProduto setIdSaidaProduto(java.lang.Integer idSaidaProduto){
    this.idSaidaProduto = idSaidaProduto;
    return this;
  }

  /**
   * Obtém setor
   * return setor
   * @generated
   */
  
  public Setor getSetor(){
    return this.setor;
  }

  /**
   * Define setor
   * @param setor setor
   * @generated
   */
  public SaidaProduto setSetor(Setor setor){
    this.setor = setor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    SaidaProduto object = (SaidaProduto)obj;
    if (idSaidaProduto != null ? !idSaidaProduto.equals(object.idSaidaProduto) : object.idSaidaProduto != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idSaidaProduto == null) ? 0 : idSaidaProduto.hashCode());
    return result;
  }

}
