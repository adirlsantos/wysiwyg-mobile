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
@Repository("MotivoAfastamentoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface MotivoAfastamentoDAO extends JpaRepository<MotivoAfastamento, java.lang.Integer> {

  /**
   * Obtém a instância de MotivoAfastamento utilizando os identificadores
   * 
   * @param idMotivoAfastamento
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM MotivoAfastamento entity WHERE entity.idMotivoAfastamento = :idMotivoAfastamento")
  public MotivoAfastamento findOne(@Param(value="idMotivoAfastamento") java.lang.Integer idMotivoAfastamento);

  /**
   * Remove a instância de MotivoAfastamento utilizando os identificadores
   * 
   * @param idMotivoAfastamento
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM MotivoAfastamento entity WHERE entity.idMotivoAfastamento = :idMotivoAfastamento")
  public void delete(@Param(value="idMotivoAfastamento") java.lang.Integer idMotivoAfastamento);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Viuva entity WHERE entity.motivoAfastamento.idMotivoAfastamento = :idMotivoAfastamento")
  public Page<Viuva> findViuva(@Param(value="idMotivoAfastamento") java.lang.Integer idMotivoAfastamento, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.motivoAfastamento.idMotivoAfastamento = :idMotivoAfastamento")
  public Page<Socio> findSocio(@Param(value="idMotivoAfastamento") java.lang.Integer idMotivoAfastamento, Pageable pageable);

}
