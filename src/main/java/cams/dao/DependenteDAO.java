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
@Repository("DependenteDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface DependenteDAO extends JpaRepository<Dependente, java.lang.Integer> {

  /**
   * Obtém a instância de Dependente utilizando os identificadores
   * 
   * @param idDependente
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Dependente entity WHERE entity.idDependente = :idDependente")
  public Dependente findOne(@Param(value="idDependente") java.lang.Integer idDependente);

  /**
   * Remove a instância de Dependente utilizando os identificadores
   * 
   * @param idDependente
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Dependente entity WHERE entity.idDependente = :idDependente")
  public void delete(@Param(value="idDependente") java.lang.Integer idDependente);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM GuiaMedica entity WHERE entity.dependente.idDependente = :idDependente")
  public Page<GuiaMedica> findGuiaMedica(@Param(value="idDependente") java.lang.Integer idDependente, Pageable pageable);

  /**
   * Foreign Key socio
   * @generated
   */
  @Query("SELECT entity FROM Dependente entity WHERE entity.socio.idSocio = :idSocio")
  public Page<Dependente> findDependentesBySocio(@Param(value="idSocio") java.lang.Integer idSocio, Pageable pageable);

  /**
   * Foreign Key tipoDependente
   * @generated
   */
  @Query("SELECT entity FROM Dependente entity WHERE entity.tipoDependente.idTipoDependente = :idTipoDependente")
  public Page<Dependente> findDependentesByTipoDependente(@Param(value="idTipoDependente") java.lang.Integer idTipoDependente, Pageable pageable);

}
