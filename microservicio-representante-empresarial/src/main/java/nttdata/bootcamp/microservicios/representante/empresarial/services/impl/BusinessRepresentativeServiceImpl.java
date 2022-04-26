package nttdata.bootcamp.microservicios.representante.empresarial.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nttdata.bootcamp.microservicios.representante.empresarial.document.BusinessRepresentative;
import nttdata.bootcamp.microservicios.representante.empresarial.repository.BusinessRepresentativeRepository;
import nttdata.bootcamp.microservicios.representante.empresarial.services.BusinessRepresentativeService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BusinessRepresentativeServiceImpl implements BusinessRepresentativeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BusinessRepresentativeServiceImpl.class);
	@Autowired
	BusinessRepresentativeRepository repository;

	@Override
	public Mono<BusinessRepresentative> findById(String id) {

		return repository.findById(id);
	}

	@Override
	public Flux<BusinessRepresentative> findAlls() {

		return repository.findAll();
	}

	@Override
	public Mono<BusinessRepresentative> saves(BusinessRepresentative document) {

		return repository.save(document);
	}

	@Override
	public Mono<Void> delete(BusinessRepresentative document) {

		return repository.delete(document);
	}

}
