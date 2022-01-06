package fh.burgenland.moveme.inquiry.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReferenceNumberTest {

    @Test
    public void should_contain_type_name_town() {
        ReferenceNumber rn = ReferenceNumber.localReferenceNumberOf("Andi Mut", "Wien");

        assertThat(rn.getValue()).isEqualTo("IFLM_ANDI_MUT_WIEN");
    }
}
