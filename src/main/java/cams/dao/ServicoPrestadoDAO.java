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
@Repository("ServicoPrestadoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ServicoPrestadoDAO extends JpaRepository<ServicoPrestado, java.lang.Integer> {

  /**
   * Obtém a instância de ServicoPrestado utilizando os identificadores
   * 
   * @param idServicoPrestado
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ServicoPrestado entity WHERE entity.idServicoPrestado = :idServicoPrestado")
  public ServicoPrestado findOne(@Param(value="idServicoPrestado") java.lang.Integer idServicoPrestado);

  /**
   * Remove a instância de ServicoPrestado utilizando os identificadores
   * 
   * @param idServicoPrestado
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ServicoPrestado entity WHERE entity.idServicoPrestado = :idServicoPrestado")
  public void delete(@Param(value="idServicoPrestado") java.lang.Integer idServicoPrestado);



  /**
   * Foreign Key clinica
   * @generated
   */
  @Query("SELECT entity FROM ServicoPrestado entity WHERE entity.clinica.idClinica = :idClinica")
  public Page<ServicoPrestado> findServicoPrestadosByClinica(@Param(value="idClinica") java.lang.Integer idClinica, Pageable pageable);

}
