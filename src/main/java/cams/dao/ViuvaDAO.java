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
@Repository("ViuvaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ViuvaDAO extends JpaRepository<Viuva, java.lang.Integer> {

  /**
   * Obtém a instância de Viuva utilizando os identificadores
   * 
   * @param idViuva
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Viuva entity WHERE entity.idViuva = :idViuva")
  public Viuva findOne(@Param(value="idViuva") java.lang.Integer idViuva);

  /**
   * Remove a instância de Viuva utilizando os identificadores
   * 
   * @param idViuva
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Viuva entity WHERE entity.idViuva = :idViuva")
  public void delete(@Param(value="idViuva") java.lang.Integer idViuva);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ContribuicaoMensalViuva entity WHERE entity.viuva.idViuva = :idViuva")
  public Page<ContribuicaoMensalViuva> findContribuicaoMensalViuva(@Param(value="idViuva") java.lang.Integer idViuva, Pageable pageable);

  /**
   * Foreign Key motivoAfastamento
   * @generated
   */
  @Query("SELECT entity FROM Viuva entity WHERE entity.motivoAfastamento.idMotivoAfastamento = :idMotivoAfastamento")
  public Page<Viuva> findViuvasByMotivoAfastamento(@Param(value="idMotivoAfastamento") java.lang.Integer idMotivoAfastamento, Pageable pageable);

  /**
   * Foreign Key municipio
   * @generated
   */
  @Query("SELECT entity FROM Viuva entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Viuva> findViuvasByMunicipio(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * Foreign Key parentesco
   * @generated
   */
  @Query("SELECT entity FROM Viuva entity WHERE entity.parentesco.idParentesco = :idParentesco")
  public Page<Viuva> findViuvasByParentesco(@Param(value="idParentesco") java.lang.Integer idParentesco, Pageable pageable);

  /**
   * Foreign Key socio
   * @generated
   */
  @Query("SELECT entity FROM Viuva entity WHERE entity.socio.idSocio = :idSocio")
  public Page<Viuva> findViuvasBySocio(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

}
