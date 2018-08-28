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
@Repository("ClinicaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ClinicaDAO extends JpaRepository<Clinica, java.lang.Integer> {

  /**
   * Obtém a instância de Clinica utilizando os identificadores
   * 
   * @param idClinica
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Clinica entity WHERE entity.idClinica = :idClinica")
  public Clinica findOne(@Param(value="idClinica") java.lang.Integer idClinica);

  /**
   * Remove a instância de Clinica utilizando os identificadores
   * 
   * @param idClinica
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Clinica entity WHERE entity.idClinica = :idClinica")
  public void delete(@Param(value="idClinica") java.lang.Integer idClinica);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ServicoPrestado entity WHERE entity.clinica.idClinica = :idClinica")
  public Page<ServicoPrestado> findServicoPrestado(@Param(value="idClinica") java.lang.Integer idClinica, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.clinica.idClinica = :idClinica")
  public Page<GuiaMedica> findGuiaMedica(@Param(value="idClinica") java.lang.Integer idClinica, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ClinicaExame entity WHERE entity.clinica.idClinica = :idClinica")
  public Page<ClinicaExame> findClinicaExame(@Param(value="idClinica") java.lang.Integer idClinica, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.exameConsulta FROM ClinicaExame entity WHERE entity.clinica.idClinica = :idClinica")
  public Page<ExameConsulta> listExameConsulta(@Param(value="idClinica") java.lang.Integer idClinica, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ClinicaExame entity WHERE entity.clinica.idClinica = :instanceIdClinica AND entity.exameConsulta.idExameConsulta = :relationIdExameConsulta")
  public int deleteExameConsulta(@Param(value="instanceIdClinica") java.lang.Integer instanceIdClinica, @Param(value="relationIdExameConsulta") java.lang.Integer relationIdExameConsulta);

  /**
   * Foreign Key atividadeMedica
   * @generated
   */
  @Query("SELECT entity FROM Clinica entity WHERE entity.atividadeMedica.idAtividadeMedica = :idAtividadeMedica")
  public Page<Clinica> findClinicasByAtividadeMedica(@Param(value="idAtividadeMedica") java.lang.Integer idAtividadeMedica, Pageable pageable);

  /**
   * Foreign Key empresa
   * @generated
   */
  @Query("SELECT entity FROM Clinica entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<Clinica> findClinicasByEmpresa(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);

  /**
   * Foreign Key municipio
   * @generated
   */
  @Query("SELECT entity FROM Clinica entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Clinica> findClinicasByMunicipio(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

}
