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
@Repository("EmpresaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface EmpresaDAO extends JpaRepository<Empresa, java.lang.Integer> {

  /**
   * Obtém a instância de Empresa utilizando os identificadores
   * 
   * @param idEmpresa
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Empresa entity WHERE entity.idEmpresa = :idEmpresa")
  public Empresa findOne(@Param(value="idEmpresa") java.lang.Integer idEmpresa);

  /**
   * Remove a instância de Empresa utilizando os identificadores
   * 
   * @param idEmpresa
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Empresa entity WHERE entity.idEmpresa = :idEmpresa")
  public void delete(@Param(value="idEmpresa") java.lang.Integer idEmpresa);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Filial entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<Filial> findFilial(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Clinica entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<Clinica> findClinica(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM CentroCusto entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<CentroCusto> findCentroCusto(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<Socio> findSocio(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.municipio FROM Filial entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<Municipio> listMunicipio(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Filial entity WHERE entity.empresa.idEmpresa = :instanceIdEmpresa AND entity.municipio.idMunicipio = :relationIdMunicipio")
  public int deleteMunicipio(@Param(value="instanceIdEmpresa") java.lang.Integer instanceIdEmpresa, @Param(value="relationIdMunicipio") java.lang.Integer relationIdMunicipio);

}
