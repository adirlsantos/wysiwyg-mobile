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
@Repository("ParentescoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ParentescoDAO extends JpaRepository<Parentesco, java.lang.Integer> {

  /**
   * Obtém a instância de Parentesco utilizando os identificadores
   * 
   * @param idParentesco
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Parentesco entity WHERE entity.idParentesco = :idParentesco")
  public Parentesco findOne(@Param(value="idParentesco") java.lang.Integer idParentesco);

  /**
   * Remove a instância de Parentesco utilizando os identificadores
   * 
   * @param idParentesco
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Parentesco entity WHERE entity.idParentesco = :idParentesco")
  public void delete(@Param(value="idParentesco") java.lang.Integer idParentesco);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Viuva entity WHERE entity.parentesco.idParentesco = :idParentesco")
  public Page<Viuva> findViuva(@Param(value="idParentesco") java.lang.Integer idParentesco, Pageable pageable);

}
