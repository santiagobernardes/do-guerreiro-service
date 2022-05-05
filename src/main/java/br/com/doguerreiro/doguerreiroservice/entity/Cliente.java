package br.com.doguerreiro.doguerreiroservice.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class Cliente {
    private Integer id;
    private Integer idade;
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private LocalDateTime dataCadastro;
    private String cidade;
}
