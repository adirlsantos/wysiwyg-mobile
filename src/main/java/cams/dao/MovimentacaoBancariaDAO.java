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
@Repository("MovimentacaoBancariaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface MovimentacaoBancariaDAO extends JpaRepository<MovimentacaoBancaria, java.lang.Integer> {

  /**
   * Obtém a instância de MovimentacaoBancaria utilizando os identificadores
   * 
   * @param idLancamento
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM MovimentacaoBancaria entity WHERE entity.idLancamento = :idLancamento")
  public MovimentacaoBancaria findOne(@Param(value="idLancamento") java.lang.Integer idLancamento);

  /**
   * Remove a instância de MovimentacaoBancaria utilizando os identificadores
   * 
   * @param idLancamento
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM MovimentacaoBancaria entity WHERE entity.idLancamento = :idLancamento")
  public void delete(@Param(value="idLancamento") java.lang.Integer idLancamento);



  /**
   * Foreign Key contaCorrente
   * @generated
   */
  @Query("SELECT entity FROM MovimentacaoBancaria entity WHERE entity.contaCorrente.idContaCorrente = :idContaCorrente")
  public Page<MovimentacaoBancaria> findMovimentacaoBancariasByContaCorrente(@Param(value="idContaCorrente") java.lang.Integer idContaCorrente, Pageable pageable);

}
