package fh.burgenland.moveme.infrastructure.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DomainResult<T> {
    T success;
    String error;
}
