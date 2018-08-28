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
@Repository("LogRecordDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface LogRecordDAO extends JpaRepository<LogRecord, java.lang.String> {

  /**
   * Obtém a instância de LogRecord utilizando os identificadores
   * 
   * @param idLogRecord
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM LogRecord entity WHERE entity.idLogRecord = :idLogRecord")
  public LogRecord findOne(@Param(value="idLogRecord") java.lang.String idLogRecord);

  /**
   * Remove a instância de LogRecord utilizando os identificadores
   * 
   * @param idLogRecord
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM LogRecord entity WHERE entity.idLogRecord = :idLogRecord")
  public void delete(@Param(value="idLogRecord") java.lang.String idLogRecord);



}
