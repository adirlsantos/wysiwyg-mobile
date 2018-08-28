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
@Repository("ContaCorrenteDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ContaCorrenteDAO extends JpaRepository<ContaCorrente, java.lang.Integer> {

  /**
   * Obtém a instância de ContaCorrente utilizando os identificadores
   * 
   * @param idContaCorrente
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ContaCorrente entity WHERE entity.idContaCorrente = :idContaCorrente")
  public ContaCorrente findOne(@Param(value="idContaCorrente") java.lang.Integer idContaCorrente);

  /**
   * Remove a instância de ContaCorrente utilizando os identificadores
   * 
   * @param idContaCorrente
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ContaCorrente entity WHERE entity.idContaCorrente = :idContaCorrente")
  public void delete(@Param(value="idContaCorrente") java.lang.Integer idContaCorrente);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM MovimentacaoBancaria entity WHERE entity.contaCorrente.idContaCorrente = :idContaCorrente")
  public Page<MovimentacaoBancaria> findMovimentacaoBancaria(@Param(value="idContaCorrente") java.lang.Integer idContaCorrente, Pageable pageable);

}
