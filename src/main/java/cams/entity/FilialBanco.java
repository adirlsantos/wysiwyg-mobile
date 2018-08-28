package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FILIAL_BANCO
 * @generated
 */
@Entity
@Table(name = "\"FILIAL_BANCO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.FilialBanco")
public class FilialBanco implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_FILIAL_BANCO", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer idFilialBanco;

  /**
  * @generated
  */
  @Column(name = "FB_NUM_ARQUIVO_BANCO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer fbNumArquivoBanco;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_FILIAL", nullable = false, referencedColumnName = "ID_FILIAL", insertable=true, updatable=true)
  
  private Filial filial;

  /**
  * @generated
  */
  @Column(name = "ID_EMPRESA", nullable = false, unique = false, length=255, insertable=true, updatable=true)
  
  private java.lang.Integer idEmpresa;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_LAYOUT", nullable = false, referencedColumnName = "ID_LAYOUT", insertable=true, updatable=true)
  
  private Layout layout;

  /**
   * Construtor
   * @generated
   */
  public FilialBanco(){
  }


  /**
   * Obtém fbNumArquivoBanco
   * return fbNumArquivoBanco
   * @generated
   */
  
  public java.lang.Integer getFbNumArquivoBanco(){
    return this.fbNumArquivoBanco;
  }

  /**
   * Define fbNumArquivoBanco
   * @param fbNumArquivoBanco fbNumArquivoBanco
   * @generated
   */
  public FilialBanco setFbNumArquivoBanco(java.lang.Integer fbNumArquivoBanco){
    this.fbNumArquivoBanco = fbNumArquivoBanco;
    return this;
  }

  /**
   * Obtém filial
   * return filial
   * @generated
   */
  
  public Filial getFilial(){
    return this.filial;
  }

  /**
   * Define filial
   * @param filial filial
   * @generated
   */
  public FilialBanco setFilial(Filial filial){
    this.filial = filial;
    return this;
  }

  /**
   * Obtém idEmpresa
   * return idEmpresa
   * @generated
   */
  
  public java.lang.Integer getIdEmpresa(){
    return this.idEmpresa;
  }

  /**
   * Define idEmpresa
   * @param idEmpresa idEmpresa
   * @generated
   */
  public FilialBanco setIdEmpresa(java.lang.Integer idEmpresa){
    this.idEmpresa = idEmpresa;
    return this;
  }

  /**
   * Obtém idFilialBanco
   * return idFilialBanco
   * @generated
   */
  
  public java.lang.Integer getIdFilialBanco(){
    return this.idFilialBanco;
  }

  /**
   * Define idFilialBanco
   * @param idFilialBanco idFilialBanco
   * @generated
   */
  public FilialBanco setIdFilialBanco(java.lang.Integer idFilialBanco){
    this.idFilialBanco = idFilialBanco;
    return this;
  }

  /**
   * Obtém layout
   * return layout
   * @generated
   */
  
  public Layout getLayout(){
    return this.layout;
  }

  /**
   * Define layout
   * @param layout layout
   * @generated
   */
  public FilialBanco setLayout(Layout layout){
    this.layout = layout;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    FilialBanco object = (FilialBanco)obj;
    if (idFilialBanco != null ? !idFilialBanco.equals(object.idFilialBanco) : object.idFilialBanco != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idFilialBanco == null) ? 0 : idFilialBanco.hashCode());
    return result;
  }

}
