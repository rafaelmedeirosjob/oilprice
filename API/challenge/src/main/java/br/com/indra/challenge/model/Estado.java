package br.com.indra.challenge.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Estado {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sigla;
	private String regiao;
	@OneToMany(mappedBy="estado")
	private List<Municipio> municipios = new ArrayList<>();
}
