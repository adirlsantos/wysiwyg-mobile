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
@Repository("CentroCustoDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface CentroCustoDAO extends JpaRepository<CentroCusto, java.lang.Integer> {

  /**
   * Obtém a instância de CentroCusto utilizando os identificadores
   * 
   * @param idCusto
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM CentroCusto entity WHERE entity.idCusto = :idCusto")
  public CentroCusto findOne(@Param(value="idCusto") java.lang.Integer idCusto);

  /**
   * Remove a instância de CentroCusto utilizando os identificadores
   * 
   * @param idCusto
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM CentroCusto entity WHERE entity.idCusto = :idCusto")
  public void delete(@Param(value="idCusto") java.lang.Integer idCusto);



  /**
   * Foreign Key empresa
   * @generated
   */
  @Query("SELECT entity FROM CentroCusto entity WHERE entity.empresa.idEmpresa = :idEmpresa")
  public Page<CentroCusto> findCentroCustosByEmpresa(@Param(value="idEmpresa") java.lang.Integer idEmpresa, Pageable pageable);

}
