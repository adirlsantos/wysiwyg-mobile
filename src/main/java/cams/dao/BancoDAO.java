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
@Repository("BancoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface BancoDAO extends JpaRepository<Banco, java.lang.Integer> {

  /**
   * Obtém a instância de Banco utilizando os identificadores
   * 
   * @param idBanco
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Banco entity WHERE entity.idBanco = :idBanco")
  public Banco findOne(@Param(value="idBanco") java.lang.Integer idBanco);

  /**
   * Remove a instância de Banco utilizando os identificadores
   * 
   * @param idBanco
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Banco entity WHERE entity.idBanco = :idBanco")
  public void delete(@Param(value="idBanco") java.lang.Integer idBanco);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Agencia entity WHERE entity.banco.idBanco = :idBanco")
  public Page<Agencia> findAgencia(@Param(value="idBanco") java.lang.Integer idBanco, Pageable pageable);

}
