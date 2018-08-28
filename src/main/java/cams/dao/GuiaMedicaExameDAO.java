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
@Repository("GuiaMedicaExameDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface GuiaMedicaExameDAO extends JpaRepository<GuiaMedicaExame, java.lang.Integer> {

  /**
   * Obtém a instância de GuiaMedicaExame utilizando os identificadores
   * 
   * @param idGuiaMedicaExame
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM GuiaMedicaExame entity WHERE entity.idGuiaMedicaExame = :idGuiaMedicaExame")
  public GuiaMedicaExame findOne(@Param(value="idGuiaMedicaExame") java.lang.Integer idGuiaMedicaExame);

  /**
   * Remove a instância de GuiaMedicaExame utilizando os identificadores
   * 
   * @param idGuiaMedicaExame
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM GuiaMedicaExame entity WHERE entity.idGuiaMedicaExame = :idGuiaMedicaExame")
  public void delete(@Param(value="idGuiaMedicaExame") java.lang.Integer idGuiaMedicaExame);



  /**
   * Foreign Key exameConsulta
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedicaExame entity WHERE entity.exameConsulta.idExameConsulta = :idExameConsulta")
  public Page<GuiaMedicaExame> findGuiaMedicaExamesByExameConsulta(@Param(value="idExameConsulta") java.lang.Integer idExameConsulta, Pageable pageable);

  /**
   * Foreign Key guiaMedica
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedicaExame entity WHERE entity.guiaMedica.idGuiaMedica = :idGuiaMedica")
  public Page<GuiaMedicaExame> findGuiaMedicaExamesByGuiaMedica(@Param(value="idGuiaMedica") java.lang.Integer idGuiaMedica, Pageable pageable);

}
