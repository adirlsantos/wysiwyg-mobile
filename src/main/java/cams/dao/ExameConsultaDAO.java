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
@Repository("ExameConsultaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface ExameConsultaDAO extends JpaRepository<ExameConsulta, java.lang.Integer> {

  /**
   * Obtém a instância de ExameConsulta utilizando os identificadores
   * 
   * @param idExameConsulta
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ExameConsulta entity WHERE entity.idExameConsulta = :idExameConsulta")
  public ExameConsulta findOne(@Param(value="idExameConsulta") java.lang.Integer idExameConsulta);

  /**
   * Remove a instância de ExameConsulta utilizando os identificadores
   * 
   * @param idExameConsulta
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ExameConsulta entity WHERE entity.idExameConsulta = :idExameConsulta")
  public void delete(@Param(value="idExameConsulta") java.lang.Integer idExameConsulta);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedicaExame entity WHERE entity.exameConsulta.idExameConsulta = :idExameConsulta")
  public Page<GuiaMedicaExame> findGuiaMedicaExame(@Param(value="idExameConsulta") java.lang.Integer idExameConsulta, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ClinicaExame entity WHERE entity.exameConsulta.idExameConsulta = :idExameConsulta")
  public Page<ClinicaExame> findClinicaExame(@Param(value="idExameConsulta") java.lang.Integer idExameConsulta, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.guiaMedica FROM GuiaMedicaExame entity WHERE entity.exameConsulta.idExameConsulta = :idExameConsulta")
  public Page<GuiaMedica> listGuiaMedica(@Param(value="idExameConsulta") java.lang.Integer idExameConsulta, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM GuiaMedicaExame entity WHERE entity.exameConsulta.idExameConsulta = :instanceIdExameConsulta AND entity.guiaMedica.idGuiaMedica = :relationIdGuiaMedica")
  public int deleteGuiaMedica(@Param(value="instanceIdExameConsulta") java.lang.Integer instanceIdExameConsulta, @Param(value="relationIdGuiaMedica") java.lang.Integer relationIdGuiaMedica);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.clinica FROM ClinicaExame entity WHERE entity.exameConsulta.idExameConsulta = :idExameConsulta")
  public Page<Clinica> listClinica(@Param(value="idExameConsulta") java.lang.Integer idExameConsulta, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ClinicaExame entity WHERE entity.exameConsulta.idExameConsulta = :instanceIdExameConsulta AND entity.clinica.idClinica = :relationIdClinica")
  public int deleteClinica(@Param(value="instanceIdExameConsulta") java.lang.Integer instanceIdExameConsulta, @Param(value="relationIdClinica") java.lang.Integer relationIdClinica);

}
