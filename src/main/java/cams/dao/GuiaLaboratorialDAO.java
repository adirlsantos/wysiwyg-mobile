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
@Repository("GuiaLaboratorialDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface GuiaLaboratorialDAO extends JpaRepository<GuiaLaboratorial, java.lang.Integer> {

  /**
   * Obtém a instância de GuiaLaboratorial utilizando os identificadores
   * 
   * @param idGuiaLaboratorio
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM GuiaLaboratorial entity WHERE entity.idGuiaLaboratorio = :idGuiaLaboratorio")
  public GuiaLaboratorial findOne(@Param(value="idGuiaLaboratorio") java.lang.Integer idGuiaLaboratorio);

  /**
   * Remove a instância de GuiaLaboratorial utilizando os identificadores
   * 
   * @param idGuiaLaboratorio
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM GuiaLaboratorial entity WHERE entity.idGuiaLaboratorio = :idGuiaLaboratorio")
  public void delete(@Param(value="idGuiaLaboratorio") java.lang.Integer idGuiaLaboratorio);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorialExame entity WHERE entity.guiaLaboratorial.idGuiaLaboratorio = :idGuiaLaboratorio")
  public Page<GuiaLaboratorialExame> findGuiaLaboratorialExame(@Param(value="idGuiaLaboratorio") java.lang.Integer idGuiaLaboratorio, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.exameLaboratorial FROM GuiaLaboratorialExame entity WHERE entity.guiaLaboratorial.idGuiaLaboratorio = :idGuiaLaboratorio")
  public Page<ExameLaboratorial> listExameLaboratorial(@Param(value="idGuiaLaboratorio") java.lang.Integer idGuiaLaboratorio, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM GuiaLaboratorialExame entity WHERE entity.guiaLaboratorial.idGuiaLaboratorio = :instanceIdGuiaLaboratorio AND entity.exameLaboratorial.idExameLaboratorial = :relationIdExameLaboratorial")
  public int deleteExameLaboratorial(@Param(value="instanceIdGuiaLaboratorio") java.lang.Integer instanceIdGuiaLaboratorio, @Param(value="relationIdExameLaboratorial") java.lang.Integer relationIdExameLaboratorial);

  /**
   * Foreign Key filial
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorial entity WHERE entity.filial.idFilial = :idFilial")
  public Page<GuiaLaboratorial> findGuiaLaboratorialsByFilial(@Param(value="idFilial") java.lang.Integer idFilial, Pageable pageable);

  /**
   * Foreign Key socio
   * @generated
   */
  @Query("SELECT entity FROM GuiaLaboratorial entity WHERE entity.socio.idSocio = :idSocio")
  public Page<GuiaLaboratorial> findGuiaLaboratorialsBySocio(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

}
