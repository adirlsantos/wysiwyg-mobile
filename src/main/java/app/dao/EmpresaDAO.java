package app.dao;

import app.entity.*;
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
@Repository("EmpresaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface EmpresaDAO extends JpaRepository<Empresa, java.lang.String> {

  /**
   * Obtém a instância de Empresa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Empresa entity WHERE entity.id = :id")
  public Empresa findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Empresa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Empresa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ClienteEmpresa entity WHERE entity.empresa.id = :id")
  public Page<ClienteEmpresa> findClienteEmpresa(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.cliente FROM ClienteEmpresa entity WHERE entity.empresa.id = :id")
  public Page<Cliente> listCliente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ClienteEmpresa entity WHERE entity.empresa.id = :instanceId AND entity.cliente.id = :relationId")
  public int deleteCliente(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
