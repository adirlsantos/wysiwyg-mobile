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
@Repository("ClinicaExameDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ClinicaExameDAO extends JpaRepository<ClinicaExame, java.lang.Integer> {

  /**
   * Obtém a instância de ClinicaExame utilizando os identificadores
   * 
   * @param idClinicaExame
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ClinicaExame entity WHERE entity.idClinicaExame = :idClinicaExame")
  public ClinicaExame findOne(@Param(value="idClinicaExame") java.lang.Integer idClinicaExame);

  /**
   * Remove a instância de ClinicaExame utilizando os identificadores
   * 
   * @param idClinicaExame
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ClinicaExame entity WHERE entity.idClinicaExame = :idClinicaExame")
  public void delete(@Param(value="idClinicaExame") java.lang.Integer idClinicaExame);



  /**
   * Foreign Key clinica
   * @generated
   */
  @Query("SELECT entity FROM ClinicaExame entity WHERE entity.clinica.idClinica = :idClinica")
  public Page<ClinicaExame> findClinicaExamesByClinica(@Param(value="idClinica") java.lang.Integer idClinica, Pageable pageable);

  /**
   * Foreign Key exameConsulta
   * @generated
   */
  @Query("SELECT entity FROM ClinicaExame entity WHERE entity.exameConsulta.idExameConsulta = :idExameConsulta")
  public Page<ClinicaExame> findClinicaExamesByExameConsulta(@Param(value="idExameConsulta") java.lang.Integer idExameConsulta, Pageable pageable);

}
