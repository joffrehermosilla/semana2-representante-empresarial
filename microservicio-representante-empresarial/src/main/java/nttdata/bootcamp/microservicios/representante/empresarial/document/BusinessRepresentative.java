package nttdata.bootcamp.microservicios.representante.empresarial.document;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "business-representative")
public class BusinessRepresentative {
	@Id
	private String id;

	private String name;

	private String dni;

	private Boolean isAccountholder;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
}
