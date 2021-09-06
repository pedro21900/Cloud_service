package labsdio.productcatalog.repository;

import labsdio.productcatalog.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, Long> {
}