package nttdata.bootcamp.microservicios.representante.empresarial.services;

import nttdata.bootcamp.microservicios.representante.empresarial.document.BusinessRepresentative;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BusinessRepresentativeService {

	public Mono<BusinessRepresentative> findById(String id);

	public Flux<BusinessRepresentative> findAlls();

	public Mono<BusinessRepresentative> saves(BusinessRepresentative document);

	public Mono<Void> delete(BusinessRepresentative document);

}
