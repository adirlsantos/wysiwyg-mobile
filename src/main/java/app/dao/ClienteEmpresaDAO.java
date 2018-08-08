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
@Repository("ClienteEmpresaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ClienteEmpresaDAO extends JpaRepository<ClienteEmpresa, java.lang.String> {

  /**
   * Obtém a instância de ClienteEmpresa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ClienteEmpresa entity WHERE entity.id = :id")
  public ClienteEmpresa findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ClienteEmpresa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ClienteEmpresa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select ce from ClienteEmpresa ce")
  public Page<ClienteEmpresa> list(Pageable pageable);
  


  /**
   * Foreign Key cliente
   * @generated
   */
  @Query("SELECT entity FROM ClienteEmpresa entity WHERE entity.cliente.id = :id")
  public Page<ClienteEmpresa> findClienteEmpresasByCliente(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key empresa
   * @generated
   */
  @Query("SELECT entity FROM ClienteEmpresa entity WHERE entity.empresa.id = :id")
  public Page<ClienteEmpresa> findClienteEmpresasByEmpresa(@Param(value="id") java.lang.String id, Pageable pageable);

}
