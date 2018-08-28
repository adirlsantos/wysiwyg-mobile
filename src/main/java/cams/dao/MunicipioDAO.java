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
@Repository("MunicipioDAO")
@Transactional(transactionManager="cams-TransactionManager")
public interface MunicipioDAO extends JpaRepository<Municipio, java.lang.Integer> {

  /**
   * Obtém a instância de Municipio utilizando os identificadores
   * 
   * @param idMunicipio
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Municipio entity WHERE entity.idMunicipio = :idMunicipio")
  public Municipio findOne(@Param(value="idMunicipio") java.lang.Integer idMunicipio);

  /**
   * Remove a instância de Municipio utilizando os identificadores
   * 
   * @param idMunicipio
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Municipio entity WHERE entity.idMunicipio = :idMunicipio")
  public void delete(@Param(value="idMunicipio") java.lang.Integer idMunicipio);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Viuva entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Viuva> findViuva(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Filial entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Filial> findFilial(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Clinica entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Clinica> findClinica(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Socio entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Socio> findSocio(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Fornecedor entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Fornecedor> findFornecedor(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Funcionario entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Funcionario> findFuncionario(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.empresa FROM Filial entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Empresa> listEmpresa(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Filial entity WHERE entity.municipio.idMunicipio = :instanceIdMunicipio AND entity.empresa.idEmpresa = :relationIdEmpresa")
  public int deleteEmpresa(@Param(value="instanceIdMunicipio") java.lang.Integer instanceIdMunicipio, @Param(value="relationIdEmpresa") java.lang.Integer relationIdEmpresa);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.setor FROM Funcionario entity WHERE entity.municipio.idMunicipio = :idMunicipio")
  public Page<Setor> listSetor(@Param(value="idMunicipio") java.lang.Integer idMunicipio, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Funcionario entity WHERE entity.municipio.idMunicipio = :instanceIdMunicipio AND entity.setor.idSetor = :relationIdSetor")
  public int deleteSetor(@Param(value="instanceIdMunicipio") java.lang.Integer instanceIdMunicipio, @Param(value="relationIdSetor") java.lang.Integer relationIdSetor);

}
