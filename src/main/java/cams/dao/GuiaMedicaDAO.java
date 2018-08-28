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
@Repository("GuiaMedicaDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface GuiaMedicaDAO extends JpaRepository<GuiaMedica, java.lang.Integer> {

  /**
   * Obtém a instância de GuiaMedica utilizando os identificadores
   * 
   * @param idGuiaMedica
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.idGuiaMedica = :idGuiaMedica")
  public GuiaMedica findOne(@Param(value="idGuiaMedica") java.lang.Integer idGuiaMedica);

  /**
   * Remove a instância de GuiaMedica utilizando os identificadores
   * 
   * @param idGuiaMedica
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM GuiaMedica entity WHERE entity.idGuiaMedica = :idGuiaMedica")
  public void delete(@Param(value="idGuiaMedica") java.lang.Integer idGuiaMedica);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedicaExame entity WHERE entity.guiaMedica.idGuiaMedica = :idGuiaMedica")
  public Page<GuiaMedicaExame> findGuiaMedicaExame(@Param(value="idGuiaMedica") java.lang.Integer idGuiaMedica, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.exameConsulta FROM GuiaMedicaExame entity WHERE entity.guiaMedica.idGuiaMedica = :idGuiaMedica")
  public Page<ExameConsulta> listExameConsulta(@Param(value="idGuiaMedica") java.lang.Integer idGuiaMedica, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM GuiaMedicaExame entity WHERE entity.guiaMedica.idGuiaMedica = :instanceIdGuiaMedica AND entity.exameConsulta.idExameConsulta = :relationIdExameConsulta")
  public int deleteExameConsulta(@Param(value="instanceIdGuiaMedica") java.lang.Integer instanceIdGuiaMedica, @Param(value="relationIdExameConsulta") java.lang.Integer relationIdExameConsulta);

  /**
   * Foreign Key clinica
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.clinica.idClinica = :idClinica")
  public Page<GuiaMedica> findGuiaMedicasByClinica(@Param(value="idClinica") java.lang.Integer idClinica, Pageable pageable);

  /**
   * Foreign Key filial
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.filial.idFilial = :idFilial")
  public Page<GuiaMedica> findGuiaMedicasByFilial(@Param(value="idFilial") java.lang.Integer idFilial, Pageable pageable);

  /**
   * Foreign Key socio
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.socio.idSocio = :idSocio")
  public Page<GuiaMedica> findGuiaMedicasBySocio(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * Foreign Key dependente
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.dependente.idDependente = :idDependente")
  public Page<GuiaMedica> findGuiaMedicasByDependente(@Param(value="idDependente") java.lang.Integer idDependente, Pageable pageable);

}
