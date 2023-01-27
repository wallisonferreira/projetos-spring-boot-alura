package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    // filter an attribute of a relationship table: curso property: nome
    List<Topico> findByCursoNome(String nomeCurso);

    // to solve ambiguity problem between name colum and relationship
    // List<Topico> findByCurso_Nome(String nomeCurso);

    // custom query with JPQL
    // @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
    // List<Topico> carregarPorNomeCurso(@Param("nomeCurso") String nomeCurso);
}
