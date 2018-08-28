package cams.dao;

import cams.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("FilialDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface FilialDAO extends JpaRepository<Filial, java.lang.Integer> {

  /**
   * Obtém a instância de Filial utilizando os identificadores
   * 
   * @param idFilial
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Filial entity WHERE entity.idFilial = :idFilial")
  public Filial findOne(@Param(value="idFilial") java.lang.Integer idFilial);

  /**
   * Remove a instância de Filial utilizando os identificadores
   * 
   * @param idFilial
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Filial entity WHERE entity.idFilial = :idFilial")
  public void delete(@Param(value="idFilial") java.lang.Integer idFilial);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.filial.idFilial = :idFilial")
  public Page<GuiaMedica> findGuiaMedica(@Param(value="idFilial") java.lang.Integer idFilial, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM FilialBanco entity WHERE entity.filial.idFilial = :idFilial")
  public Page<FilialBanco> findFilialBanco(@Param(value="idFilial") java.lang.Integer idFilial, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorial entity WHERE entity.filial.idFilial = :idFilial")
  public Page<GuiaLaboratorial> findGuiaLaboratorial(@Param(value="idFilial") java.lang.Integer idFilial, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.layout FROM FilialBanco entity WHERE entity.filial.idFilial = :idFilial")
  public Page<Layout> listLayout(@Param(value="idFilial") java.lang.Integer idFilial, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM FilialBanco entity WHERE entity.filial.idFilial = :instanceIdFilial AND entity.layout.idLayout = :relationIdLayout")
  public int deleteLayout(@Param(value="instanceIdFilial") java.lang.Integer instanceIdFilial, @Param(value="relationIdLayout") java.lang.Integer relationIdLayout);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.socio FROM GuiaLaboratorial entity WHERE entity.filial.idFilial = :idFilial")
  public Page<Socio> listSocio(@Param(value="idFilial") java.lang.Integer idFilial, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM GuiaLaboratorial entity WHERE entity.filial.idFilial = :instanceIdFilial AND entity.socio.idSocio = :relationIdSocio")
  public int deleteSocio(@Param(value="instanceIdFilial") java.lang.Integer instanceIdFilial, @Param(value="relationIdSocio") java.lang.Integer relationIdSocio);

  /**
   * Foreign Key empresa
   * @generated
   */
  @Query("SELECT entity FROM Filial entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<Filial> findFilialsByEmpresa(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);

  /**
   * Foreign Key municipio
   * @generated
   */
  @Query("SELECT entity FROM Filial entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Filial> findFilialsByMunicipio(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

}
