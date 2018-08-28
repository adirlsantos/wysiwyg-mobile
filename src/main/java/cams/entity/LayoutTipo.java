package cams.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LAYOUT_TIPO
 * @generated
 */
@Entity
@Table(name = "\"LAYOUT_TIPO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("cams.entity.LayoutTipo")
public class LayoutTipo implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "ID_LAYOUT_TIPO", nullable = false, length=255, insertable=true, updatable=true)
  private java.lang.Integer idLayoutTipo;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="ID_LAYOUT", nullable = false, referencedColumnName = "ID_LAYOUT", insertable=true, updatable=true)
  
  private Layout layout;

  /**
  * @generated
  */
  @Column(name = "LT_ORDEM", nullable = false, unique = false, length=1, insertable=true, updatable=true)
  
  private java.lang.Integer ltOrdem;

  /**
  * @generated
  */
  @Column(name = "LT_TIPO_REGISTRO", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String ltTipoRegistro;

  /**
   * Construtor
   * @generated
   */
  public LayoutTipo(){
  }


  /**
   * Obtém idLayoutTipo
   * return idLayoutTipo
   * @generated
   */
  
  public java.lang.Integer getIdLayoutTipo(){
    return this.idLayoutTipo;
  }

  /**
   * Define idLayoutTipo
   * @param idLayoutTipo idLayoutTipo
   * @generated
   */
  public LayoutTipo setIdLayoutTipo(java.lang.Integer idLayoutTipo){
    this.idLayoutTipo = idLayoutTipo;
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
  public LayoutTipo setLayout(Layout layout){
    this.layout = layout;
    return this;
  }

  /**
   * Obtém ltOrdem
   * return ltOrdem
   * @generated
   */
  
  public java.lang.Integer getLtOrdem(){
    return this.ltOrdem;
  }

  /**
   * Define ltOrdem
   * @param ltOrdem ltOrdem
   * @generated
   */
  public LayoutTipo setLtOrdem(java.lang.Integer ltOrdem){
    this.ltOrdem = ltOrdem;
    return this;
  }

  /**
   * Obtém ltTipoRegistro
   * return ltTipoRegistro
   * @generated
   */
  
  public java.lang.String getLtTipoRegistro(){
    return this.ltTipoRegistro;
  }

  /**
   * Define ltTipoRegistro
   * @param ltTipoRegistro ltTipoRegistro
   * @generated
   */
  public LayoutTipo setLtTipoRegistro(java.lang.String ltTipoRegistro){
    this.ltTipoRegistro = ltTipoRegistro;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    LayoutTipo object = (LayoutTipo)obj;
    if (idLayoutTipo != null ? !idLayoutTipo.equals(object.idLayoutTipo) : object.idLayoutTipo != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((idLayoutTipo == null) ? 0 : idLayoutTipo.hashCode());
    return result;
  }

}
