package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CLIENTEEMPRESA
 * @generated
 */
@Entity
@Table(name = "\"CLIENTEEMPRESA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ClienteEmpresa")
public class ClienteEmpresa implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Cliente cliente;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_empresa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Empresa empresa;

  /**
   * Construtor
   * @generated
   */
  public ClienteEmpresa(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public ClienteEmpresa setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém cliente
   * return cliente
   * @generated
   */
  
  public Cliente getCliente(){
    return this.cliente;
  }

  /**
   * Define cliente
   * @param cliente cliente
   * @generated
   */
  public ClienteEmpresa setCliente(Cliente cliente){
    this.cliente = cliente;
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
  public ClienteEmpresa setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ClienteEmpresa object = (ClienteEmpresa)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
