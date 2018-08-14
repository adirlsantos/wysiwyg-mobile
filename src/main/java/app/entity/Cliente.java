package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiByteHeaderSignature;


/**
 * Classe que representa a tabela CLIENTE
 * @generated
 */
@Entity
@Table(name = "\"CLIENTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cliente")
public class Cliente implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "foto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] foto;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_municipio", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Municipio municipio;

  /**
  * @generated
  */
  @Column(name = "ativo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean ativo;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "nascimento", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date nascimento;

  /**
  * @generated
  */
  @Column(name = "credito", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double credito;

  /**
  * @generated
  */
  @Column(name = "arquivo", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiByteHeaderSignature
  
  private byte[] arquivo;

  /**
  * @generated
  */
  @Column(name = "revendedor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean revendedor;

  /**
   * Construtor
   * @generated
   */
  public Cliente(){
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
  public Cliente setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Cliente setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém foto
   * return foto
   * @generated
   */
  
  public byte[] getFoto(){
    return this.foto;
  }

  /**
   * Define foto
   * @param foto foto
   * @generated
   */
  public Cliente setFoto(byte[] foto){
    this.foto = foto;
    return this;
  }

  /**
   * Obtém municipio
   * return municipio
   * @generated
   */
  
  public Municipio getMunicipio(){
    return this.municipio;
  }

  /**
   * Define municipio
   * @param municipio municipio
   * @generated
   */
  public Cliente setMunicipio(Municipio municipio){
    this.municipio = municipio;
    return this;
  }

  /**
   * Obtém ativo
   * return ativo
   * @generated
   */
  
  public java.lang.Boolean getAtivo(){
    return this.ativo;
  }

  /**
   * Define ativo
   * @param ativo ativo
   * @generated
   */
  public Cliente setAtivo(java.lang.Boolean ativo){
    this.ativo = ativo;
    return this;
  }

  /**
   * Obtém nascimento
   * return nascimento
   * @generated
   */
  
  public java.util.Date getNascimento(){
    return this.nascimento;
  }

  /**
   * Define nascimento
   * @param nascimento nascimento
   * @generated
   */
  public Cliente setNascimento(java.util.Date nascimento){
    this.nascimento = nascimento;
    return this;
  }

  /**
   * Obtém credito
   * return credito
   * @generated
   */
  
  public java.lang.Double getCredito(){
    return this.credito;
  }

  /**
   * Define credito
   * @param credito credito
   * @generated
   */
  public Cliente setCredito(java.lang.Double credito){
    this.credito = credito;
    return this;
  }

  /**
   * Obtém arquivo
   * return arquivo
   * @generated
   */
  
  public byte[] getArquivo(){
    return this.arquivo;
  }

  /**
   * Define arquivo
   * @param arquivo arquivo
   * @generated
   */
  public Cliente setArquivo(byte[] arquivo){
    this.arquivo = arquivo;
    return this;
  }

  /**
   * Obtém revendedor
   * return revendedor
   * @generated
   */
  
  public java.lang.Boolean getRevendedor(){
    return this.revendedor;
  }

  /**
   * Define revendedor
   * @param revendedor revendedor
   * @generated
   */
  public Cliente setRevendedor(java.lang.Boolean revendedor){
    this.revendedor = revendedor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cliente object = (Cliente)obj;
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
