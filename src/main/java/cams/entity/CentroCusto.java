package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CENTRO_CUSTO
 * @generated
 */
@Entity
@Table(name = "\"CENTRO_CUSTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.CentroCusto")
public class CentroCusto implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_CUSTO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idCusto;

  /**
  * @generated
  */
  @Column(name = "CU_DESCRICAO", nullable = false, unique = false, length=60, insertable=true, updatable=true)
  
  private java.lang.String cuDescricao;

  /**
  * @generated
  */
  @Column(name = "CU_OBSERVACAO", nullable = true, unique = false, length=80, insertable=true, updatable=true)
  
  private java.lang.String cuObservacao;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "DT_UPDATE", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.util.Date dtUpdate;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_EMPRESA", nullable = false, referencedColumnName = "ID_EMPRESA", insertable=true, updatable=true)
  
  private Empresa empresa;

  /**
  * @generated
  */
  @Column(name = "ID_USUARIO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer idUsuario;

  /**
   * Construtor
   * @generated
   */
  public CentroCusto(){
  }


  /**
   * Obtém cuDescricao
   * return cuDescricao
   * @generated
   */
  
  public java.lang.String getCuDescricao(){
    return this.cuDescricao;
  }

  /**
   * Define cuDescricao
   * @param cuDescricao cuDescricao
   * @generated
   */
  public CentroCusto setCuDescricao(java.lang.String cuDescricao){
    this.cuDescricao = cuDescricao;
    return this;
  }

  /**
   * Obtém cuObservacao
   * return cuObservacao
   * @generated
   */
  
  public java.lang.String getCuObservacao(){
    return this.cuObservacao;
  }

  /**
   * Define cuObservacao
   * @param cuObservacao cuObservacao
   * @generated
   */
  public CentroCusto setCuObservacao(java.lang.String cuObservacao){
    this.cuObservacao = cuObservacao;
    return this;
  }

  /**
   * Obtém dtUpdate
   * return dtUpdate
   * @generated
   */
  
  public java.util.Date getDtUpdate(){
    return this.dtUpdate;
  }

  /**
   * Define dtUpdate
   * @param dtUpdate dtUpdate
   * @generated
   */
  public CentroCusto setDtUpdate(java.util.Date dtUpdate){
    this.dtUpdate = dtUpdate;
    return this;
  }

  /**
   * Obtém empresa
   * return empresa
   * @generated
   */
  
  public Empresa getEmpresa(){
    return this.empresa;
  }

  /**
   * Define empresa
   * @param empresa empresa
   * @generated
   */
  public CentroCusto setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }

  /**
   * Obtém idCusto
   * return idCusto
   * @generated
   */
  
  public java.lang.Integer getIdCusto(){
    return this.idCusto;
  }

  /**
   * Define idCusto
   * @param idCusto idCusto
   * @generated
   */
  public CentroCusto setIdCusto(java.lang.Integer idCusto){
    this.idCusto = idCusto;
    return this;
  }

  /**
   * Obtém idUsuario
   * return idUsuario
   * @generated
   */
  
  public java.lang.Integer getIdUsuario(){
    return this.idUsuario;
  }

  /**
   * Define idUsuario
   * @param idUsuario idUsuario
   * @generated
   */
  public CentroCusto setIdUsuario(java.lang.Integer idUsuario){
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    CentroCusto object = (CentroCusto)obj;
    if (idCusto != null ? !idCusto.equals(object.idCusto) : object.idCusto != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idCusto == null) ? 0 : idCusto.hashCode());
    return result;
  }

}
