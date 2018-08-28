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
@Repository("AgenciaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface AgenciaDAO extends JpaRepository<Agencia, java.lang.Integer> {

  /**
   * Obtém a instância de Agencia utilizando os identificadores
   * 
   * @param idAgencia
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Agencia entity WHERE entity.idAgencia = :idAgencia")
  public Agencia findOne(@Param(value="idAgencia") java.lang.Integer idAgencia);

  /**
   * Remove a instância de Agencia utilizando os identificadores
   * 
   * @param idAgencia
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Agencia entity WHERE entity.idAgencia = :idAgencia")
  public void delete(@Param(value="idAgencia") java.lang.Integer idAgencia);



  /**
   * Foreign Key banco
   * @generated
   */
  @Query("SELECT entity FROM Agencia entity WHERE entity.banco.idBanco = :idBanco")
  public Page<Agencia> findAgenciasByBanco(@Param(value="idBanco") java.lang.Integer idBanco, Pageable pageable);

}
