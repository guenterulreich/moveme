package fh.burgenland.moveme.inquiry.persistence;

import fh.burgenland.moveme.inquiry.domain.InquiryForLocalMoveDomain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryForLocalMoveRepository extends CrudRepository<InquiryForLocalMoveDomain, Long> {}
