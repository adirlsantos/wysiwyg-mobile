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
@Repository("ContribuicaoMensalViuvaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ContribuicaoMensalViuvaDAO extends JpaRepository<ContribuicaoMensalViuva, java.lang.Integer> {

  /**
   * Obtém a instância de ContribuicaoMensalViuva utilizando os identificadores
   * 
   * @param idContribuicao
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ContribuicaoMensalViuva entity WHERE entity.idContribuicao = :idContribuicao")
  public ContribuicaoMensalViuva findOne(@Param(value="idContribuicao") java.lang.Integer idContribuicao);

  /**
   * Remove a instância de ContribuicaoMensalViuva utilizando os identificadores
   * 
   * @param idContribuicao
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ContribuicaoMensalViuva entity WHERE entity.idContribuicao = :idContribuicao")
  public void delete(@Param(value="idContribuicao") java.lang.Integer idContribuicao);



  /**
   * Foreign Key viuva
   * @generated
   */
  @Query("SELECT entity FROM ContribuicaoMensalViuva entity WHERE entity.viuva.idViuva = :idViuva")
  public Page<ContribuicaoMensalViuva> findContribuicaoMensalViuvasByViuva(@Param(value="idViuva") java.lang.Integer idViuva, Pageable pageable);

}
